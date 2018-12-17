package com.practice.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.practice.model.Student;
import com.practice.service.StudentService;

@RestController
public class MyRESTController {

	@Autowired
	private StudentService service;
	
	@GetMapping("/")
	public List<Student> getAllStudents()  {
		
		return service.getAllStudents();
	}

	@GetMapping("/{id}")
	public Student getStudent(@PathVariable("id") int id) {
		return service.getStudent(id);
	}
}
