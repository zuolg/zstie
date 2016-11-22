package com.zuolg.zsite.api.forms;

import com.zuolg.commons.annotation.api.AForm;

/**
 * 用户登录
 * 
 * @ClassName LoginForm
 * @author zuolangguo
 * @date 2016年11月22日 上午10:56:56
 */
@AForm
public class LoginForm {

	/**
	 * 用户名
	 */
	private String userName;

	/**
	 * 用户密码
	 */
	private String pwd;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
