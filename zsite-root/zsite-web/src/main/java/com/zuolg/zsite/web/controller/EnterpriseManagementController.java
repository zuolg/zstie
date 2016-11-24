package com.zuolg.zsite.web.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.assertj.core.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.zuolg.commons.exception.BaseApiException;
import com.zuolg.commons.utils.BinderUtil;
import com.zuolg.zsite.constants.ActionsForManageSide;
import com.zuolg.zsite.service.SecurityService;


/**
 * <pre>
 * 时间紧迫，所以代码先写完。稍后再做调整，重构、优化一下。
 * </pre>
 * 
 * @author 刘罡 2016年7月26日
 */
@RestController
@RequestMapping( ActionsForManageSide.PREFIX )
public class EnterpriseManagementController extends BaseController {


	public static final String COOKIE_USER_NAME = "login_username";

	public static final String COOKIE_PASSWORDE = "login_password";

	public static final String VO_NAME = "loginForm";

	public static final String PASSWORD_STR = "请输入登录密码";
 

	@Autowired
	private SecurityService securityService;
 


	private String getEnterpriseData( String srcDir, int[] entIds ) throws BaseApiException {
		
		securityService.getUserObj();
 
		return null;
	}
}
