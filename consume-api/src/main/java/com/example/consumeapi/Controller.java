package com.example.consumeapi;

import com.example.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {

    private static final String API_URL = "https://jsonplaceholder.typicode.com/users";
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/users")
    public User[] getAllUser() {
//    	restTemplate.
        return restTemplate.getForObject(API_URL, User[].class);
    }
}
