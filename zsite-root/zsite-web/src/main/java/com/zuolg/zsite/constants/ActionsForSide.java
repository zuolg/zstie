package com.zuolg.zsite.constants;

/**
 * <pre>
 * 管理侧URL
 * </pre>
 * 
 */
public interface ActionsForSide {
	public static final String ADMIN = "/admin";
	
	public static final String ADMIN_ALLARTICLE = "/allArticle";//所有文章
	public static final String ADMIN_EDITARTICLE = "/editArticle";//撰写文章
	public static final String ADMIN_CATEGORY = "/category";//分类
	public static final String ADMIN_CATEGORY_SAVE = "/category_save";//分类
	public static final String ADMIN_FEATURE = "/feature";//专题
	public static final String ADMIN_TAG = "/tag";//标签
	public static final String ADMIN_COMMENT = "/comment";//评论

	public static final String ADMIN_ALLPAGE = "/allPage";//所有页面
	public static final String ADMIN_NEWPAGE = "/newPage";//新建页面

	public static final String ADMIN_ALLATTACHMENT = "/allAttachment";//所有附件
	public static final String ADMIN_UPLOAD = "/upload";//上传

	public static final String ADMIN_ALLUSER = "/allUser";//所有用户
	public static final String ADMIN_ADDUSER = "/addUser";//添加
	public static final String ADMIN_USERINFO = "/userInfo";//我的资料
	
	
	public static final String ADMIN_OPTION = "/option";//常规
	

	public static final String ERROR_PATH= "/error";

	public static final String ADMIN_WELCOME = "/welcome";//常规
	
	
	
	
	public static final String LOGIN="login";
	public static final String LOGOUT="logout";
	public static final String LOG_SUBMIT="loginSubmit";
	public static final String INDEX="/index";
	public static final String LOAD="/load";
}
