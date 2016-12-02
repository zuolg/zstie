package com.zuolg.zsite.controller.admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zuolg.zsite.constants.ActionsForSide;
import com.zuolg.zsite.service.SecurityService;

/**
 * 其它页面
 * @ClassName AdminOtherController
 * @author zuolangguo
 * @date 2016年11月24日 上午11:52:56
 */
@Controller
@RequestMapping(value = ActionsForSide.ADMIN)
public class AdminOtherController {

	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(AdminOtherController.class);

	@Value("${jmx.port}")
	private int jmxPort;

	@Autowired
	private SecurityService securityService;

	/**
	 * 设置
	 * @Title:option
	 * @param req
	 * @param resp
	 * @param model
	 * @return
	 * ModelAndView
	 */
	@RequestMapping(value = ActionsForSide.ADMIN_OPTION)
	public ModelAndView option(HttpServletRequest req, HttpServletResponse resp, Model model) {

		return new ModelAndView("admin/option");
	}


}