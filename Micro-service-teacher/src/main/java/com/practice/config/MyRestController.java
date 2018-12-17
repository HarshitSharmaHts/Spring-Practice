package com.practice.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.practice.model.Teacher;
import com.practice.service.TeacherService;

@RestController
public class MyRestController {

	@Autowired
	@Qualifier("teacherServiceImpl")
	private TeacherService service;
	
	@GetMapping("/")
	public List<Teacher> getAllTeachers() {
		return service.getAllTeachers();
	}
	
	@GetMapping("/{id}")
	public Teacher getTeacher(@PathVariable("id") int id) {
		return service.getTeacher(id);
	}
}
