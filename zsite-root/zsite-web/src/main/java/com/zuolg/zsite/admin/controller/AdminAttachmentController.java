package com.zuolg.zsite.admin.controller;

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
 * 附件
 * @ClassName AdminAttachmentController
 * @author zuolangguo
 * @date 2016年11月24日 上午11:49:28
 */
@Controller
@RequestMapping(value = ActionsForSide.ADMIN)
public class AdminAttachmentController {

	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(AdminAttachmentController.class);

	@Value("${jmx.port}")
	private int jmxPort;

	@Autowired
	private SecurityService securityService;

	/**
	 * 所有附件
	 * @Title:allattachment
	 * @param req
	 * @param resp
	 * @param model
	 * @return
	 * ModelAndView
	 */
	@RequestMapping(value = ActionsForSide.ADMIN_ALLATTACHMENT)
	public ModelAndView allattachment(HttpServletRequest req, HttpServletResponse resp, Model model) {

		return new ModelAndView("admin/allattachment");
	}


}