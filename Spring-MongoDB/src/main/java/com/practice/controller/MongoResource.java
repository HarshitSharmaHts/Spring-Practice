package com.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.model.Users;
import com.practice.repository.UsersRepository;

@RestController
@RequestMapping("/api")
public class MongoResource {

	@Autowired
	private UsersRepository userRepo;
	
	@GetMapping("/all")
	public List<Users> getAll() {
		return userRepo.findAll();
	}
	
	@GetMapping("/add/{fName}/{lName}")
	public Users addOne(@PathVariable("fName") String firstName, @PathVariable("lName") String lastName) {
		Users user = new Users(firstName, lastName);
		
		return userRepo.save(user);
	}
	
	
	public String sayHello() {
		return "Hello!";
	}
}
