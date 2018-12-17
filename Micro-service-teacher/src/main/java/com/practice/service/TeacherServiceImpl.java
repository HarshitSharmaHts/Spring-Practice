package com.practice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.practice.dao.TeacherDao;
import com.practice.model.Teacher;

@Service
public class TeacherServiceImpl implements TeacherService {

	@Autowired
	@Qualifier("teacherDaoImpl")
	private TeacherDao dao;
	
	@Override
	public List<Teacher> getAllTeachers() {
		return dao.getAllTeachers();
	}

	@Override
	public Teacher getTeacher(int id) {
		return dao.getTeacher(id);
	}

}
