package com.zuolg.zsite.api.forms;

import java.util.Date;

import com.zuolg.commons.annotation.api.AForm;

/**
 * 用户登录
 * 
 * @ClassName LoginForm
 * @author zuolangguo
 * @date 2016年11月22日 上午10:56:56
 */
@AForm
public class TaxonomyForm {

	/** 主键ID */
	private Integer id;

	/** 标题 */
	private String title;

	/** 内容描述 */
	private String text;

	/** slug */
	private String slug;

	/** 类型 */
	private String type;

	/** 图标 */
	private String icon;

	/** 对于的内容模型 */
	private String contentModule;

	/** 该分类的内容数量 */
	private Integer contentCount;

	/** 排序编码 */
	private Integer orderNumber;

	/** 父级分类的ID */
	private Integer parentId;

	/** 关联的对象ID */
	private Integer objectId;

	/** 标识 */
	private String flag;

	/** 经度 */
	private Double lat;

	/** 纬度 */
	private Double lng;

	/** SEO关键字 */
	private String metaKeywords;

	/** SEO描述内容 */
	private String metaDescription;

	/** 创建日期 */
	private Date created;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getContentModule() {
		return contentModule;
	}

	public void setContentModule(String contentModule) {
		this.contentModule = contentModule;
	}

	public Integer getContentCount() {
		return contentCount;
	}

	public void setContentCount(Integer contentCount) {
		this.contentCount = contentCount;
	}

	public Integer getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(Integer orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public Integer getObjectId() {
		return objectId;
	}

	public void setObjectId(Integer objectId) {
		this.objectId = objectId;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public Double getLat() {
		return lat;
	}

	public void setLat(Double lat) {
		this.lat = lat;
	}

	public Double getLng() {
		return lng;
	}

	public void setLng(Double lng) {
		this.lng = lng;
	}

	public String getMetaKeywords() {
		return metaKeywords;
	}

	public void setMetaKeywords(String metaKeywords) {
		this.metaKeywords = metaKeywords;
	}

	public String getMetaDescription() {
		return metaDescription;
	}

	public void setMetaDescription(String metaDescription) {
		this.metaDescription = metaDescription;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

}
