package com.login.user.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.user.model.UserPojo;
import com.login.user.repository.LoginRespository;







@Service
public class LoginService {

	
	@Autowired
	LoginRespository loginRespository;
	
	public List<UserPojo> getAllUsers() {

		List<UserPojo> users = new ArrayList<>();
		loginRespository.findAll().forEach(users::add);
		
		return users;
		
	}

	public void addUser(UserPojo user) {
		
		loginRespository.save(user);
	}

	public String validate(UserPojo user) {
		
		List<UserPojo> list = loginRespository.findAll();
		for (UserPojo users : list) {

			if (user.getUserId().equals(users.getUserId()) && user.getPassword().equals(users.getPassword())) {
				return "valid user";
			}
		}
		return "Invalid User";
	
}
}