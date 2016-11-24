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


/** 分类表。标签、专题、类别等都属于taxonomy。 */
@Entity
@Table(name = "z_taxonomy")
@AComment(comment="分类表。标签、专题、类别等都属于taxonomy。")
public class BaseTaxonomy implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	/** 主键ID */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", length=20)
	@AComment(comment="主键ID")
	private Integer id;
	
	/** 标题 */
	@Column(name="title", length=512)
	@AComment(comment="标题")
	private String title;
	
	/** 内容描述 */
	@Column(name="text", length=65535)
	@AComment(comment="内容描述")
	private String text;
	
	/** slug */
	@Column(name="slug", length=128)
	@AComment(comment="slug")
	private String slug;
	
	/** 类型 */
	@Column(name="type", length=32)
	@AComment(comment="类型")
	private String type;
	
	/** 图标 */
	@Column(name="icon", length=128)
	@AComment(comment="图标")
	private String icon;
	
	/** 对于的内容模型 */
	@Column(name="content_module", length=32)
	@AComment(comment="对于的内容模型")
	private String contentModule;
	
	/** 该分类的内容数量 */
	@Column(name="content_count", length=11)
	@AComment(comment="该分类的内容数量")
	private Integer contentCount;
	
	/** 排序编码 */
	@Column(name="order_number", length=11)
	@AComment(comment="排序编码")
	private Integer orderNumber;
	
	/** 父级分类的ID */
	@Column(name="parent_id", length=20)
	@AComment(comment="父级分类的ID")
	private Integer parentId;
	
	/** 关联的对象ID */
	@Column(name="object_id", length=20)
	@AComment(comment="关联的对象ID")
	private Integer objectId;
	
	/** 标识 */
	@Column(name="flag", length=256)
	@AComment(comment="标识")
	private String flag;
	
	/** 经度 */
	@Column(name="lat", length=20)
	@AComment(comment="经度")
	private Double lat;
	
	/** 纬度 */
	@Column(name="lng", length=20)
	@AComment(comment="纬度")
	private Double lng;
	
	/** SEO关键字 */
	@Column(name="meta_keywords", length=256)
	@AComment(comment="SEO关键字")
	private String metaKeywords;
	
	/** SEO描述内容 */
	@Column(name="meta_description", length=256)
	@AComment(comment="SEO描述内容")
	private String metaDescription;
	
	/** 创建日期 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name="created")
	@AComment(comment="创建日期")
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
	
	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public String getSlug() {
		return this.slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}
	
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String getIcon() {
		return this.icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}
	
	public String getContentModule() {
		return this.contentModule;
	}

	public void setContentModule(String contentModule) {
		this.contentModule = contentModule;
	}
	
	public Integer getContentCount() {
		return this.contentCount;
	}

	public void setContentCount(Integer contentCount) {
		this.contentCount = contentCount;
	}
	
	public Integer getOrderNumber() {
		return this.orderNumber;
	}

	public void setOrderNumber(Integer orderNumber) {
		this.orderNumber = orderNumber;
	}
	
	public Integer getParentId() {
		return this.parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	
	public Integer getObjectId() {
		return this.objectId;
	}

	public void setObjectId(Integer objectId) {
		this.objectId = objectId;
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
	
	public String getMetaKeywords() {
		return this.metaKeywords;
	}

	public void setMetaKeywords(String metaKeywords) {
		this.metaKeywords = metaKeywords;
	}
	
	public String getMetaDescription() {
		return this.metaDescription;
	}

	public void setMetaDescription(String metaDescription) {
		this.metaDescription = metaDescription;
	}
	
	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}
	

}
