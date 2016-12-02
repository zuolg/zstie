package com.zuolg.zsite.gen.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.zuolg.commons.annotation.AComment;



/** 内容和分类的多对多映射关系。 */
@Entity
@Table(name = "z_mapping")
@AComment(comment="内容和分类的多对多映射关系。")
public class BaseMapping implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	/** 主键ID */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", length=20)
	@AComment(comment="主键ID")
	private Integer id;
	
	/** 内容ID */
	@Column(name="content_id", length=20)
	@AComment(comment="内容ID")
	private Integer contentId;
	
	/** 分类ID */
	@Column(name="taxonomy_id", length=20)
	@AComment(comment="分类ID")
	private Integer taxonomyId;
	
	
	
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getContentId() {
		return this.contentId;
	}

	public void setContentId(Integer contentId) {
		this.contentId = contentId;
	}
	
	public Integer getTaxonomyId() {
		return this.taxonomyId;
	}

	public void setTaxonomyId(Integer taxonomyId) {
		this.taxonomyId = taxonomyId;
	}
	

}
