package com.zuolg.zsite.api.inf.impl;

import org.springframework.stereotype.Service;

import com.zuolg.commons.exception.BaseApiException;
import com.zuolg.zsite.api.forms.LoginForm;
import com.zuolg.zsite.api.inf.IUser;
import com.zuolg.zsite.api.response.UsersResponse;

@Service
public class UserImpl implements IUser {

	@Override
	public UsersResponse getUser() throws BaseApiException {
		// TODO Auto-generated method stub

		return new UsersResponse();
	}

	@Override
	public UsersResponse login(LoginForm form) throws BaseApiException {
		// TODO Auto-generated method stub
		System.out.println("---------------------------------");
		System.out.println(form.getUserName());
		System.out.println(form.getPwd());
		return new UsersResponse();
	}

}
