package com.zuolg.zsite.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zuolg.commons.apiServer.controller.BaseDebugController;
import com.zuolg.commons.utils.StringUtils;
import com.zuolg.zsite.config.DebugApiServerConfig;

/**
 * <pre>
 * 开发时用的测试接口
 * </pre>
 * 
 * @date 2016年7月4日
 */
@Controller
@RequestMapping("/devApi")
public class ApiDebugController extends BaseDebugController {


	@Autowired
	private DebugApiServerConfig debugApiServerConfig;

	@Override
	public String getApiUrlPrefix() {
		return "/api";
	}

	@Override
	public String getPageTitle() {
		return "网站";
	}

	@Override
	public String getApiServerUrl() {
		String url = this.debugApiServerConfig.getUrl();
		if (StringUtils.isEmpty(url)) {
			return "";
		} else {
			return url;
		}
	}

}
