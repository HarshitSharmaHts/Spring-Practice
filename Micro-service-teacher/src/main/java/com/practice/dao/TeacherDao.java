package com.practice.dao;

import java.util.List;

import com.practice.model.Teacher;

public interface TeacherDao {

	public List<Teacher> getAllTeachers();
	
	public Teacher getTeacher(int id);

}
