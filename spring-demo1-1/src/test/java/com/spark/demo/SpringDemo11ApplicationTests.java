package com.spark.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import com.spark.demo.bean.User;
import com.spark.demo.dao.UserRepository;

@RunWith(SpringRunner.class)
//@SpringBootTest
public class SpringDemo11ApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	private UserRepository usRepository;

	@Test
	public void insertTest() {
		User userInfo = new User();
		userInfo.setUserName("张三");
		userInfo.setSex("1");
		usRepository.save(userInfo);
	}

}
