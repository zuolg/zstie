package com.zuolg.commons.apiServer.controller;

import java.io.IOException;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zuolg.commons.apiServer.adapter.ApiMapContainer;
import com.zuolg.commons.apiServer.vo.DebugPageVo;

import freemarker.template.TemplateException;

/**
 * <pre>
 * 开发时调试用的的controller
 * </pre>
 * 
 *  2016年7月4日
 */
// 由子类写注解
// @RequestMapping("/dev")
public abstract class BaseDebugController {

	@RequestMapping("/")
	@ResponseBody
	public String index(Model model, String token) throws TemplateException, IOException {

		// 调试页面的vo
		DebugPageVo vo = ApiMapContainer.getInstance().getDebugPageVo(getApiUrlPrefix());

		model.addAttribute("vo", vo);
		model.addAttribute("pageTitle", this.getPageTitle());
		model.addAttribute("token", token);
		model.addAttribute("apiServerUrl", this.getApiServerUrl());

		return TemplateService.getInstance().process("index", model);
	}

	/**
	 * 返回子类在 @RequestMapping 定义的url前缀
	 * 
	 * @return
	 */
	public abstract String getApiUrlPrefix();

	public abstract String getPageTitle();

	/**
	 * 获得api server的路径，用于配置跨域调试
	 * 
	 * @return
	 */
	public String getApiServerUrl() {
		return "";
	}

}
