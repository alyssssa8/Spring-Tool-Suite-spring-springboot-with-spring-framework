package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		//		SpringApplication return ApplicationContext
		//		BeanFactory  / packages org.springframework.beans
		//		ApplicationContext / packages org.springframework.context

		//		The BeanFactory interface provides an advanced configuration 
		//		mechanism capable of managing any type of object. 
		//		ApplicationContext is a sub-interface of BeanFactory.

		
		ApplicationContext context = SpringApplication.run(HelloWorldApplication.class, args);
		// this is dependency injection, inject the User class. 
		User obj = context.getBean(User.class); // in User class, need to add @Component	
		obj.name();
		obj.name1();
		obj.name2();
		
	}
	
	
}
