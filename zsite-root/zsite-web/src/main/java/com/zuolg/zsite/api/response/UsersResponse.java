package com.zuolg.zsite.api.response;

import com.zuolg.commons.response.BaseResponse;

/**
 * 获取任务成员
 * 
 * @ClassName TaskUsersResponse
 * @author zuolangguo
 * @date 2016年6月23日 上午10:21:45
 */
public class UsersResponse extends BaseResponse {

	private String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}
