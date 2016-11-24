package com.zuolg.zsite.web.controller;

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
import com.zuolg.zsite.logic.BaseUserFactory.UserObj;
import com.zuolg.zsite.service.SecurityService;

/**
 * <pre>
 * 用于开发时模拟数据提交
 * </pre>
 * 
 * @date 2016年7月2日
 */
@Controller
public class ApiDebugIndexController {

	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(ApiDebugIndexController.class);

	@Value("${jmx.port}")
	private int jmxPort;
	

	@Autowired
	private SecurityService securityService;
	
	
 

	@RequestMapping(value = "/dev")
	public ModelAndView welcome(HttpServletRequest req, Model model) {
		
		if (log.isDebugEnabled()) {
			
			String jmxUrl = String.format("http://%s:%d", req.getServerName(), this.jmxPort);

			model.addAttribute("jmxUrl", jmxUrl);

			return new ModelAndView("devIndex");
		} else {
			return new ModelAndView("index");
		}
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ModelAndView submit(LoginForm loginForm, HttpServletRequest req, HttpServletResponse resp) {
		if (log.isDebugEnabled()) {

			//LoginForm info = BinderUtil.bindForm(req, LoginForm.class, false);

			log.debug("模拟用户 {} 登陆", loginForm.getUserName());
			log.debug("模拟用户 {} 登陆", loginForm.getPwd());
			
			

			// 保存并创建用户
			boolean token = this.securityService.loginForAdmin(loginForm, req, resp);
			 
			log.debug("模拟用户 {} 登陆,token是：{}", loginForm.getUserName(),token);
			 
			if (req.getParameterMap().containsKey("clientBtn")) {
				return new ModelAndView(new RedirectView("/devApi/?token=" + token));
			} else {
				return new ModelAndView(new RedirectView("/devApi/?token=" + token));
			}
		} else {
			return new ModelAndView("index");
		}
	}
	
}