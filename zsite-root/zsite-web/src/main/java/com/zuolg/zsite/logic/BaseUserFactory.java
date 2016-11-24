package com.zuolg.zsite.logic;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zuolg.zsite.gen.entity.BaseUser;
import com.zuolg.zsite.gen.service.BaseUserService;

@Component
public class BaseUserFactory {

	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(BaseUserFactory.class);

	@Autowired
	private BaseUserService userService;

	public UserObj findAdminUserObj(String account, String pwd) {
		BaseUser userInfo = userService.findUserByAccountAndPwd(account, pwd);
		if (userInfo != null) {
			return new UserObj(userInfo);
		}
		return null;
	}

	/**
	 * 根据id获取用户
	 * 
	 * @param userID
	 * @return
	 */
	public List<BaseUser> getUserObj2(int userID) {
		return userService.getUserList(userID);
	}

	/**
	 * 根据id获取用户
	 * 
	 * @param userID
	 * @return
	 */
	public UserObj getUserObj(int userID) {
		List<BaseUser> list = userService.getUserInfo(userID);

		BaseUser userInfo = null;
		if (list.size() > 0) {
			userInfo = list.get(0);
		}
		return new UserObj(userInfo);
	}

	public class UserObj extends BasePoObj<BaseUser> {

		public UserObj(BaseUser po) {
			super(po);
		}

		/**
		 * 转为BEAN
		 * 
		 * @return
		 */
		public BaseUser toUserInfoBean() {
			BaseUser ret = new BaseUser();
			BeanUtils.copyProperties(getPo(), ret);
			return ret;
		}

		protected UserObj update() {
			// userService.save(getPo());
			return this;
		}

	}

}
