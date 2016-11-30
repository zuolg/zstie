package com.zuolg.zsite.gen.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.zuolg.zsite.gen.entity.BaseMetadata;
import com.zuolg.zsite.gen.entity.BaseUser;

/**
 * <pre>
 * 元数据表，用来对其他表的字段扩充。Repo
 * </pre>
 * 
 */
public interface MetadataRepository extends BaseRepository<BaseMetadata, Integer>{
	
	

	@Query("from BaseUser u where u.id=?")
	List<BaseUser> getUserInfo(int userID);
	 
	
}
