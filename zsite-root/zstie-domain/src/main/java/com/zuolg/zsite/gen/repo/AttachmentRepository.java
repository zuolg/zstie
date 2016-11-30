package com.zuolg.zsite.gen.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.zuolg.zsite.gen.entity.BaseAttachment;
import com.zuolg.zsite.gen.entity.BaseUser;

/**
 * <pre>
 * 附件表，用于保存用户上传的附件内容。
 * </pre>
 * 
 */
public interface AttachmentRepository extends BaseRepository<BaseAttachment, Integer> {

	/**
	 * 根据电话号码获取用户信息
	 * 
	 * @return
	 */
	public List<BaseUser> findByid(Integer id);
	
	
	@Query("from BaseAttachment t where t.userId=?")
	List<BaseAttachment> getList(Integer userId);
}
