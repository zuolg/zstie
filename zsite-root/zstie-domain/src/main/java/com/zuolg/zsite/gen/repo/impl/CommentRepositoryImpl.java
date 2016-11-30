package com.zuolg.zsite.gen.repo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zuolg.zsite.gen.entity.BaseComment;
import com.zuolg.zsite.gen.repo.QueryRepository;


/**
 * <pre>
 * 这种实现方式不对，但是先暂时这样，功能完了再改。
 * </pre>
 * 
 */
@Repository
public class CommentRepositoryImpl {
	
	@Autowired
	private QueryRepository<BaseComment> queryRepository;

	public QueryRepository<BaseComment> getQueryRepository() {
		return queryRepository;
	}

	public void setQueryRepository(QueryRepository<BaseComment> queryRepository) {
		this.queryRepository = queryRepository;
	}
	
}
