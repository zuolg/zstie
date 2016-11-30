package com.zuolg.zsite.gen.repo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zuolg.zsite.gen.entity.BaseMapping;
import com.zuolg.zsite.gen.repo.QueryRepository;


/**
 * <pre>
 * 这种实现方式不对，但是先暂时这样，功能完了再改。
 * </pre>
 * 
 */
@Repository
public class MappingRepositoryImpl {
	
	@Autowired
	private QueryRepository<BaseMapping> queryRepository;

	public QueryRepository<BaseMapping> getQueryRepository() {
		return queryRepository;
	}

	public void setQueryRepository(QueryRepository<BaseMapping> queryRepository) {
		this.queryRepository = queryRepository;
	}
	
}
