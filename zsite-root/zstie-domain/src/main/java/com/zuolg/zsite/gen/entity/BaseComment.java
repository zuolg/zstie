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


/** 评论表，用于保存content内容的回复、分享、推荐等信息。 */
@Entity
@Table(name = "z_comment")
@AComment(comment="评论表，用于保存content内容的回复、分享、推荐等信息。")
public class BaseComment implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	/** 主键ID */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", length=20)
	@AComment(comment="主键ID")
	private Integer id;
	
	/** 回复的评论ID */
	@Column(name="parent_id", length=20)
	@AComment(comment="回复的评论ID")
	private Integer parentId;
	
	/** 评论的内容ID */
	@Column(name="content_id", length=20)
	@AComment(comment="评论的内容ID")
	private Integer contentId;
	
	/** 评论的内容模型 */
	@Column(name="content_module", length=32)
	@AComment(comment="评论的内容模型")
	private String contentModule;
	
	/** 评论的回复数量 */
	@Column(name="comment_count", length=11)
	@AComment(comment="评论的回复数量")
	private Integer commentCount;
	
	/** 排序编号，常用语置顶等 */
	@Column(name="order_number", length=11)
	@AComment(comment="排序编号，常用语置顶等")
	private Integer orderNumber;
	
	/** 评论的用户ID */
	@Column(name="user_id", length=20)
	@AComment(comment="评论的用户ID")
	private Integer userId;
	
	/** 评论的IP地址 */
	@Column(name="ip", length=64)
	@AComment(comment="评论的IP地址")
	private String ip;
	
	/** 评论的作者 */
	@Column(name="author", length=128)
	@AComment(comment="评论的作者")
	private String author;
	
	/** 评论的类型，默认是comment */
	@Column(name="type", length=32)
	@AComment(comment="评论的类型，默认是comment")
	private String type;
	
	/** 评论的内容 */
	@Column(name="text", length=65535)
	@AComment(comment="评论的内容")
	private String text;
	
	/** 提交评论的浏览器信息 */
	@Column(name="agent", length=65535)
	@AComment(comment="提交评论的浏览器信息")
	private String agent;
	
	/** 评论的时间 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name="created")
	@AComment(comment="评论的时间")
	private Date created;
	
	/** 评论的slug */
	@Column(name="slug", length=128)
	@AComment(comment="评论的slug")
	private String slug;
	
	/** 评论用户的email */
	@Column(name="email", length=64)
	@AComment(comment="评论用户的email")
	private String email;
	
	/** 评论的状态 */
	@Column(name="status", length=32)
	@AComment(comment="评论的状态")
	private String status;
	
	/** “顶”的数量 */
	@Column(name="vote_up", length=11)
	@AComment(comment="“顶”的数量")
	private Integer voteUp;
	
	/** “踩”的数量 */
	@Column(name="vote_down", length=11)
	@AComment(comment="“踩”的数量")
	private Integer voteDown;
	
	/** 标识 */
	@Column(name="flag", length=256)
	@AComment(comment="标识")
	private String flag;
	
	/** 纬度 */
	@Column(name="lat", length=20)
	@AComment(comment="纬度")
	private Double lat;
	
	/** 经度 */
	@Column(name="lng", length=20)
	@AComment(comment="经度")
	private Double lng;
	
	
	
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getParentId() {
		return this.parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	
	public Integer getContentId() {
		return this.contentId;
	}

	public void setContentId(Integer contentId) {
		this.contentId = contentId;
	}
	
	public String getContentModule() {
		return this.contentModule;
	}

	public void setContentModule(String contentModule) {
		this.contentModule = contentModule;
	}
	
	public Integer getCommentCount() {
		return this.commentCount;
	}

	public void setCommentCount(Integer commentCount) {
		this.commentCount = commentCount;
	}
	
	public Integer getOrderNumber() {
		return this.orderNumber;
	}

	public void setOrderNumber(Integer orderNumber) {
		this.orderNumber = orderNumber;
	}
	
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}
	
	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public String getAgent() {
		return this.agent;
	}

	public void setAgent(String agent) {
		this.agent = agent;
	}
	
	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}
	
	public String getSlug() {
		return this.slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}
	
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
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
	

}
