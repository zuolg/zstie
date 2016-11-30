package com.zuolg.zsite.gen.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zuolg.zsite.gen.entity.BaseUser;
import com.zuolg.zsite.gen.repo.UserRepository;

/**
 * 用户信息表，保存用户信息。
 * 
 * @ClassName BaseUserService
 * @author zuolangguo
 * @date 2016年11月22日 下午4:11:48
 */
@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	private static final Log log = LogFactory.getLog(TaxonomyService.class);

	public BaseUser findUserByAccountAndPwd(String account, String pwd) {
		List<BaseUser> list = repository.findUserInfoByusernameAndpassword(account, pwd);
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
		return repository.getUserInfo(userID);
	}

	/**
	 * 获取企业数据操作历史
	 * 
	 * @param dataId
	 * @return
	 */
	public List<BaseUser> getUserList(Integer dataId) {
		return repository.findAll();
	}

}
