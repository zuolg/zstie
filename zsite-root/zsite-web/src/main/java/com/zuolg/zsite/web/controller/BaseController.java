package com.zuolg.zsite.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * <pre>
 * 所有controller的基类，其实没啥卵用
 * </pre>
 * 
 *  2016年7月19日
 */
public abstract class BaseController {

	@Autowired
	protected HttpServletRequest request;

	@Autowired
	protected HttpServletResponse response;

	@Autowired(required = false)
	protected RedirectAttributes redirectAttributes;

	protected String getDebugString() {
		StringBuffer sb = new StringBuffer();
		sb.append("request:").append(request.getRequestURI());
		sb.append("\n");
		sb.append("method:").append(request.getMethod());
		sb.append("\n");
		//WebUtils.debugRequest(request, sb);
		return sb.toString();
	}


}
