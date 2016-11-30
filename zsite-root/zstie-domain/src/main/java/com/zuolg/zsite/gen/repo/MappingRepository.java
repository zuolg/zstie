package com.zuolg.zsite.gen.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.zuolg.zsite.gen.entity.BaseMapping;
import com.zuolg.zsite.gen.entity.BaseUser;

/**
 * <pre>
 * 内容和分类的多对多映射关系。Repo
 * </pre>
 * 
 */
public interface MappingRepository extends BaseRepository<BaseMapping, Integer>{
	
	

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
