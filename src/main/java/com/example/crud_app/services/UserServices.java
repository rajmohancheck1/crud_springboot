package com.example.crud_app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud_app.model.User;
import com.example.crud_app.repository.UserRepository;


@Service
public class UserServices {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> getAllUsers(){
		
		return userRepository.findAll();
	}
	
	public User createUser(User user) {
		
		return userRepository.save(user);
		
	}
	
	public User getsingleUser(Long id) {
		
		return userRepository.findById(id);
	}
	
	public void deleteuser(Long id) {
		
		userRepository.deleteById(id);
		
		
	}

}
