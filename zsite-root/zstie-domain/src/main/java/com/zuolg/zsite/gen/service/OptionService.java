package com.zuolg.zsite.gen.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zuolg.zsite.gen.entity.BaseOption;
import com.zuolg.zsite.gen.repo.OptionRepository;

/**
 * 配置信息表，用来保存网站的所有配置信息。Repo
 * 
 * @ClassName OptionService
 * @author zuolangguo
 * @date 2016年11月22日 下午4:11:48
 */
@Service
public class OptionService {

	@Autowired
	private OptionRepository repository;

	private static final Log log = LogFactory.getLog(OptionService.class);
	


	/**
	 * 获取列表
	 * 
	 * @Title:list void
	 */
	public List<BaseOption> list() {

		return repository.findAll();
	}

	/**
	 * 编辑初始化
	 * 
	 * @Title:edit void
	 */
	public void edit(BaseOption bean) {
		repository.saveAndFlush(bean);
	}

	/**
	 * 编辑保存
	 * 
	 * @Title:editsave void
	 */
	public void editsave(BaseOption bean) {
		repository.save(bean);
	}

	/**
	 * 保存
	 * 
	 * @Title:save void
	 */
	public void save(BaseOption bean) {
		repository.save(bean);
	}

	/**
	 * 删除
	 * 
	 * @Title:delete void
	 */
	public void delete(BaseOption bean) {
		repository.delete(bean);
	}


}
