package com.LTI.userservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import com.LTI.userservice.entity.User;
import com.LTI.userservice.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService Service;
	
//	@Autowired
//	RestTemplate restTemplate;
	
	@GetMapping("")
	public string getdata(){
		return "The User service is running successfully";
	}
	
	@PostMapping(value="/user")
	public void addUser(@RequestBody User user) {
		Service.addUser(user);
	}
	
	@PostMapping(value="/update/user")
	public User updateUser(@RequestBody User user) {
		return Service.update(user);
	}

	@GetMapping("/users")
	public List<User> getAllUsers(){
		return Service.findAll();
		}
	@GetMapping("/user/{id}")
	public Optional<User> getUserById(@PathVariable Integer id){
		return Service.findOne(id);
		
	}
	

	
}
