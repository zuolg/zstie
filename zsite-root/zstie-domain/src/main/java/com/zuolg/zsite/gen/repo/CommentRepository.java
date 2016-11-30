package com.zuolg.zsite.gen.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.zuolg.zsite.gen.entity.BaseComment;
import com.zuolg.zsite.gen.entity.BaseUser;

/**
 * <pre>
 * 评论表，用于保存content内容的回复、分享、推荐等信息。
 * </pre>
 * 
 */
public interface CommentRepository extends BaseRepository<BaseComment, Integer>{
	
	

	@Query("from BaseUser u where u.id=?")
	List<BaseUser> getUserInfo(int userID);
	
	
	 
	
	
}
