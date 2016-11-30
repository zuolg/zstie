package com.zuolg.zsite.gen.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.zuolg.zsite.gen.entity.BaseOption;
import com.zuolg.zsite.gen.entity.BaseUser;

/**
 * <pre>
 * 配置信息表，用来保存网站的所有配置信息。Repo
 * </pre>
 * 
 */
public interface OptionRepository extends BaseRepository<BaseOption, Integer>{
	
	

	@Query("from BaseUser u where u.id=?")
	List<BaseUser> getUserInfo(int userID);
	 
	
}
