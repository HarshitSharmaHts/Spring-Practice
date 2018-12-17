package com.practice.dao;

import java.util.List;

import com.practice.model.Student;

public interface StudentDao {
	
	public List<Student> getAllStudents();
	
	public Student getStudent(int id);
}
