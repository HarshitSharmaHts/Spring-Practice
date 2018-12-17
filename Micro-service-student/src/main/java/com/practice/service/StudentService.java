package com.practice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.dao.StudentDaoImpl;
import com.practice.model.Student;

@Service
public class StudentService {
	
	@Autowired
	private StudentDaoImpl dao;
	
	public List<Student> getAllStudents() {
		return dao.getAllStudents();
	}
	
	public Student getStudent(int id) {
		return dao.getStudent(id);
	}
}
