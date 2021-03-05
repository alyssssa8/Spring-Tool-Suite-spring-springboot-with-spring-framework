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
	public User userF(@PathVariable("uid") int uid){
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




//
//Question
//Given two cells on the standard chess board, determine whether they have the same color or not. The format of the input is a letter (A-H)  indicating the column, followed by a number (1-8) indicating the row. E.g. “A1” - “H8”.
//
//The signature of the method should be:
//boolean isColorMatch(String cell1, String cell2)
//Example
//For cell1 = "A1" and cell2 = "C3", the output should be
//isColorMatch(cell1, cell2) = true.
//boolean isColorMatch(String cell1, String cell2){
// 	Boolean flag1 = isDark(cell1);
//Boolean flag2 = isDark(cell2);
//	Return flag1== flag2;
//}
//
//
//
//
//
//Private boolean isDark(String cell){
//
//(A-’A’ )% 2 == 0 && (1 -’1’)%2 ==0;
//
//}




