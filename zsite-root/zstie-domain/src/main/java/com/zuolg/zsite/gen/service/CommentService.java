package com.zuolg.zsite.gen.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zuolg.zsite.gen.entity.BaseComment;
import com.zuolg.zsite.gen.repo.CommentRepository;

/**
 * 评论表，用于保存content内容的回复、分享、推荐等信息。
 * 
 * @ClassName CommentService
 * @author zuolangguo
 * @date 2016年11月22日 下午4:11:48
 */
@Service
public class CommentService {

	@Autowired
	private CommentRepository repository;

	private static final Log log = LogFactory.getLog(CommentService.class);

	/**
	 * 获取列表
	 * 
	 * @Title:list void
	 */
	public List<BaseComment> list() {

		return repository.findAll();
	}

	/**
	 * 编辑初始化
	 * 
	 * @Title:edit void
	 */
	public void edit(BaseComment bean) {
		repository.saveAndFlush(bean);
	}

	/**
	 * 编辑保存
	 * 
	 * @Title:editsave void
	 */
	public void editsave(BaseComment bean) {
		repository.save(bean);
	}

	/**
	 * 保存
	 * 
	 * @Title:save void
	 */
	public void save(BaseComment bean) {
		repository.save(bean);
	}

	/**
	 * 删除
	 * 
	 * @Title:delete void
	 */
	public void delete(BaseComment bean) {
		repository.delete(bean);
	}

}
