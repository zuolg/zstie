package com.zuolg.commons.annotation.api;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * API接口的类注解
 * @ClassName AClass
 * @author zuolangguo
 * @date 2016年11月22日 上午9:48:30
 */
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AClass {
	
	/**
	 * 类名
	 * @return
	 */
	String value() default "";
}
