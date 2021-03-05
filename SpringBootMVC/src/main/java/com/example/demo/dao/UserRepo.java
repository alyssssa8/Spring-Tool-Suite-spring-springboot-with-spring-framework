package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.User;




public interface UserRepo extends JpaRepository<User, Integer>  {
	
	List<User> getUserByUname(String uname);

//	List<User> findByUnameOrderByUidAsc(String uname);
	
	List<User> findByUnameOrderByUidDesc(String uname);
	
	
	
	@Query("from User where uname= :name")
	List<User> find(@Param("name") String uname);

}

