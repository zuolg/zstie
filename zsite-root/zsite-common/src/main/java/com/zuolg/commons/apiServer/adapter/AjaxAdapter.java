package com.zuolg.commons.apiServer.adapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.AbstractJsonpResponseBodyAdvice;

import com.alibaba.fastjson.JSON;
import com.zuolg.commons.apiServer.beans.ApiMethodInfo;
import com.zuolg.commons.apiServer.utils.ExceptionUtil;
import com.zuolg.commons.exception.ApiNotFoundException;
import com.zuolg.commons.exception.BaseApiException;
import com.zuolg.commons.response.BaseResponse;
import com.zuolg.commons.utils.BinderUtil;
import com.zuolg.commons.utils.StringUtils; 

/**
 * <pre>
 * Ajax接入方式的基类，用的是spring mvc
 * 
 * 带有自动判断JSONP的功能。
 * 其实 JSONP的判断可以直接用 {@link AbstractJsonpResponseBodyAdvice}，但这个类会导致界面不好看...
 * 在这个 颜值就是正义 的世界，我们还是做好看点吧。
 * 
 * </pre>
 * 
 */
public abstract class AjaxAdapter extends BaseApiServerAdapter {

	private final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(this.getClass());

	/**
	 * 用于自动判断是否是jsonp的情况
	 */
	protected String getJsonpParamName() {
		return "callback";
	}

	/**
	 * 进入invoke时，先执行一个钩子方法，让子类有更过的空间增加功能
	 * 
	 * @param req
	 *            req
	 * @param resp
	 *            resp
	 * @param methodInfo
	 *            ApiMethodInfo
	 */
	protected void onBeforeInvoke(HttpServletRequest req, HttpServletResponse resp, ApiMethodInfo methodInfo)
			throws BaseApiException {

	}

	@RequestMapping(value = "/{infName}/{methodName}")
	@ResponseBody
	public String invoke(@PathVariable String infName, @PathVariable String methodName, HttpServletRequest req,
			HttpServletResponse resp) {

		/** Ajax跨域header */
		resp.setHeader("Cache-Control", "no-cache");
		resp.setHeader("Access-Control-Allow-Origin", "*");
		resp.setHeader("Access-Control-Allow-Headers", "x-requested-with");

		ApiMethodInfo methodInfo = ApiMapContainer.getInstance().findApiMethod(infName, methodName);

		BaseResponse res = null;
		Object param = null;

		long start = System.currentTimeMillis();
		try {
			try {
				if (methodInfo == null) {
					// 找不到api就直接抛错
					throw new ApiNotFoundException(infName, methodName);
				}

				if (log.isDebugEnabled()) {
					StringBuffer sb = new StringBuffer();
					//WebUtils.debugRequest(req, sb);

					log.debug("准备调用接口: {}/{} \n\tRequest中的信息:{}", infName, methodName, sb.toString());
				}

				// 进入方法时，先执行一个方法，看看是否要处理一下HttpRequest的东西
				this.onBeforeInvoke(req, resp, methodInfo);

				if (methodInfo.hasParam()) {
					// 如果该接口有参数，就从http请求绑定参数
					param = BinderUtil.bindForm(req, methodInfo.getFormClass(), methodInfo.isSaveFormToSession());
				}

				// 执行接口方法
				res = methodInfo.invoke(param);

				if (res == null && this.isNeedCreateMockData()) {
					// 如果为null ,并且要生成模拟数据
					res = methodInfo.createMockData();
				}
			} catch (Exception e) {
				res = ExceptionUtil.getErrorResponse(resp, e, log.isDebugEnabled());
			}

			return this.detectJsonp(res, req);
		} finally {

			long end = System.currentTimeMillis();

			if (log.isDebugEnabled()) {
				String paramStr = null;
				if (param != null && !methodInfo.isUploadFile()) {
					// 如果接口有上传文件，不能随便将表单 toJsonString，如果上传个1M的文件...
					paramStr = JSON.toJSONString(param, true);
				}

				String responseStr = res == null ? null : JSON.toJSONString(res, true);
				log.debug("调用接口: {}/{} 时间消耗 :{}ms \n绑定表单的结果:{} \n返回内容:{}",
						infName, methodName, end - start, paramStr, responseStr);
			}
		}
	}

	/**
	 * 当调用接口返还的数据为null时，是否需要生成mock数据，方便开发
	 * 
	 * @return boolean
	 */
	protected abstract boolean isNeedCreateMockData();

	private String detectJsonp(BaseResponse res, HttpServletRequest request) {
		if (res == null) {
			return null;
		}

		String body = JSON.toJSONString(res, true);
		// 获取jsonp callback的函数名
		String callbackName = request.getParameter(getJsonpParamName());

		if (StringUtils.hasText(callbackName)) {
			// 如果是 jsonp的请求，就包装一下
			return String.format("%s(%s);", callbackName, body);
		} else {
			// 如果不是jsonp,就直接返回内容
			return body;
		}
	}

}
