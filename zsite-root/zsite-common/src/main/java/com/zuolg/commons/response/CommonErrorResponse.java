package com.zuolg.commons.response;

import com.zuolg.commons.exception.BaseApiException;

/**
 * 调用发生异常时，通用的返回结果
 * @ClassName CommonErrorResponse
 * @author zuolangguo
 * @date 2016年11月22日 上午10:12:06
 */
public class CommonErrorResponse extends BaseResponse {

	public CommonErrorResponse(BaseApiException ex) {
		this.setCode(ex.getClass().getName());
		this.setMessage(ex.getErrorMsg());
	}

	public CommonErrorResponse(Exception ex) {
		this.setCode(ex.getClass().getName());
		this.setMessage(ex.getMessage());
	}

	public CommonErrorResponse(Exception ex, String errorMessage) {
		this.setCode(ex.getClass().getName());
		this.setMessage(errorMessage);
	}

	public CommonErrorResponse(String errorMessage) {
		this();
		this.setMessage(errorMessage);
	}

	public CommonErrorResponse() {
		this.setCode("ERROR");
	}

	public String getErrorMsg() {
		return this.getMessage();
	}

	public void setErrorMsg(String errorMessage) {
		this.setMessage(errorMessage);
	}
}
