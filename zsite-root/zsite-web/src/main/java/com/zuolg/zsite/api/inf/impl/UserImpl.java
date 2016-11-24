package com.zuolg.zsite.api.inf.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zuolg.commons.exception.BaseApiException;
import com.zuolg.zsite.api.forms.LoginForm;
import com.zuolg.zsite.api.inf.IUser;
import com.zuolg.zsite.api.response.UsersResponse;
import com.zuolg.zsite.gen.entity.BaseUser;
import com.zuolg.zsite.logic.BaseUserFactory;

@Service
public class UserImpl implements IUser {
	
	@Autowired
	private BaseUserFactory userFactory;

	@Override
	public UsersResponse getUser() throws BaseApiException {
		// TODO Auto-generated method stub
		
		List<BaseUser> list = userFactory.getUserObj2(0);
		
		for (BaseUser baseUser : list) {
			System.out.println(baseUser.getId());
			System.out.println(baseUser.getUsername());
		}
		 

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
