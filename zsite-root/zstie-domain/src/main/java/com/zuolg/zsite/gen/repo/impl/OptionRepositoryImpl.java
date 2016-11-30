package com.zuolg.zsite.gen.repo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zuolg.zsite.gen.entity.BaseOption;
import com.zuolg.zsite.gen.repo.QueryRepository;


/**
 * <pre>
 * 这种实现方式不对，但是先暂时这样，功能完了再改。
 * </pre>
 * 
 */
@Repository
public class OptionRepositoryImpl {
	
	@Autowired
	private QueryRepository<BaseOption> queryRepository;

	public QueryRepository<BaseOption> getQueryRepository() {
		return queryRepository;
	}

	public void setQueryRepository(QueryRepository<BaseOption> queryRepository) {
		this.queryRepository = queryRepository;
	}
	
}
