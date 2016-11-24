package com.zuolg.zsite.admin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.zuolg.commons.utils.BinderUtil;
import com.zuolg.zsite.api.forms.LoginForm;
import com.zuolg.zsite.exception.InvalidLoginStatusException;
import com.zuolg.zsite.logic.BaseUserFactory.UserObj;
import com.zuolg.zsite.service.SecurityService;

/**
 * 后台管理
 * 
 * @ClassName IndexController
 * @author zuolangguo
 * @date 2016年11月23日 上午9:53:34
 */
@Controller
@RequestMapping(value = "/admin")
public class IndexController {

	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(IndexController.class);

	@Value("${jmx.port}")
	private int jmxPort;

	@Autowired
	private SecurityService securityService;

	@RequestMapping(value = "/index")
	public ModelAndView index(HttpServletRequest req, HttpServletResponse resp, Model model) {

		try {
			this.securityService.checkLogin(req, resp);
		} catch (InvalidLoginStatusException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			return new ModelAndView("admin/login");
		}
		return new ModelAndView("admin/index");
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView submit(LoginForm loginForm, HttpServletRequest req, HttpServletResponse resp) {

		boolean flag = this.securityService.loginForAdmin(loginForm, req, resp);
		log.debug("模拟用户 {} 登陆,token是：{}", loginForm.getUserName(), flag);
		if (flag) {
			return new ModelAndView("admin/index");
		} else {
			return new ModelAndView("admin/login");
		}
	}

}