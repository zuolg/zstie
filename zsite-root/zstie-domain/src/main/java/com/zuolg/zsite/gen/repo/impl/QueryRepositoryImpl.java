package com.zuolg.zsite.gen.repo.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.zuolg.commons.exception.BaseApiException;
import com.zuolg.zsite.gen.repo.QueryRepository;
 

/**
 * Created by Administrator on 2015/11/20.
 */
@Repository
@SuppressWarnings("unchecked")
public class QueryRepositoryImpl<T> implements QueryRepository<T> {
    @Override
    public List<T> nativeQuery(Class<? extends Object> resultClass, String sql, Object[] values) throws BaseApiException {
        Query query = entityManager.createNativeQuery(sql,resultClass);
        return bind(query, values).getResultList();
    }

	@Override
    public List<T> query(Class<? extends Object> resultClass, String sql, Object[] values) throws BaseApiException {
        Query query = entityManager.createQuery(sql, resultClass);
        return bind(query, values).getResultList();
    }

    @Override
    public List<T> query(Class<? extends Object> resultClass,String sql, Object[] values, int begin, int size) throws BaseApiException{
        Query query = entityManager.createQuery(sql, resultClass);
        bind(query, values);
        query.setFirstResult(begin);
        query.setMaxResults(size);
        return query.getResultList();
    }

    @Override
    public long querySize(String sql, Object[] values) throws BaseApiException {
        String temp="select count(*) "+(sql.substring(sql.indexOf("from")));
        Query query = entityManager.createQuery(temp);
        bind(query, values);
        return Long.valueOf(query.getSingleResult().toString());
    }
    
	@Override
	public Boolean executeUpdate(String sql, Object[] values) throws BaseApiException {
		Query query = entityManager.createQuery(sql);
		bind(query, values);
		return query.executeUpdate()>0?true:false;
	}
	
	/**
	 * 将参数设置到查询
	 * @param query JPA Query
	 * @param args 参数列表（可变参数）
	 * @return 返回设置了参数的Query
	 */
	protected Query bind(final Query query, Object... args) {
		if (args != null && args.length > 0)
			for (int i = 0; i < args.length; i++) {
				query.setParameter(i + 1, args[i]);
			}
		return query;
	}    
    @PersistenceContext
    private EntityManager entityManager;

}
