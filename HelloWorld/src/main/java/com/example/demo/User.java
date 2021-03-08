package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {
	
	public void name() {
		System.out.println("Java in name method");
		
	}
	
	ComStud test = new ComStud();
	public void name1() {
		test.sub();
	}
	

	
	@Autowired  
	ComStud stud;
	public void name2() {
//		System.out.println("Java");
		stud.sub2();
	}

}
