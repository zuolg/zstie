package com.zuolg.zsite.logic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zuolg.zsite.gen.service.ContentService;


/**
 * <pre>
 * 内容表，用于存放比如文章、帖子、商品、问答等用户自定义模型内容
 * </pre>
 * 
 */
@Component
public class ContentFactory {

	private static final Log log = LogFactory.getLog(UserFactory.class);

	@Autowired
	private ContentService service;
	


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
