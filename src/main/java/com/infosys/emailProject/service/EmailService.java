package com.infosys.emailProject.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.emailProject.persistence.domain.Users;
import com.infosys.emailProject.persistence.respository.UserRepo;

@Service
public class EmailService {
	
	@Autowired
	private UserRepo userRepo;

	public boolean usernameExists(String username) {
		return userRepo.existsById(username);
	}

	public String createAccount(Users user) {
		userRepo.save(user);
		return "Account Created Successfully";
	}

	public boolean isLoginValid(Users user) {
		Optional<Users> userOp = userRepo.findById(user.getUsername());
		
		if (userOp.isPresent() == false) {
			return false;
		}
		
		Users dbUser = userOp.get();
		if (dbUser.getPassword().equals(user.getPassword())) {
			return true;
		}
		
		return false;
	}

}
