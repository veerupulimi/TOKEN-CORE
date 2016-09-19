package com.lts.core.context;

import java.io.Serializable;
import java.util.Locale;

public class ExecutionContext implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -421329771484960425L;
	private String securityToken;
	private String userName;
	//private Long companyId;
	//private String clientIPAddress;
	//private Locale locale;
	private Long sessionTimeOut;
	/* Last accessed time */
	private long lastAccessedTimestamp;
	//private Long loginHistoryID;

	
	
	public String getSecurityToken() {
		return securityToken;
	}
	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
//	public String getClientIPAddress() {
//		return clientIPAddress;
//	}
//	public void setClientIPAddress(String clientIPAddress) {
//		this.clientIPAddress = clientIPAddress;
//	}
//	public Locale getLocale() {
//		return locale;
//	}
//	public void setLocale(Locale locale) {
//		this.locale = locale;
//	}
	public Long getSessionTimeOut() {
		return sessionTimeOut;
	}
	public void setSessionTimeOut(Long sessionTimeOut) {
		this.sessionTimeOut = sessionTimeOut;
	}
	public long getLastAccessedTimestamp() {
		return lastAccessedTimestamp;
	}
	public void setLastAccessedTimestamp(long lastAccessedTimestamp) {
		this.lastAccessedTimestamp = lastAccessedTimestamp;
	}
//	public Long getLoginHistoryID() {
//		return loginHistoryID;
//	}
//	public void setLoginHistoryID(Long loginHistoryID) {
//		this.loginHistoryID = loginHistoryID;
//	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
