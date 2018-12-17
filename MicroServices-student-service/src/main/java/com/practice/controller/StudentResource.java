package com.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.practice.model.Users;

@RestController
public class StudentResource {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/")
	public String sayHello() {
		return "{\"status\":\"true\"}";
	}
	
	@GetMapping("/all")
	public List<Users> getAll() {
		ResponseEntity<List<Users>> response = restTemplate.exchange(
									"http://db-service/all",
									HttpMethod.GET,
									null,
									new ParameterizedTypeReference<List<Users>>() {}
								);
		return response.getBody();
	}
}
