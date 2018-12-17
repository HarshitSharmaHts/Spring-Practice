package com.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.model.Users;
import com.practice.repository.UsersRepository;

@RestController
public class DbController {

	@Autowired
	private UsersRepository usersRepo;

	@GetMapping("/")
	public String sayHello() {
		return "{\"status\":\"true\"}";
	}

	@GetMapping("/all")
	public List<Users> getAll () {
		return usersRepo.getAll();
	}

	@GetMapping("/{id}")
	public Users getByName(@PathVariable int id) {
		return usersRepo.getById(id);
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Users user) {
		usersRepo.add(user);
	}
	
	@PostMapping("/update")
	public Users update(@RequestBody Users user) {
		return usersRepo.update(user);
	}
}
