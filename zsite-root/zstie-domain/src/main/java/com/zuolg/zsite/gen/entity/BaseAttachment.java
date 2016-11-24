package com.zuolg.zsite.gen.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.zuolg.commons.apiServer.beans.AComment;


/** 附件表，用于保存用户上传的附件内容。 */
@Entity
@Table(name = "z_attachment")
@AComment(comment="附件表，用于保存用户上传的附件内容。")
public class BaseAttachment implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	/** ID主键 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", length=20)
	@AComment(comment="ID主键")
	private Integer id;
	
	/** 标题 */
	@Column(name="title", length=65535)
	@AComment(comment="标题")
	private String title;
	
	/** 上传附件的用户ID */
	@Column(name="user_id", length=20)
	@AComment(comment="上传附件的用户ID")
	private Integer userId;
	
	/** 附件所属的内容ID */
	@Column(name="content_id", length=20)
	@AComment(comment="附件所属的内容ID")
	private Integer contentId;
	
	/** 路径 */
	@Column(name="path", length=512)
	@AComment(comment="路径")
	private String path;
	
	/** mime */
	@Column(name="mime_type", length=128)
	@AComment(comment="mime")
	private String mimeType;
	
	/** 附件的后缀 */
	@Column(name="suffix", length=32)
	@AComment(comment="附件的后缀")
	private String suffix;
	
	/** 类型 */
	@Column(name="type", length=32)
	@AComment(comment="类型")
	private String type;
	
	/** 标示 */
	@Column(name="flag", length=256)
	@AComment(comment="标示")
	private String flag;
	
	/** 经度 */
	@Column(name="lat", length=20)
	@AComment(comment="经度")
	private Double lat;
	
	/** 纬度 */
	@Column(name="lng", length=20)
	@AComment(comment="纬度")
	private Double lng;
	
	/** 排序字段 */
	@Column(name="order_number", length=11)
	@AComment(comment="排序字段")
	private Integer orderNumber;
	
	/** 上传时间 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name="created")
	@AComment(comment="上传时间")
	private Date created;
	
	
	
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	public Integer getContentId() {
		return this.contentId;
	}

	public void setContentId(Integer contentId) {
		this.contentId = contentId;
	}
	
	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	public String getMimeType() {
		return this.mimeType;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}
	
	public String getSuffix() {
		return this.suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}
	
	public Double getLat() {
		return this.lat;
	}

	public void setLat(Double lat) {
		this.lat = lat;
	}
	
	public Double getLng() {
		return this.lng;
	}

	public void setLng(Double lng) {
		this.lng = lng;
	}
	
	public Integer getOrderNumber() {
		return this.orderNumber;
	}

	public void setOrderNumber(Integer orderNumber) {
		this.orderNumber = orderNumber;
	}
	
	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}
	

}
