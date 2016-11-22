package com.zuolg.commons.apiServer.vo;

import java.util.List;

import com.zuolg.commons.apiServer.beans.ApiMethodInfo;

/**
 * <pre>
 * 用于debug界面的vo
 * </pre>
 * 
 *  2016年7月4日
 */
public class DebugPageVo {

	private final List<ApiMethodInfo> methods;
	private final String apiUrlPrefix;

	public DebugPageVo(String apiUrlPrefix, List<ApiMethodInfo> methods) {
		super();
		this.apiUrlPrefix = apiUrlPrefix;
		this.methods = methods;
	}

	public List<ApiMethodInfo> getMethods() {
		return methods;
	}

	public String getApiUrlPrefix() {
		return apiUrlPrefix;
	}

}
