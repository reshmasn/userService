package com.LTI.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LTI.userservice.entity.User;

public interface UserRepository extends JpaRepository<User,Integer>{

}
