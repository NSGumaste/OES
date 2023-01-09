package com.oes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.oes.entity.user;
import com.oes.repository.userrepository;

@RestController
@RequestMapping("/api/v1/")
public class usercontroller {
		@Autowired
		private userrepository userrepository;
	
		@GetMapping("/users")
		public List<user> getAllUsers(){
		return userrepository.findAll();
			
	}
}
