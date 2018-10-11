package com.spark.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.spark.demo.bean.User;


//@Repository
//@Table(name="user")
//@Qualifier("userRepository")
public interface UserRepository extends JpaRepository<User, Long>{
//	public User findOne(Long id);
//
//	public User save(User u);
//
//	@Query("select t from User t where t.userName=:name")
//	public User findUserByName(@Param("name") String name);
}
