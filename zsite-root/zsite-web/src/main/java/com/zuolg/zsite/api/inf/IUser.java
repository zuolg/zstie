package com.zuolg.zsite.api.inf;

import com.zuolg.commons.annotation.api.AClass;
import com.zuolg.commons.annotation.api.AMethod;
import com.zuolg.commons.exception.BaseApiException;
import com.zuolg.zsite.api.forms.LoginForm;
import com.zuolg.zsite.api.response.UsersResponse;

/**
 * <pre>
 * 用户相关
 * </pre>
 * 
 * @author 刘罡 2016年8月2日
 */
@AClass
public interface IUser {

	/**
	 * 用户登录
	 * @Title:login
	 * @return
	 * @throws BaseApiException
	 * UsersResponse
	 */
	@AMethod
	public UsersResponse login(LoginForm form) throws BaseApiException;
	 
	/**
	 * 获取用户
	 * 
	 * @Title:getUser
	 * @param code
	 * @return UsersResponse
	 */
	@AMethod
	public UsersResponse getUser() throws BaseApiException;
	
}
