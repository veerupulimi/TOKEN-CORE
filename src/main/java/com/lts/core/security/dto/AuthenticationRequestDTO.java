package com.lts.core.security.dto;

import java.io.Serializable;

public class AuthenticationRequestDTO {

	
	private String username;
	 private String password;
	 
	 public String getUserName() {
		return username;
	}
	public void setUserName(String userName) {
		this.username = userName;
	}
	public String getPassWord() {
		return password;
	}
	public void setPassWord(String passWord) {
		this.password = passWord;
	}
	
	
	

}
