package com.LTI.userservice.service;

import java.util.List;
import java.util.Optional;


import com.LTI.userservice.entity.User;


public interface UserService {
	
	public void addUser(User user);
	public User update(User user);
	public List<User> findAll();
	public Optional<User> findOne(Integer id);

}
