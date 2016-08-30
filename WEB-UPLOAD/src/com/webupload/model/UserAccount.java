package com.webupload.model;

/**
 * UserAccount entity. @author MyEclipse Persistence Tools
 */

public class UserAccount implements java.io.Serializable {

	// Fields

	private Integer UId;
	private String UPassword;
	private String UName;

	// Constructors

	/** default constructor */
	public UserAccount() {
	}

	/** full constructor */
	public UserAccount(String UPassword, String UName) {
		this.UPassword = UPassword;
		this.UName = UName;
	}

	// Property accessors

	public Integer getUId() {
		return this.UId;
	}

	public void setUId(Integer UId) {
		this.UId = UId;
	}

	public String getUPassword() {
		return this.UPassword;
	}

	public void setUPassword(String UPassword) {
		this.UPassword = UPassword;
	}

	public String getUName() {
		return this.UName;
	}

	public void setUName(String UName) {
		this.UName = UName;
	}

}