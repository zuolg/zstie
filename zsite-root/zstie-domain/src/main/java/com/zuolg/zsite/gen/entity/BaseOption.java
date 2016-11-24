package com.zuolg.zsite.gen.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.zuolg.commons.apiServer.beans.AComment;



/** 配置信息表，用来保存网站的所有配置信息。 */
@Entity
@Table(name = "z_option")
@AComment(comment="配置信息表，用来保存网站的所有配置信息。")
public class BaseOption implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	/** 主键ID */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", length=20)
	@AComment(comment="主键ID")
	private Integer id;
	
	/** 配置KEY */
	@Column(name="option_key", length=128)
	@AComment(comment="配置KEY")
	private String optionKey;
	
	/** 配置内容 */
	@Column(name="option_value", length=65535)
	@AComment(comment="配置内容")
	private String optionValue;
	
	
	
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getOptionKey() {
		return this.optionKey;
	}

	public void setOptionKey(String optionKey) {
		this.optionKey = optionKey;
	}
	
	public String getOptionValue() {
		return this.optionValue;
	}

	public void setOptionValue(String optionValue) {
		this.optionValue = optionValue;
	}
	

}
