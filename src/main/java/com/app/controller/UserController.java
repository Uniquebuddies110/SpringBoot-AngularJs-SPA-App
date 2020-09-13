package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.dto.User;
import com.app.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService; 
	
	@RequestMapping("/home")
	public String homePage() {
		return "Home";
	}
	
	@RequestMapping("/userReg")
	public String userRegPage() {
		return "userReg";
	}
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<String> userRegisterPage(@RequestBody User user) {
		System.out.println("Application.userRegPage()");
		System.out.println("user: "+user);
		return userService.saveUser(user);
	}
	

	@RequestMapping("/displayUsers")
	public String displayUsersPage() {
		return "displayUsers";
	}

	@RequestMapping("/deleteUser")
	public String deleteUserPage() {
		return "deleteUser";
	}

}
