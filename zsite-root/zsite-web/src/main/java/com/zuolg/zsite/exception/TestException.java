package com.zuolg.zsite.exception;

import com.zuolg.commons.exception.BaseApiException;

/**
 * <pre>
 * 邮箱已注册异常
 * </pre>
 * 
 * @author 刘罡 2016年7月13日
 */
public class TestException extends BaseApiException {
	private String entEmail;

	public TestException(String entEmail) {
		super();
		this.entEmail = entEmail;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -4860259072724018239L;

	@Override
	public String getErrorMsg() {
		// TODO Auto-generated method stub
		return null;
	}

}
