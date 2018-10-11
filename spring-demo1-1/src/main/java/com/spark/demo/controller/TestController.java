package com.spark.demo.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spark.demo.bean.User;
import com.spark.demo.dao.UserRepository; 

@RestController
@RequestMapping("/test") 
public class TestController {

	@RequestMapping("/hello")
	public String test() {
		return "hello spring boot ..."; 
	} 
	
	@Autowired
	private UserRepository userRepository; 
	
    @RequestMapping("/queryall")
    @ResponseBody
    public List<User> queryAll(){
        List<User> list = new ArrayList<User>();
        list = userRepository.findAll();
        return list;
    }

    @RequestMapping("/querybyid")
    @ResponseBody
    public User queryById(@RequestParam Long id){
    	User user = userRepository.findById(id).get();
        return user;
    }

    @RequestMapping("/deletebyid")
    public void deleteById(@RequestParam Long id){
    	userRepository.deleteById(id);
    }

    @RequestMapping("/insert")
    public void insert(@RequestParam Long id,@RequestParam String userName,@RequestParam @DateTimeFormat(pattern="yyyy-MM-dd") Date birthday, @RequestParam int sex, @RequestParam String address){
        User user = new User();
        user.setId(id);
        user.setUserName(userName);
        user.setBirthday(birthday); 
        user.setSex(sex); 
        user.setAddress(address);
        userRepository.save(user); 
    }

    @RequestMapping("/update")
    public void update(@RequestParam Long id,@RequestParam String userName,@RequestParam Date birthday, @RequestParam int sex, @RequestParam String address){
        User user = userRepository.findById(id).get();
        user.setUserName(userName);
        user.setBirthday(birthday); 
        user.setSex(sex); 
        user.setAddress(address);
        userRepository.save(user);

    }
}
