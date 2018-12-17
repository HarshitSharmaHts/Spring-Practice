package com.practice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTController {

	@RequestMapping("/")
	public String sayHello() {
		return "Hi!";
	}
	
	@RequestMapping("/admin")
	public String admin() {
		return "Hi, Admin Here!";
	}
	
	@RequestMapping("/user")
	public String user() {
		return "Hi, User Here!";
	}
	
	@RequestMapping("/not-protected")
	public String notProtected() {
		return "Not Protected!!";
	}
}
