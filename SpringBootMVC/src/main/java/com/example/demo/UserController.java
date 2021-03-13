package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.UserRepo;
import com.example.demo.model.User;

@RestController

public class UserController {
	@Autowired
	UserRepo repo;
	
	@GetMapping("Users")
	public List<User>getUser(){
		List<User> user = repo.findAll();
		return user;
	}
	
	@GetMapping("User/{uid}")
	public User user(@PathVariable("uid") int uid){
		User user = repo.findById(uid).orElse(new User(0,""));
		return user;
	}
	
	@PostMapping("User")
//	@PostMapping()
	public User addUser(User user) {
		repo.save(user);
		return user;
	}

}






