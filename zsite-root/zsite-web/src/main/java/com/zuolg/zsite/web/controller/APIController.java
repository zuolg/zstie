package com.zuolg.zsite.web.controller;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zuolg.commons.apiServer.adapter.AjaxAdapter;
import com.zuolg.commons.apiServer.beans.ApiMethodInfo;
import com.zuolg.commons.apiServer.beans.ApiServerInitException;
import com.zuolg.commons.exception.BaseApiException;
import com.zuolg.zsite.api.inf.IUser;

/**
 * API接口Controller
 * @ClassName APIController
 * @author zuolangguo
 * @date 2016年11月22日 上午10:36:31
 */
@RestController
@RequestMapping("/api")
public class APIController extends AjaxAdapter {

	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(APIController.class);

	// @Autowired
	// private DebugModeProperties debugModeProperties;

	@Autowired
	private IUser user;

	/**
	 * 初始化APIMap
	 */
	@PostConstruct
	void init() throws Exception {

		log.info("初始化APIMap");
		try {
			this.addImplToMap(user);
		} catch (ApiServerInitException e) {
			log.error(e.getMessage(), e);
			throw e;
		}
	}

	@Override
	protected void onBeforeInvoke(HttpServletRequest req, HttpServletResponse resp, ApiMethodInfo methodInfo)
			throws BaseApiException {

		// this.securityService.checkLogin( req, resp );
	}

	@Override
	protected boolean isNeedCreateMockData() {

		return log.isDebugEnabled();
	}

	protected boolean getInfClassPackagePrefix() {

		// return this.debugModeProperties.isDebugMode();

		return true;
	}

}
