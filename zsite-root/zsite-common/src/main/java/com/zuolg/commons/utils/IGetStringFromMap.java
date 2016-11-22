package com.zuolg.commons.utils;

/**
 * <pre>
 * 用于StringUtil中的getStringFromMap方法
 * </pre>
 * 
 * @see StringUtils#getStringFromMap(String, IGetStringFromMap)
 * 
 */
public interface IGetStringFromMap {
	String get(String key);
}
