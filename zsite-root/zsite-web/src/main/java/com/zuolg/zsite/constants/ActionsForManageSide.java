package com.zuolg.zsite.constants;

/**
 * <pre>
 * 管理侧URL
 * </pre>
 * 
 */
public interface ActionsForManageSide {
	public static final String PREFIX = "/manage/";
	public static final String ERROR_PATH= "/error";
	public static final String USER_USER_LIST = "userList";
	public static final String USER_CHANGE_USER_PWD = "changePwd";
	public static final String USER_SAVE_USER = "saveUser";
	public static final String USER_DISABLE_USER = "disableUser";
	public static final String USER_ENABLE_USER = "enableUser";
	public static final String USER_RESET_USER_PWD = "resetUserPwd";
	public static final String USER_GET_USER_INFO = "getUserInfo";

	public static final String ENT_ENT_DATA_LIST = "list";
	public static final String ENT_ENT_DATA_DETAIL = "detail";
	public static final String ENT_AUDIT_ENT_DATA = "audit";
	public static final String ENT_UNLOCK_ENT_DATA = "unlock";
	public static final String DOWNLOAD = "download";
	
	public static final String USER_LOGIN_PREFX="/user/";
	public static final String LOGIN="login";
	public static final String LOGOUT="logout";
	public static final String LOG_SUBMIT="loginSubmit";
	public static final String INDEX="/index";
	public static final String LOAD="/load";
}
