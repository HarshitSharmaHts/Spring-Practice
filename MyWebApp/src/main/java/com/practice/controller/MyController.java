package com.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping("/index")
	public ModelAndView sayHello() {
		return new ModelAndView("hello","message","Hello Spring Boot Here!!");
	}
}
