package com.zuolg.zsite.gen.repo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zuolg.zsite.gen.entity.BaseMetadata;
import com.zuolg.zsite.gen.repo.QueryRepository;


/**
 * <pre>
 * 这种实现方式不对，但是先暂时这样，功能完了再改。
 * </pre>
 * 
 */
@Repository
public class MetadataRepositoryImpl {
	
	@Autowired
	private QueryRepository<BaseMetadata> queryRepository;

	public QueryRepository<BaseMetadata> getQueryRepository() {
		return queryRepository;
	}

	public void setQueryRepository(QueryRepository<BaseMetadata> queryRepository) {
		this.queryRepository = queryRepository;
	}
	
}
