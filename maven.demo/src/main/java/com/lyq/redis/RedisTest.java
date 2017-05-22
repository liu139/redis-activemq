package com.lyq.redis;

import org.junit.Test;

import redis.clients.jedis.Jedis;

public class RedisTest {

Jedis jedis = new Jedis("localhost");
	
	public void test() {
		// 连接本地的 Redis 服务
		System.out.println("Connection to server sucessfully");
		// 查看服务是否运行
		System.out.println("Server is running: " + jedis.ping());
	}

	@Test
	public void setString(){
		//设置 redis 字符串数据
	      jedis.set("lyq", "hello123");
	     // 获取存储的数据并输出
	     System.out.println("获取值为： "+ jedis.get("lyq"));
	}
}
