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

import com.zuolg.commons.annotation.AComment;


/** 内容表，用于存放比如文章、帖子、商品、问答等用户自定义模型内容。也用来存放比如菜单、购物车、消费记录等系统模型。 */
@Entity
@Table(name = "z_content")
@AComment(comment="内容表，用于存放比如文章、帖子、商品、问答等用户自定义模型内容。也用来存放比如菜单、购物车、消费记录等系统模型。")
public class BaseContent implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	/** 主键ID */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", length=20)
	@AComment(comment="主键ID")
	private Integer id;
	
	/** 标题 */
	@Column(name="title", length=65535)
	@AComment(comment="标题")
	private String title;
	
	/** 内容 */
	@Column(name="text", length=65535)
	@AComment(comment="内容")
	private String text;
	
	/** 摘要 */
	@Column(name="summary", length=65535)
	@AComment(comment="摘要")
	private String summary;
	
	/** 连接到(常用于谋文章只是一个连接) */
	@Column(name="link_to", length=256)
	@AComment(comment="连接到(常用于谋文章只是一个连接)")
	private String linkTo;
	
	/** 是否启用markdown */
	@Column(name="markdown_enable", length=1)
	@AComment(comment="是否启用markdown")
	private Integer markdownEnable;
	
	/** 缩略图 */
	@Column(name="thumbnail", length=128)
	@AComment(comment="缩略图")
	private String thumbnail;
	
	/** 模型 */
	@Column(name="module", length=32)
	@AComment(comment="模型")
	private String module;
	
	/** 样式 */
	@Column(name="style", length=32)
	@AComment(comment="样式")
	private String style;
	
	/** 用户ID */
	@Column(name="user_id", length=20)
	@AComment(comment="用户ID")
	private Integer userId;
	
	/** 匿名稿的用户 */
	@Column(name="author", length=128)
	@AComment(comment="匿名稿的用户")
	private String author;
	
	/** 匿名稿的邮箱 */
	@Column(name="user_email", length=128)
	@AComment(comment="匿名稿的邮箱")
	private String userEmail;
	
	/** IP地址 */
	@Column(name="user_ip", length=128)
	@AComment(comment="IP地址")
	private String userIp;
	
	/** 发布浏览agent */
	@Column(name="user_agent", length=65535)
	@AComment(comment="发布浏览agent")
	private String userAgent;
	
	/** 父级内容ID */
	@Column(name="parent_id", length=20)
	@AComment(comment="父级内容ID")
	private Integer parentId;
	
	/** 关联的对象ID */
	@Column(name="object_id", length=20)
	@AComment(comment="关联的对象ID")
	private Integer objectId;
	
	/** 排序编号 */
	@Column(name="order_number", length=11)
	@AComment(comment="排序编号")
	private Integer orderNumber;
	
	/** 状态 */
	@Column(name="status", length=32)
	@AComment(comment="状态")
	private String status;
	
	/** 支持人数 */
	@Column(name="vote_up", length=11)
	@AComment(comment="支持人数")
	private Integer voteUp;
	
	/** 反对人数 */
	@Column(name="vote_down", length=11)
	@AComment(comment="反对人数")
	private Integer voteDown;
	
	/** 评分分数 */
	@Column(name="rate", length=11)
	@AComment(comment="评分分数")
	private Integer rate;
	
	/** 评分次数 */
	@Column(name="rate_count", length=10)
	@AComment(comment="评分次数")
	private Integer rateCount;
	
	/** 价格 */
	@Column(name="price", length=10)
	@AComment(comment="价格")
	private Double price;
	
	/** 评论状态 */
	@Column(name="comment_status", length=32)
	@AComment(comment="评论状态")
	private String commentStatus;
	
	/** 评论总数 */
	@Column(name="comment_count", length=11)
	@AComment(comment="评论总数")
	private Integer commentCount;
	
	/** 最后评论时间 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name="comment_time")
	@AComment(comment="最后评论时间")
	private Date commentTime;
	
	/** 访问量 */
	@Column(name="view_count", length=11)
	@AComment(comment="访问量")
	private Integer viewCount;
	
	/** 创建日期 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name="created")
	@AComment(comment="创建日期")
	private Date created;
	
	/** 最后更新日期 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name="modified")
	@AComment(comment="最后更新日期")
	private Date modified;
	
	/** slug */
	@Column(name="slug", length=128)
	@AComment(comment="slug")
	private String slug;
	
	/** 标识 */
	@Column(name="flag", length=256)
	@AComment(comment="标识")
	private String flag;
	
	/** 经度 */
	@Column(name="lng", length=20)
	@AComment(comment="经度")
	private Double lng;
	
	/** 纬度 */
	@Column(name="lat", length=20)
	@AComment(comment="纬度")
	private Double lat;
	
	/** SEO关键字 */
	@Column(name="meta_keywords", length=256)
	@AComment(comment="SEO关键字")
	private String metaKeywords;
	
	/** SEO描述信息 */
	@Column(name="meta_description", length=256)
	@AComment(comment="SEO描述信息")
	private String metaDescription;
	
	/** 备注信息 */
	@Column(name="remarks", length=65535)
	@AComment(comment="备注信息")
	private String remarks;
	
	
	
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
	
	public String getSummary() {
		return this.summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}
	
	public String getLinkTo() {
		return this.linkTo;
	}

	public void setLinkTo(String linkTo) {
		this.linkTo = linkTo;
	}
	
	public Integer getMarkdownEnable() {
		return this.markdownEnable;
	}

	public void setMarkdownEnable(Integer markdownEnable) {
		this.markdownEnable = markdownEnable;
	}
	
	public String getThumbnail() {
		return this.thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	
	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}
	
	public String getStyle() {
		return this.style;
	}

	public void setStyle(String style) {
		this.style = style;
	}
	
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	public String getUserIp() {
		return this.userIp;
	}

	public void setUserIp(String userIp) {
		this.userIp = userIp;
	}
	
	public String getUserAgent() {
		return this.userAgent;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
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
	
	public Integer getOrderNumber() {
		return this.orderNumber;
	}

	public void setOrderNumber(Integer orderNumber) {
		this.orderNumber = orderNumber;
	}
	
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public Integer getVoteUp() {
		return this.voteUp;
	}

	public void setVoteUp(Integer voteUp) {
		this.voteUp = voteUp;
	}
	
	public Integer getVoteDown() {
		return this.voteDown;
	}

	public void setVoteDown(Integer voteDown) {
		this.voteDown = voteDown;
	}
	
	public Integer getRate() {
		return this.rate;
	}

	public void setRate(Integer rate) {
		this.rate = rate;
	}
	
	public Integer getRateCount() {
		return this.rateCount;
	}

	public void setRateCount(Integer rateCount) {
		this.rateCount = rateCount;
	}
	
	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public String getCommentStatus() {
		return this.commentStatus;
	}

	public void setCommentStatus(String commentStatus) {
		this.commentStatus = commentStatus;
	}
	
	public Integer getCommentCount() {
		return this.commentCount;
	}

	public void setCommentCount(Integer commentCount) {
		this.commentCount = commentCount;
	}
	
	public Date getCommentTime() {
		return this.commentTime;
	}

	public void setCommentTime(Date commentTime) {
		this.commentTime = commentTime;
	}
	
	public Integer getViewCount() {
		return this.viewCount;
	}

	public void setViewCount(Integer viewCount) {
		this.viewCount = viewCount;
	}
	
	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}
	
	public Date getModified() {
		return this.modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}
	
	public String getSlug() {
		return this.slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}
	
	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}
	
	public Double getLng() {
		return this.lng;
	}

	public void setLng(Double lng) {
		this.lng = lng;
	}
	
	public Double getLat() {
		return this.lat;
	}

	public void setLat(Double lat) {
		this.lat = lat;
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
	
	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	

}
