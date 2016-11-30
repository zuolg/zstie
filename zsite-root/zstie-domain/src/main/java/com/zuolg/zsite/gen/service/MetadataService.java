package com.zuolg.zsite.gen.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zuolg.zsite.gen.entity.BaseMetadata;
import com.zuolg.zsite.gen.repo.MetadataRepository;

/**
 * 元数据表，用来对其他表的字段扩充。Repo
 * 
 * @ClassName MetadataService
 * @author zuolangguo
 * @date 2016年11月22日 下午4:11:48
 */
@Service
public class MetadataService {

	@Autowired
	private MetadataRepository repository;

	private static final Log log = LogFactory.getLog(MetadataService.class);
	


	/**
	 * 获取列表
	 * 
	 * @Title:list void
	 */
	public List<BaseMetadata> list() {

		return repository.findAll();
	}

	/**
	 * 编辑初始化
	 * 
	 * @Title:edit void
	 */
	public void edit(BaseMetadata bean) {
		repository.saveAndFlush(bean);
	}

	/**
	 * 编辑保存
	 * 
	 * @Title:editsave void
	 */
	public void editsave(BaseMetadata bean) {
		repository.save(bean);
	}

	/**
	 * 保存
	 * 
	 * @Title:save void
	 */
	public void save(BaseMetadata bean) {
		repository.save(bean);
	}

	/**
	 * 删除
	 * 
	 * @Title:delete void
	 */
	public void delete(BaseMetadata bean) {
		repository.delete(bean);
	}

}
