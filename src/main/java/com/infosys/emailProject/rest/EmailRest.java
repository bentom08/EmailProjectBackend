package com.infosys.emailProject.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.emailProject.persistence.domain.Users;
import com.infosys.emailProject.service.EmailService;

@RestController
public class EmailRest {

	@Autowired
	private EmailService service;
	
	@GetMapping("/usernameExists/{username}")
	public boolean usernameExists(@PathVariable String username) {
		return service.usernameExists(username);
	}
	
	@PostMapping("/createAccount")
	public String createAccount(@RequestBody Users user) {
		return service.createAccount(user);
	}
	
	@PostMapping("/isLoginValid")
	public boolean isLoginValid(@RequestBody Users user) {
		return service.isLoginValid(user);
	}
}
