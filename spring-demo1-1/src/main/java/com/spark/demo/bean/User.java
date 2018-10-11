package com.spark.demo.bean;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="user")
public class User {
	
	private Long id;

	private String userName;

	private Date birthday;
	// 1-男 2-女 未知（保密） 
	private int sex;

	private String address;
	@Id 
	@Column(name="id")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	@Column(name="name")
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Column(name="birthday")
	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	@Column(name="sex")
	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}
	@Column(name="address")
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
