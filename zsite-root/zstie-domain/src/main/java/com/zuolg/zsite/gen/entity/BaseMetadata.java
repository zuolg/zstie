package com.zuolg.zsite.gen.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.zuolg.commons.apiServer.beans.AComment;



/** 元数据表，用来对其他表的字段扩充。 */
@Entity
@Table(name = "z_metadata")
@AComment(comment="元数据表，用来对其他表的字段扩充。")
public class BaseMetadata implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	/** 主键ID */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", length=20)
	@AComment(comment="主键ID")
	private Integer id;
	
	/** 元数据key */
	@Column(name="meta_key", length=255)
	@AComment(comment="元数据key")
	private String metaKey;
	
	/** 元数据value */
	@Column(name="meta_value", length=65535)
	@AComment(comment="元数据value")
	private String metaValue;
	
	/** 元数据的对象类型 */
	@Column(name="object_type", length=32)
	@AComment(comment="元数据的对象类型")
	private String objectType;
	
	/** 元数据的对象ID */
	@Column(name="object_id", length=20)
	@AComment(comment="元数据的对象ID")
	private Integer objectId;
	
	
	
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getMetaKey() {
		return this.metaKey;
	}

	public void setMetaKey(String metaKey) {
		this.metaKey = metaKey;
	}
	
	public String getMetaValue() {
		return this.metaValue;
	}

	public void setMetaValue(String metaValue) {
		this.metaValue = metaValue;
	}
	
	public String getObjectType() {
		return this.objectType;
	}

	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}
	
	public Integer getObjectId() {
		return this.objectId;
	}

	public void setObjectId(Integer objectId) {
		this.objectId = objectId;
	}
	

}
