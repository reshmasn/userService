package com.LTI.userservice.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LTI.userservice.entity.User;
import com.LTI.userservice.repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	
    @Autowired
	private UserRepository userRepository;
    
    
    public void addUser(User user) {
    	userRepository.save(user);
    }
    
    public User update(User user) {
    	if(userRepository.findById(user.getId()).isPresent()) {
    		return userRepository.save(user);
    	}
    	else {
    		return null;
    	}
    }
    
    public List<User> findAll(){
    	return (List<User>)userRepository.findAll();
    }
    
    public Optional<User> findOne(Integer id){
    	return userRepository.findById(id);
    }
	
}
