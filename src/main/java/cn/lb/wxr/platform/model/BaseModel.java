package cn.lb.wxr.platform.model;

import java.io.Serializable;

public class BaseModel implements Serializable {
	
	private static final long serialVersionUID = -3311287897031228469L;
	
	private Integer id;
	private Integer deleted;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getDeleted() {
		return deleted;
	}
	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}
}
