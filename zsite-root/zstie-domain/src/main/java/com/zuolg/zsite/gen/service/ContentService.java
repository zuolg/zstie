package com.zuolg.zsite.gen.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zuolg.zsite.gen.entity.BaseContent;
import com.zuolg.zsite.gen.repo.ContentRepository;

/**
 * 内容表，用于存放比如文章、帖子、商品、问答等用户自定义模型内容
 * 
 * @ClassName ContentService
 * @author zuolangguo
 * @date 2016年11月22日 下午4:11:48
 */
@Service
public class ContentService {

	@Autowired
	private ContentRepository repository;

	private static final Log log = LogFactory.getLog(ContentService.class);
	

	/**
	 * 获取列表
	 * 
	 * @Title:list void
	 */
	public List<BaseContent> list() {

		return repository.findAll();
	}

	/**
	 * 编辑初始化
	 * 
	 * @Title:edit void
	 */
	public void edit(BaseContent bean) {
		repository.saveAndFlush(bean);
	}

	/**
	 * 编辑保存
	 * 
	 * @Title:editsave void
	 */
	public void editsave(BaseContent bean) {
		repository.save(bean);
	}

	/**
	 * 保存
	 * 
	 * @Title:save void
	 */
	public void save(BaseContent bean) {
		repository.save(bean);
	}

	/**
	 * 删除
	 * 
	 * @Title:delete void
	 */
	public void delete(BaseContent ent) {
		repository.delete(ent);
	}

}
