package com.zuolg.zsite.gen.service.base;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zuolg.commons.exception.BaseApiException;
import com.zuolg.zsite.gen.repo.QueryRepository;

/**
 * <pre>
 * Service基类实现
 * </pre>
 * 
 */
@Service
public class BaseService<T, ID extends Serializable> {

	// @Autowired
	// BaseRepository<T, ID> repo;

	@Autowired
	QueryRepository<T> queryRepo;

	/**
	 * 根据ID查询
	 * 
	 * @param id
	 * @return
	 */
	public T findById(ID id) throws BaseApiException {
		// T po = repo.findOne(id);
		// return po;
		return null;
	}

	 

	/**
	 * 查所有
	 * 
	 * @return
	 */
	public List<T> findAll() throws BaseApiException {
		// List<T> list = repo.findAll();
		// return list;
		return null;
	}

}
