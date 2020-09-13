package com.app.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.app.dto.User;

@Component
public class UserStorage {

	private List<User> list;

	public UserStorage() {
		this.list = new ArrayList<>();
	}
	
	public String save(User user) {
		for(User userExist:list) {
			if(userExist.getUsername()==user.getUsername())
				return "Username Exist";
		}
		list.add(user);
		return "User '"+user.getUsername()+"' is saved successfully";
	}
	
}
