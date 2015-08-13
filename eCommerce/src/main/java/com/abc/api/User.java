package com.abc.api;

import java.util.Date;

public class User {
	
	private String userName = "";
	private String password = "";
	private String fName = "";
	private String lName = "";
	private String userId = "";
	private Date lastLoginDate;
	
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
	public String getfName() {
		return fName;
	}
	public String getlName() {
		return lName;
	}
	public String getUserId() {
		return userId;
	}
	public Date getLastLoginDate() {
		return lastLoginDate;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}
	

}
