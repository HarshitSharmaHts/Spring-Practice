package com.practice.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.jpa.UsersRepository;
import com.practice.model.Users;

@RestController
@RequestMapping("/jpa")
public class MyController {

	@Autowired
	private UsersRepository usersRepo;
	
	@GetMapping("/all")
	public List<Users> getAll() {
		return usersRepo.findAll();
	}
	
	@PostMapping("/add")
	public Users add( @RequestBody Users user) {
		return usersRepo.save(user);
	}
	
	@GetMapping("/name/{name}")
	public List<Users> getByName(@PathVariable("name") String name) {
		return usersRepo.findByName(name);
	}
}
