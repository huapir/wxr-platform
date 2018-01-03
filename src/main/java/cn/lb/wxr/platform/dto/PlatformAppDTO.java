package cn.lb.wxr.platform.dto;

import java.io.Serializable;

public class PlatformAppDTO implements Serializable {
	private static final long serialVersionUID = -4175496573391842517L;
	
	private Integer id;
	private String appID;		// 对应的微信公众appID
	private String appsecret;	// 对应的微信公众appsecret
	private Integer activated;	// 启用状态
	private String name;		// app名称
	private String description;	// app描述
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAppID() {
		return appID;
	}
	public void setAppID(String appID) {
		this.appID = appID;
	}
	public String getAppsecret() {
		return appsecret;
	}
	public void setAppsecret(String appsecret) {
		this.appsecret = appsecret;
	}
	public Integer getActivated() {
		return activated;
	}
	public void setActivated(Integer activated) {
		this.activated = activated;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
