package com.zuolg.zsite.gen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zuolg.zsite.gen.entity.BaseUser;
import com.zuolg.zsite.gen.repo.BaseUserRepository;

/**
 * 用户操作相关
 * 
 * @ClassName BaseUserService
 * @author zuolangguo
 * @date 2016年11月22日 下午4:11:48
 */
@Service
public class BaseUserService {

	@Autowired
	private BaseUserRepository userRepository;

	private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory
			.getLog(BaseUserService.class);

	public BaseUser findUserByAccountAndPwd(String account, String pwd) {
		List<BaseUser> list = userRepository.findUserInfoByusernameAndpassword(account, pwd);
		return (list.size() > 0 ? list.get(0) : null);
	}

	/**
	 * 根据id获取用户
	 * 
	 * @Title:getUserInfo
	 * @param userID
	 * @return List<BaseUser>
	 */
	public List<BaseUser> getUserInfo(int userID) {
		return userRepository.getUserInfo(userID);
	}

	/**
	 * 获取企业数据操作历史
	 * 
	 * @param dataId
	 * @return
	 * @author 刘罡
	 */
	public List<BaseUser> getUserList(Integer dataId) {
		return userRepository.findAll();
	}

}
