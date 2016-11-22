package com.zuolg.zsite.web.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * <pre>
 * 微信相关
 * </pre>
 * 
 * @author 刘罡 2016年8月2日
 */
@Controller
@RequestMapping("/wechat")
public class WeChatController {

	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(WeChatController.class);

	/**	
	 * 登录授权方法
	 * 
	 * @param code
	 * @throws IOException
	 */
	@RequestMapping("/callback")
	public ModelAndView author(String code, HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		System.out.println("----------------------------------------");
		
		log.debug("成功code对象 : {}", code);

		return null;
	}

}
