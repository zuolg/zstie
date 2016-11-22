package com.zuolg.zsite.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedResource;

/**
 * <pre>
 * 开发用得配置，用于配置跨域调用时的api server url
 * </pre>
 * 
 * @author 梁韦江
 */
@Configuration
@ConfigurationProperties(prefix = "debug.apiServer")
@ManagedResource(description = "开发界面配置", objectName = "dev:name=DebugApiServerConfig")
public class DebugApiServerConfig {
	private String url;

	@ManagedAttribute
	public String getUrl() {
		return url;
	}

	@ManagedAttribute(description = "服务器URL，例如：http://192.168.100.10:20000")
	public void setUrl(String url) {
		this.url = url;
	}

}
