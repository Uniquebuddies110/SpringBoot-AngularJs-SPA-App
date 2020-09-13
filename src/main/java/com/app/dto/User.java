package com.app.dto;

public class User {

	private String username;
	private String password;
	private String email;
	private Long phoneNo;

	public User() {
		super();
	}

	public User(String username, String password, String email, Long phoneNo) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.phoneNo = phoneNo;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", email=" + email + ", phoneNo=" + phoneNo
				+ "]";
	}

}
