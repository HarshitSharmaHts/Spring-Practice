package com.practice.service;

import java.util.List;

import com.practice.model.Teacher;

public interface TeacherService {

	public List<Teacher> getAllTeachers();
	
	public Teacher getTeacher(int id);

}
