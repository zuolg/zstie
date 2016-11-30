package com.zuolg.zsite.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zuolg.zsite.api.forms.LoginForm;
import com.zuolg.zsite.exception.InvalidLoginStatusException;
import com.zuolg.zsite.gen.entity.BaseUser;
import com.zuolg.zsite.gen.service.UserService;
import com.zuolg.zsite.logic.UserFactory;
import com.zuolg.zsite.logic.UserFactory.UserObj;

/**
 * <pre>
 * 安全服务
 * </pre>
 * 
 * @author 梁韦江
 * @date 2016年7月2日
 */
@Service
public class SecurityService {

	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(SecurityService.class);

	private final static String DES_KEY = "我们都是好人";

	private final static String HEADER_NAME = "linzi_ri_token";

	/**
	 * 授权用户信息
	 */
	public static final String USER_BEAN = "userBean";

	/**
	 * 本地用户信息
	 */
	public static final String USER_INFO = "userInfo";

	/**
	 * <pre>
	 * 我们将用户信息放到header中
	 * </pre>
	 * 
	 * @author 梁韦江
	 * @date 2016年7月4日
	 */
	public static class HeaderBean {
		private String uuid;
		private int userSrc;
		private long regTime;

		public long getRegTime() {
			return regTime;
		}

		public void setRegTime(long regTime) {
			this.regTime = regTime;
		}

		public String getUuid() {
			return uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public int getUserSrc() {
			return userSrc;
		}

		public void setUserSrc(int userSrc) {
			this.userSrc = userSrc;
		}

	}

	/**
	 * 创建一个线程的局部变量用于存储request
	 */
	private final ThreadLocal<HttpServletRequest> threadLocalRequest = new ThreadLocal<HttpServletRequest>();
	private final ThreadLocal<HttpServletResponse> threadLocalResponse = new ThreadLocal<HttpServletResponse>();
	private final ThreadLocal<UserObj> threadLocalUserObj = new ThreadLocal<UserObj>();

	@Autowired
	private UserFactory userFactory;

	@Autowired
	private UserService userInfoService;

	/**
	 * @param loginForm
	 * @param request
	 * @param response
	 * @return
	 * @author 刘罡
	 */
	public boolean loginForAdmin(LoginForm loginForm, HttpServletRequest request, HttpServletResponse response) {
		UserObj userObj = userFactory.findAdminUserObj(loginForm.getUserName(), loginForm.getPwd());
		if (userObj != null) {
			threadLocalRequest.set(request);
			threadLocalResponse.set(response);
			threadLocalUserObj.set(userObj);
			request.getSession().setAttribute(USER_BEAN, userObj.toUserInfoBean());
			request.setAttribute(USER_BEAN, userObj.toUserInfoBean());
			return true;
		}
		return false;
	}

	/**
	 * 退出登录
	 * 
	 * @Title:logoutForAdmin
	 * @param request
	 *            void
	 */
	public void logoutForAdmin(HttpServletRequest request) {
		threadLocalUserObj.set(null);
		request.getSession().removeAttribute(USER_BEAN);
	}

	/**
	 * @param request
	 * @param resp
	 * @throws InvalidLoginStatusException
	 */
	public void checkLogin(HttpServletRequest request, HttpServletResponse resp) throws InvalidLoginStatusException {
		threadLocalRequest.set(request);
		threadLocalResponse.set(resp);

		BaseUser userInfoBean = (BaseUser) request.getSession().getAttribute(USER_BEAN);
		if (userInfoBean == null) {
			throw new InvalidLoginStatusException();
		}
		UserObj user = userFactory.getUserObj(userInfoBean.getId());
		request.setAttribute(USER_BEAN, user.toUserInfoBean());
		threadLocalUserObj.set(user);

	}

	/**
	 * 获取UserInfo
	 * 
	 * @return
	 */
	public UserObj getUserObj() {
		return threadLocalUserObj.get();
	}

	/**
	 * 获取request
	 * 
	 * @return
	 */
	public HttpServletRequest getRequest() {
		return threadLocalRequest.get();
	}

	public HttpServletResponse getResponse() {
		return threadLocalResponse.get();
	}

}
