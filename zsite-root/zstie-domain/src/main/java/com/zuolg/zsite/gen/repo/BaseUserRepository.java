package com.zuolg.zsite.gen.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.zuolg.zsite.gen.entity.BaseUser;

/**
 * <pre>
 * 用户本地信息Repo
 * </pre>
 * 
 */
public interface BaseUserRepository extends BaseRepository<BaseUser, Integer>{
	
	

	@Query("from BaseUser u where u.id=?")
	List<BaseUser> getUserInfo(int userID);
	 
	
	/**
	 * 根据电话号码获取用户信息
	 * @return
	 */
	public List<BaseUser> findByid(Integer id);
	
	/**
	 * 根据用户名查询用户
	 * @Title:findByusername
	 * @param username
	 * @return
	 * List<BaseUser>
	 */
	@Query("from BaseUser u where u.username=?")
	public List<BaseUser> findByusername(String username);
	
	
	@Query("from BaseUser u where u.username=? and u.password=?")
	public List<BaseUser> findUserInfoByusernameAndpassword(String username,String password);
	
}
