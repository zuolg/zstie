package com.zuolg.zsite.gen.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zuolg.zsite.gen.repo.AttachmentRepository;

/**
 * 附件表，用于保存用户上传的附件内容。
 * 
 * @ClassName BaseUserService
 * @author zuolangguo
 * @date 2016年11月22日 下午4:11:48
 */
@Service
public class AttachmentService {

	@Autowired
	private AttachmentRepository repository;

	private static final Log log = LogFactory.getLog(AttachmentService.class);

	/**
	 * 获取列表
	 * 
	 * @Title:list void
	 */
	public void list() {
	}

	/**
	 * 编辑初始化
	 * 
	 * @Title:edit void
	 */
	public void edit() {
	}

	/**
	 * 编辑保存
	 * 
	 * @Title:editsave void
	 */
	public void editsave() {
	}

	/**
	 * 保存
	 * 
	 * @Title:save void
	 */
	public void save() {
	}

	/**
	 * 删除
	 * 
	 * @Title:delete void
	 */
	public void delete() {
	}

}
