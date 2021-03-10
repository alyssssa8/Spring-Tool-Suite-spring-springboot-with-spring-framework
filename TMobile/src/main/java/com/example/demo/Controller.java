package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.User;

@RestController
public class Controller {
	@Autowired
//	
//	@Bean
//	public RestTemplate getRestTemplate() {
//		return new RestTemplate();
//	}
	
	
	private RestTemplate restTemplate;
	
//	equal to above
//	RestTemplate restTemplate = new RestTemplate();
	@GetMapping("/users")
	public List<Object> getUsers(){
		String url = "https://jsonplaceholder.typicode.com/users";
		User[] users = restTemplate.getForObject(url, User[].class);
		
		return Arrays.asList(users);

		
	}

	
}
