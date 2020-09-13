package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.app.dao.UserStorage;
import com.app.dto.User;

@Service
public class UserService {

	@Autowired
	private UserStorage store;

	public ResponseEntity<String> saveUser(User user) {
		String msg=store.save(user);
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
}
