package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.UserDao;
import com.tka.model.Users;

@Service
public class UserService {

	@Autowired
	UserDao ud;
    
	public void saveUser(Users user) {
		ud.saveUser(user);
	}

	public boolean verifyLoginDetails(Users user) {
		return ud.verifyLoginDetails(user);
	}

	public List<Users> getAllUsers() {
		return ud.getAllUsers();
	}

	
}
