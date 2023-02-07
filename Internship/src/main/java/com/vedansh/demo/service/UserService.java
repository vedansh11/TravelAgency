package com.vedansh.demo.service;

import java.util.List;

import com.vedansh.demo.entity.User;

public interface UserService {
	
	public List<User> getallUsers();
	public User registerUser(User user);
	public User showDetails(User user);

}
