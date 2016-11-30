package com.zuolg.zsite.logic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zuolg.zsite.gen.service.OptionService;


/**
 * <pre>
 * 配置信息表，用来保存网站的所有配置信息。
 * </pre>
 * 
 */
@Component
public class OptionFactory {

	private static final Log log = LogFactory.getLog(UserFactory.class);

	@Autowired
	private OptionService service;
	


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
