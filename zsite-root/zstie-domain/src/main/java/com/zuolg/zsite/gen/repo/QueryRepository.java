package com.zuolg.zsite.gen.repo;

import java.util.List;

import com.zuolg.commons.exception.BaseApiException;

/**
 * Created by Administrator on 2015/11/20.
 */
public interface QueryRepository<T> {
    /**
     * 原生sql查询
     *
     * @param nativeSql 原生sql语句
     * @param resultClass 返回list内对象类型
     * @param values    Object[]类型对应顺序参数
     * @return 返回查询list<Map<resultClass>>
     * @throws Exception 抛出执行异常
     */
    List<T> nativeQuery(Class<? extends Object> resultClass,String nativeSql, Object[] values) throws BaseApiException;

    /**
     * 执行查询返回List<resultClass>
     * @param resultClass 返回list内对象类型
     * @param sql sql语句
     * @param values Object[]类型对应顺序参数
     * @return 返回List<resultClass>
     * @throws Exception 抛出执行异常
     */
    List<T> query(Class<? extends Object> resultClass,String sql, Object[] values) throws BaseApiException;
    /**
     * 执行查询返回List<resultClass>
     * @param resultClass 返回list内对象类型
     * @param sql sql语句
     * @param values Object[]类型对应顺序参数
     * @param begin 起始条数
     * @param size 取出数据条数
     * @return 返回List<resultClass>
     * @throws Exception 抛出执行异常
     */
    List<T> query(Class<? extends Object> resultClass,String sql, Object[] values, int begin, int size) throws BaseApiException;

    /**
     * 获取指定sql的结果集条数
     * @param sql sql语句
     * @param values Object[]类型对应顺序参数
     * @return 返回结果集大小
     * @throws Exception 抛出执行异常
     */
    long querySize(String sql, Object[] values) throws BaseApiException;

	/**
	 * 执行sql，返回执行成功与否
	 * @param sql sql语句
	 * @param values Object[]类型对应顺序参数
	 * @return 返回执行成功与否
	 * @throws Exception 抛出执行异常
	 */
    Boolean executeUpdate(String sql, Object[] values) throws BaseApiException;

}
