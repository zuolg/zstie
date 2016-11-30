package com.zuolg.zsite.api.inf;

import com.zuolg.commons.annotation.api.AClass;
import com.zuolg.commons.annotation.api.AMethod;
import com.zuolg.commons.exception.BaseApiException;
import com.zuolg.zsite.api.forms.LoginForm;
import com.zuolg.zsite.api.response.UsersResponse;

@AClass
public interface IAttachment {
	

	@AMethod
	public UsersResponse list(LoginForm form) throws BaseApiException;

}
