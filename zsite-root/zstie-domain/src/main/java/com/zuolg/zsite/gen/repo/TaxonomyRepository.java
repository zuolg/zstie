package com.zuolg.zsite.gen.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.zuolg.zsite.gen.entity.BaseTaxonomy;
import com.zuolg.zsite.gen.entity.BaseUser;

/**
 * <pre>
 * 分类表。标签、专题、类别等都属于taxonomy。Repo
 * </pre>
 * 
 */
public interface TaxonomyRepository extends BaseRepository<BaseTaxonomy, Integer>{
	
	

	@Query("from BaseUser u where u.id=?")
	List<BaseUser> getUserInfo(int userID);
	 
	
}
