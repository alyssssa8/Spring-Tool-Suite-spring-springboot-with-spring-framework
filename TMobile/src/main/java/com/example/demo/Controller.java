package com.example.demo;

import java.net.http.HttpHeaders;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
//	RestTemplate restTemplate;
	
//	equal to above
//	RestTemplate restTemplate = new RestTemplate();
	@GetMapping("/users")
	public List<Object> getUsers(){
		String url = "https://jsonplaceholder.typicode.com/users";
		User[] users = restTemplate.getForObject(url, User[].class);
		
		return Arrays.asList(users);	
	}
	
//	 @RequestMapping(value = "https://jsonplaceholder.typicode.com/users")
//	 public String getProductList() {
//	      org.springframework.http.HttpHeaders headers = new org.springframework.http.HttpHeaders();
//	      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//	      HttpEntity <String> entity = new HttpEntity<String>(headers);
//	      
//	      return restTemplate.exchange("http://localhost:8080/products", HttpMethod.GET, entity, String.class).getBody();
//	   }
	
}
