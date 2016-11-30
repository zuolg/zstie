package com.zuolg.zsite.logic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zuolg.zsite.gen.service.MappingService;

/**
 * <pre>
 * 内容和分类的多对多映射关系。
 * </pre>
 * 
 */
@Component
public class MappingFactory {

	private static final Log log = LogFactory.getLog(UserFactory.class);

	@Autowired
	private MappingService service;


	/**
	 * 获取列表
	 * @Title:list
	 * void
	 */
	public void list(){}

	/**
	 * 编辑初始化
	 * @Title:edit
	 * void
	 */
	public void edit(){}
	
	/**
	 * 编辑保存
	 * @Title:editsave
	 * void
	 */
	public void editsave(){}
	
	/**
	 * 保存
	 * @Title:save
	 * void
	 */
	public void save(){}
	
	/**
	 * 删除
	 * @Title:delete
	 * void
	 */
	public void delete(){}

}
