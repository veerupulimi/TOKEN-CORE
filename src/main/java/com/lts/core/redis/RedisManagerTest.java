package com.lts.core.redis;

import redis.clients.jedis.Jedis;

public class RedisManagerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RedisManager redisManager = RedisManager.getInstance();
		redisManager.setHost("127.0.0.1");
		redisManager.setPort(6379);
		redisManager.setExpire(2);
		redisManager.setTimeout(0);
		redisManager.init();
		
		
		String key = "abc";
		UserMock u = new UserMock();
		u.setId("123");
		u.setLocked(true);
		u.setPassword("111");
		u.setSalt("222");
		u.setUsername("jack");
		
		byte[] xx = redisManager.set(key.getBytes(), SerializeUtils.serialize(u));
		
		//byte[] xy = redisManager.set(key.getBytes(), SerializeUtils.serialize(u));
		
		
		
		UserMock ss = (UserMock) SerializeUtils.deserialize(xx);
		
		System.out.println(ss.getUsername());
		
		Long jedis = redisManager.dbSize();
		System.out.println(jedis);
		

	}

}
