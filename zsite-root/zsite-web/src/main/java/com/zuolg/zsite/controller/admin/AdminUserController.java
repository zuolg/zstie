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
 * 用户
 * @ClassName AdminUserController
 * @author zuolangguo
 * @date 2016年11月24日 上午11:51:07
 */
@Controller
@RequestMapping(value = ActionsForSide.ADMIN)
public class AdminUserController {

	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(AdminUserController.class);

	@Value("${jmx.port}")
	private int jmxPort;

	@Autowired
	private SecurityService securityService;

	/**
	 * 所有用户
	 * @Title:alluser
	 * @param req
	 * @param resp
	 * @param model
	 * @return
	 * ModelAndView
	 */
	@RequestMapping(value = ActionsForSide.ADMIN_ALLUSER)
	public ModelAndView alluser(HttpServletRequest req, HttpServletResponse resp, Model model) {

		return new ModelAndView("admin/alluser");
	}

	/**
	 * 添加用户
	 * @Title:addPage
	 * @param req
	 * @param resp
	 * @param model
	 * @return
	 * ModelAndView
	 */
	@RequestMapping(value = ActionsForSide.ADMIN_ADDUSER)
	public ModelAndView addUser(HttpServletRequest req, HttpServletResponse resp, Model model) {

		return new ModelAndView("admin/addUser");
	}

	/**
	 * 我的信息
	 * @Title:userInfo
	 * @param req
	 * @param resp
	 * @param model
	 * @return
	 * ModelAndView
	 */
	@RequestMapping(value = ActionsForSide.ADMIN_USERINFO)
	public ModelAndView userInfo(HttpServletRequest req, HttpServletResponse resp, Model model) {

		return new ModelAndView("admin/userInfo");
	}


}