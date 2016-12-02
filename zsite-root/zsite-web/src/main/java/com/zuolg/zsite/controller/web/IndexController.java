package com.zuolg.zsite.controller.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zuolg.zsite.service.SecurityService;

/**
 * 首页
 * 
 * @ClassName IndexController
 * @author zuolangguo
 * @date 2016年11月24日 下午2:32:08
 */
@Controller
public class IndexController {

	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(IndexController.class);

	@Value("${jmx.port}")
	private int jmxPort;

	@Autowired
	private SecurityService securityService;

	@RequestMapping(value = "/")
	public ModelAndView index(HttpServletRequest req, HttpServletResponse resp, Model model) {

		return new ModelAndView("index");
	}

}