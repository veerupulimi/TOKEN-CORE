package com.lts.core.cache;

import com.lts.core.context.ExecutionContext;

public interface LTSTokenExecutionCache {
	
	static final String TOKEN_CACHE_NAME = "tokenExceutionContextCache";
//	static final String USER_CACHE = "userCache";
//	static final String ROLE_ACTIONS_CACHE = "roleActionsCache";
//	static final String IP_LOGIN_ATTEMPTS_CACHE = "ipLoginAttemptCache";
//	
//	List<Object> getAllUserTokensFromCache();
//
//	Object getData(Object key);
//
//	Object getIPData(Object key);

	void addUserToKenToCache(String token, ExecutionContext executionContext);

	//void updateUserToKenToCache(String token, ExecutionContext executionContext);

//	void invalidateUserToken(String userToken);
//
//	boolean isUserTokenInCache(String userToken);
//
//	void logAllElementsFromCache(String cacheName);
//
//	void removeElementFromCache(String cacheName, String key);
//
//	void removeElementFromCache(String roleActionsCache, Long roleId);
//
//	void updateIPLoginAttemptsInCache(String key, Integer loginAttempts);
//
//	boolean isUserTokenInCache(String userName, String userIP);
//
//	String getUserTokenFromCache(String userName, String userIP);
//	
//	String addUserTempTokeninCache(String tempToken,String userName);

}
