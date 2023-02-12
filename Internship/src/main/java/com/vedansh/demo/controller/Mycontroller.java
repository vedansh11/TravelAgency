package com.vedansh.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.vedansh.demo.entity.User;
import com.vedansh.demo.service.UserService;

@Controller
public class Mycontroller {
	
	@Autowired
	private UserService userservice; 
	
	

	@GetMapping("/")
	public String register(Model model){
		User user = new User();
		model.addAttribute("user",user );
		return"Uinterface";
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute("user") User user, Model model) {
		
		userservice.registerUser(user);
		userservice.showDetails(user);
		model.addAttribute("user",user);
		
		
	return "details";
	}
	

	
}
