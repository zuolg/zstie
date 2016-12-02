package com.zuolg.commons.exception;

/**
 * <pre>
 * API server 底层初始化错误
 * </pre>
 * 
 *  2016年6月30日
 */
public class ApiServerInitException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ApiServerInitException() {
		super();
	}

	public ApiServerInitException(String message, Throwable cause) {
		super(message, cause);
	}

	public ApiServerInitException(String message) {
		super(message);
	}

	public ApiServerInitException(Throwable cause) {
		super(cause);
	}

}