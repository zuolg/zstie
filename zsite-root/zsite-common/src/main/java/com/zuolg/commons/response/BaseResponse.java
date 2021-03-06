package com.zuolg.commons.response;

import com.zuolg.commons.annotation.api.AMock;

/**
 * 响应返回结果基类
 * 
 *  2016年5月10日 下午2:01:17
 */
public abstract class BaseResponse {

	public final static String DATE_FORMATTER = "yyyy-MM-dd HH:mm:ss";

	/**
	 * 返回结果，成功是不需要判断，错误时这里是错误代码
	 */
	private String code = "200";
	
	/**
	 * 开发时，调试用
	 */
	private String debugMsg;

	/**
	 * 必须有 message这个属性在基类，否则android 客户端没法用
	 */
	private String message;

	@AMock(value = "200")
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * 是否成功, SHH那边的ok标志是 1 ， 真是要吐血了
	 * 
	 * @return success
	 */
	public boolean isSuccess() {
		return "200".equals(code) || "1".equals(code);
	}

	@AMock(value = "调试模式才有的信息")
	public String getDebugMsg() {
		return debugMsg;
	}

	public void setDebugMsg(String debugMsg) {
		this.debugMsg = debugMsg;
	}

	@AMock(value = "一般是错误信息，正常情况下是空")
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
