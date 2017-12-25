package cn.lb.wxr.platform.model;

public class PlatformApp extends BaseModel {

	private static final long serialVersionUID = -3675589082961276304L;
	
	private String appID;
	private String appsecret;
	private Integer activated;
	
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
}
