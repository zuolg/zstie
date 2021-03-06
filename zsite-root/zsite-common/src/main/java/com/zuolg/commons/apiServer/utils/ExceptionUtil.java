package com.zuolg.commons.apiServer.utils;

import java.lang.reflect.InvocationTargetException;

import javax.servlet.http.HttpServletResponse;

import com.zuolg.commons.exception.BaseApiException;
import com.zuolg.commons.exception.MissFieldException;
import com.zuolg.commons.exception.SystemErrorException;
import com.zuolg.commons.exception.ValidateFormException;
import com.zuolg.commons.response.CommonErrorResponse;
import com.zuolg.commons.utils.StringUtils;
 

/**
 * 用于抛错的工具
 * @ClassName ExceptionUtil
 * @author zuolangguo
 * @date 2016年11月22日 上午11:52:53
 */
public class ExceptionUtil {

	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(ExceptionUtil.class);

	public static void notNull(Object obj, String message) throws MissFieldException {
		if (obj == null) {
			throw new MissFieldException(message);
		}
	}

	public static void hasText(String str, String message) throws MissFieldException {
		if (StringUtils.isEmpty(str)) {
			throw new MissFieldException(message);
		}
	}

	public static void notZero(int value, String message) throws MissFieldException {
		if (value <= 0) {
			throw new MissFieldException(message);
		}
	}

	/**
	 * 根据错误信息，返回不同类型的 json返回
	 */
	public static CommonErrorResponse getErrorResponse(HttpServletResponse response, Throwable exParam, boolean debugMode) {
		CommonErrorResponse res;

		int statusCode = 500;

		if (exParam == null) {
			res = new CommonErrorResponse();
			res.setErrorMsg("未知错误");
		} else {
			Throwable e = exParam;
			if (e instanceof InvocationTargetException) {
				// 如果类型是 InvocationTargetException， 里面的类型才是真正的错误
				e = ((InvocationTargetException) exParam).getTargetException();
			}

			if (e instanceof BaseApiException) {

				BaseApiException e1 = (BaseApiException) e;

				statusCode = e1.getHttpStatusCode();

				log.debug("调用api时发生逻辑错误: {} ", e1.getErrorMsg());

				// 如果是逻辑错误，就将逻辑错误变成response
				res = new CommonErrorResponse(e1);

			} else if (e instanceof ValidateFormException) {
				log.debug("调用api, 表单验证不通过 ");
				res = new CommonErrorResponse((ValidateFormException) e);
			} else {
				// 其他错误时，返回系统错误
				
				System.out.println("调用api时发生其他错误 ");
				res = getSystemErrorResponse(e, debugMode);
			}
		}

		response.setStatus(statusCode);

		return res;
	}

	/**
	 * 系统运行时错误
	 * 
	 * @param ex
	 *            Throwable
	 * @param debugMode
	 * 
	 * @return CommonErrorResponse
	 */
	private static CommonErrorResponse getSystemErrorResponse(Throwable ex, boolean debugMode) {

		SystemErrorException error = new SystemErrorException(ex);
		CommonErrorResponse res = new CommonErrorResponse(error);

		if (debugMode) {
			// 如果是开发模式，将调查错误过程回馈给客户端
			String str = ex.getMessage();
			// 过滤掉中间 \t \r \n 之类的字符
			res.setDebugMsg(StringUtils.trimMiddleWhitespace(str));
		}
		return res;

	}
}
