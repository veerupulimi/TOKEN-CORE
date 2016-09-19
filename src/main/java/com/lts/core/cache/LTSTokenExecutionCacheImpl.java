package com.lts.core.cache;

import com.lts.core.context.ExecutionContext;


import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Component;


@Component(value = "ltsTokenExecutionCacheImpl")
public class LTSTokenExecutionCacheImpl implements LTSTokenExecutionCache {

	

	//private static final Logger logger = LoggerFactory.getLogger(LTSTokenExecutionCacheImpl.class);

	private CacheManager cacheManager;

	private Cache cache;

	/**
	 * @return the cacheManager
	 */
	public CacheManager getCacheManager() {
		return cacheManager;
	}

	/**
	 * @param cacheManager
	 *            the cacheManager to set
	 */
	public void setCacheManager(CacheManager cacheManager) {

		//logger.debug("setCacheManager called>>>>>>>>>" + cacheManager);

		this.cacheManager = cacheManager;

		cache = this.cacheManager.getCache(TOKEN_CACHE_NAME);
	}

	//@Override
	public void addUserToKenToCache(String token, ExecutionContext executionContext) {
		//logger.info("CacheName : " + cache.getName() + " putting logged user in this cache");
		cache.put(token, executionContext);
	}


	
}
