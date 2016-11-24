package com.zuolg.zsite.gen.enums;

/**
 * 
 * @ClassName UserStatus
 * @author zuolangguo
 * @date 2016年11月22日 下午3:53:32
 */
public enum UserStatus {
	DISABLE	(0, "停用"),
	ENABLE	(1, "启用"),
	UNKNOWN	(-100, "未知");
	private final int code;
	private final String name;

	private UserStatus(int code, String name) {
		this.code = code;
		this.name = name;
	}

	public boolean isEnable() {
		return (getCode() == ENABLE.getCode());
	}

	public boolean isDisable() {
		return (getCode() == DISABLE.getCode());
	}

	public boolean isUnknown() {
		return (getCode() == UNKNOWN.getCode());
	}


	public String getName() {
		return name;
	}

	public int getCode() {
		return code;
	}
	
	public static UserStatus parse(int code) {
		UserStatus[] values = UserStatus.values();
		for (UserStatus value : values) {
			if (value.getCode() == code) {
				return value;
			}
		}
		return UNKNOWN;
	}
	
}
