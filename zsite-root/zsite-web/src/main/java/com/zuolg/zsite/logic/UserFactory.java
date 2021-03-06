package com.zuolg.zsite.logic;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zuolg.zsite.gen.entity.BaseUser;
import com.zuolg.zsite.gen.service.UserService;

/**
 * 用户信息表，保存用户信息。
 * @ClassName UserFactory
 * @author zuolangguo
 * @date 2016年11月24日 下午4:52:17
 */
@Component
public class UserFactory {

	private static final Log log = LogFactory.getLog(UserFactory.class);

	@Autowired
	private UserService userService;

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
	


	/**
	 * 获取列表
	 * @Title:list
	 * void
	 */
	public void list(){}

	/**
	 * 编辑初始化
	 * @Title:edit
	 * void
	 */
	public void edit(){}
	
	/**
	 * 编辑保存
	 * @Title:editsave
	 * void
	 */
	public void editsave(){}
	
	/**
	 * 保存
	 * @Title:save
	 * void
	 */
	public void save(){}
	
	/**
	 * 删除
	 * @Title:delete
	 * void
	 */
	public void delete(){}

}
