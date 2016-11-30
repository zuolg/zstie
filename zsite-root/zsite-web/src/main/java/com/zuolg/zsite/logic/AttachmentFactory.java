package com.zuolg.zsite.logic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zuolg.zsite.gen.service.AttachmentService;


/**
 * <pre>
 * 附件表，用于保存用户上传的附件内容。
 * </pre>
 * 
 */
@Component
public class AttachmentFactory {

	private static final Log log = LogFactory.getLog(AttachmentFactory.class);

	@Autowired
	private AttachmentService service;
	


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
