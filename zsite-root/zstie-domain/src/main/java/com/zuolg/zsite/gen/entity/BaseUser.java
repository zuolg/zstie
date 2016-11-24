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


/** 用户信息表，保存用户信息。 */
@Entity
@Table(name = "z_user")
@AComment(comment="用户信息表，保存用户信息。")
public class BaseUser implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	/** 主键ID */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", length=20)
	@AComment(comment="主键ID")
	private Integer id;
	
	/** 登陆名 */
	@Column(name="username", length=128)
	@AComment(comment="登陆名")
	private String username;
	
	/** 昵称 */
	@Column(name="nickname", length=128)
	@AComment(comment="昵称")
	private String nickname;
	
	/** 实名 */
	@Column(name="realname", length=128)
	@AComment(comment="实名")
	private String realname;
	
	/** 密码 */
	@Column(name="password", length=128)
	@AComment(comment="密码")
	private String password;
	
	/** 盐 */
	@Column(name="salt", length=32)
	@AComment(comment="盐")
	private String salt;
	
	/** 邮件 */
	@Column(name="email", length=64)
	@AComment(comment="邮件")
	private String email;
	
	/** 邮箱状态（是否认证等） */
	@Column(name="email_status", length=32)
	@AComment(comment="邮箱状态（是否认证等）")
	private String emailStatus;
	
	/** 手机电话 */
	@Column(name="mobile", length=32)
	@AComment(comment="手机电话")
	private String mobile;
	
	/** 手机状态（是否认证等） */
	@Column(name="mobile_status", length=32)
	@AComment(comment="手机状态（是否认证等）")
	private String mobileStatus;
	
	/** 固定电话 */
	@Column(name="telephone", length=32)
	@AComment(comment="固定电话")
	private String telephone;
	
	/** 金额（余额） */
	@Column(name="amount", precision=10, scale=2)
	@AComment(comment="金额（余额）")
	private Double amount;
	
	/** 性别 */
	@Column(name="gender", length=16)
	@AComment(comment="性别")
	private String gender;
	
	/** 权限 */
	@Column(name="role", length=32)
	@AComment(comment="权限")
	private String role;
	
	/** 签名 */
	@Column(name="signature", length=2048)
	@AComment(comment="签名")
	private String signature;
	
	/** 内容数量 */
	@Column(name="content_count", length=11)
	@AComment(comment="内容数量")
	private Integer contentCount;
	
	/** 评论数量 */
	@Column(name="comment_count", length=11)
	@AComment(comment="评论数量")
	private Integer commentCount;
	
	/** QQ号码 */
	@Column(name="qq", length=16)
	@AComment(comment="QQ号码")
	private String qq;
	
	/** 微信号 */
	@Column(name="wechat", length=32)
	@AComment(comment="微信号")
	private String wechat;
	
	/** 微博 */
	@Column(name="weibo", length=256)
	@AComment(comment="微博")
	private String weibo;
	
	/**  */
	@Column(name="facebook", length=256)
	@AComment(comment="")
	private String facebook;
	
	/**  */
	@Column(name="linkedin", length=256)
	@AComment(comment="")
	private String linkedin;
	
	/** 生日 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name="birthday")
	@AComment(comment="生日")
	private Date birthday;
	
	/** 公司 */
	@Column(name="company", length=256)
	@AComment(comment="公司")
	private String company;
	
	/** 职位、职业 */
	@Column(name="occupation", length=256)
	@AComment(comment="职位、职业")
	private String occupation;
	
	/** 地址 */
	@Column(name="address", length=256)
	@AComment(comment="地址")
	private String address;
	
	/** 邮政编码 */
	@Column(name="zipcode", length=128)
	@AComment(comment="邮政编码")
	private String zipcode;
	
	/** 个人网址 */
	@Column(name="site", length=256)
	@AComment(comment="个人网址")
	private String site;
	
	/** 毕业学校 */
	@Column(name="graduateschool", length=256)
	@AComment(comment="毕业学校")
	private String graduateschool;
	
	/** 学历 */
	@Column(name="education", length=256)
	@AComment(comment="学历")
	private String education;
	
	/** 头像 */
	@Column(name="avatar", length=256)
	@AComment(comment="头像")
	private String avatar;
	
	/** 证件类型：身份证 护照 军官证等 */
	@Column(name="idcardtype", length=128)
	@AComment(comment="证件类型：身份证 护照 军官证等")
	private String idcardtype;
	
	/** 证件号码 */
	@Column(name="idcard", length=128)
	@AComment(comment="证件号码")
	private String idcard;
	
	/** 状态 */
	@Column(name="status", length=32)
	@AComment(comment="状态")
	private String status;
	
	/** 创建日期 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name="created")
	@AComment(comment="创建日期")
	private Date created;
	
	/** 用户来源（可能来之oauth第三方） */
	@Column(name="create_source", length=128)
	@AComment(comment="用户来源（可能来之oauth第三方）")
	private String createSource;
	
	/** 最后的登陆时间 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name="logged")
	@AComment(comment="最后的登陆时间")
	private Date logged;
	
	/** 激活时间 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name="activated")
	@AComment(comment="激活时间")
	private Date activated;
	
	
	
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public String getRealname() {
		return this.realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}
	
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getSalt() {
		return this.salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}
	
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmailStatus() {
		return this.emailStatus;
	}

	public void setEmailStatus(String emailStatus) {
		this.emailStatus = emailStatus;
	}
	
	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public String getMobileStatus() {
		return this.mobileStatus;
	}

	public void setMobileStatus(String mobileStatus) {
		this.mobileStatus = mobileStatus;
	}
	
	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	public String getSignature() {
		return this.signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}
	
	public Integer getContentCount() {
		return this.contentCount;
	}

	public void setContentCount(Integer contentCount) {
		this.contentCount = contentCount;
	}
	
	public Integer getCommentCount() {
		return this.commentCount;
	}

	public void setCommentCount(Integer commentCount) {
		this.commentCount = commentCount;
	}
	
	public String getQq() {
		return this.qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}
	
	public String getWechat() {
		return this.wechat;
	}

	public void setWechat(String wechat) {
		this.wechat = wechat;
	}
	
	public String getWeibo() {
		return this.weibo;
	}

	public void setWeibo(String weibo) {
		this.weibo = weibo;
	}
	
	public String getFacebook() {
		return this.facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}
	
	public String getLinkedin() {
		return this.linkedin;
	}

	public void setLinkedin(String linkedin) {
		this.linkedin = linkedin;
	}
	
	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getOccupation() {
		return this.occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	public String getSite() {
		return this.site;
	}

	public void setSite(String site) {
		this.site = site;
	}
	
	public String getGraduateschool() {
		return this.graduateschool;
	}

	public void setGraduateschool(String graduateschool) {
		this.graduateschool = graduateschool;
	}
	
	public String getEducation() {
		return this.education;
	}

	public void setEducation(String education) {
		this.education = education;
	}
	
	public String getAvatar() {
		return this.avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	
	public String getIdcardtype() {
		return this.idcardtype;
	}

	public void setIdcardtype(String idcardtype) {
		this.idcardtype = idcardtype;
	}
	
	public String getIdcard() {
		return this.idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}
	
	public String getCreateSource() {
		return this.createSource;
	}

	public void setCreateSource(String createSource) {
		this.createSource = createSource;
	}
	
	public Date getLogged() {
		return this.logged;
	}

	public void setLogged(Date logged) {
		this.logged = logged;
	}
	
	public Date getActivated() {
		return this.activated;
	}

	public void setActivated(Date activated) {
		this.activated = activated;
	}
	

}
