package com.zuolg.zsite.gen.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zuolg.zsite.gen.entity.BaseTaxonomy;
import com.zuolg.zsite.gen.repo.TaxonomyRepository;

/**
 * 分类表。标签、专题、类别等都属于taxonomy
 * 
 * @ClassName TaxonomyService
 * @author zuolangguo
 * @date 2016年11月22日 下午4:11:48
 */
@Service
public class TaxonomyService {

	@Autowired
	private TaxonomyRepository repository;

	private static final Log log = LogFactory.getLog(TaxonomyService.class);


	/**
	 * 获取列表
	 * 
	 * @Title:list void
	 */
	public List<BaseTaxonomy> list() {

		return repository.findAll();
	}

	/**
	 * 编辑初始化
	 * 
	 * @Title:edit void
	 */
	public void edit(BaseTaxonomy bean) {
		repository.saveAndFlush(bean);
	}

	/**
	 * 编辑保存
	 * 
	 * @Title:editsave void
	 */
	public void editsave(BaseTaxonomy bean) {
		repository.save(bean);
	}

	/**
	 * 保存
	 * 
	 * @Title:save void
	 */
	public void save(BaseTaxonomy bean) {
		repository.save(bean);
	}

	/**
	 * 删除
	 * 
	 * @Title:delete void
	 */
	public void delete(BaseTaxonomy bean) {
		repository.delete(bean);
	}


}
