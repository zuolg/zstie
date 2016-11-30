package com.zuolg.zsite.gen.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zuolg.zsite.gen.entity.BaseMapping;
import com.zuolg.zsite.gen.repo.MappingRepository;

/**
 * 内容和分类的多对多映射关系。Repo
 * 
 * @ClassName MappingService
 * @author zuolangguo
 * @date 2016年11月22日 下午4:11:48
 */
@Service
public class MappingService {

	@Autowired
	private MappingRepository repository;

	private static final Log log = LogFactory.getLog(MappingService.class);
	

	/**
	 * 获取列表
	 * 
	 * @Title:list void
	 */
	public List<BaseMapping> list() {

		return repository.findAll();
	}

	/**
	 * 编辑初始化
	 * 
	 * @Title:edit void
	 */
	public void edit(BaseMapping bean) {
		repository.saveAndFlush(bean);
	}

	/**
	 * 编辑保存
	 * 
	 * @Title:editsave void
	 */
	public void editsave(BaseMapping bean) {
		repository.save(bean);
	}

	/**
	 * 保存
	 * 
	 * @Title:save void
	 */
	public void save(BaseMapping bean) {
		repository.save(bean);
	}

	/**
	 * 删除
	 * 
	 * @Title:delete void
	 */
	public void delete(BaseMapping bean) {
		repository.delete(bean);
	}

}
