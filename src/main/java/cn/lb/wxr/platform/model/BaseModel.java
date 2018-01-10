package cn.lb.wxr.platform.model;

import java.io.Serializable;

public class BaseModel implements Serializable {
	
	private static final long serialVersionUID = -3311287897031228469L;
	
	private Integer id;
	
	/**
	 * 关键字，用于关键字查询
	 */
	private String keyword;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

}
