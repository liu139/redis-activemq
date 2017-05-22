package com.lyq.activemq;

import javax.jms.Destination;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
*@Author: lilixin
*@Date: 2016年10月14日
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xm")
public class ProducerConsumerTest {
	
	@Autowired
	private ProducerService producerService;
	@Autowired
	@Qualifier("queueDestination")
	private Destination destination;

	@Test
	public void test(){
		for (int i = 0; i < 5; i++) {
			producerService.sendMessage(destination, "你好，生产者！这是消息：" + (i+1));
		}
	}
}
