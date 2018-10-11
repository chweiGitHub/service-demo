//package com.spark.demo.controller;
//
//import java.util.Date;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import com.spark.demo.entity.User;
//import com.spark.demo.repository.UserRepository;
//
//@Controller
//@RequestMapping("/hibernate")
//@EnableAutoConfiguration
//public class HibernateController {
//
//	@Autowired
//	private UserRepository userRepository;
//
//	@RequestMapping("getUserById")
//	@ResponseBody
//	public User getUserById(Long id) {
//		System.out.println("通过id获取一个user: "+ id);
//		User u = userRepository.findOne(id);
//		System.out.println("userRepository: " + userRepository);
//		System.out.println("id: " + id);
//		System.out.println("获取到的user为：");
//		System.out.println(u.toString());
//		return u;
//	}
//
//	@RequestMapping("saveUser")
//	@ResponseBody
//	public void saveUser() {
//		System.out.println("保存一个user ...");
//		User u = new User();
//		u.setUserName("wan");
//		u.setAddress("江西省上饶市鄱阳县");
//		u.setBirthDay(new Date());
//		u.setSex("男");
//		userRepository.save(u);
//		System.out.println("保存完毕。。。");
//	}
//
//}