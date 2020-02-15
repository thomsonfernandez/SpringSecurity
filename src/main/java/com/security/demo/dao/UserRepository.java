package com.security.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.security.demo.model.User;


public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByUsername(String username);

}
