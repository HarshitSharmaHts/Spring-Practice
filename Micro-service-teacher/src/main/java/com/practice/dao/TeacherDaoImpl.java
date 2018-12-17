package com.practice.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.practice.model.Teacher;

@Repository
public class TeacherDaoImpl implements TeacherDao {

	private static List<Teacher> teachers;
	
	public TeacherDaoImpl() {
		teachers = new ArrayList<>();
		teachers.add(new Teacher("Manoj","Sharma",1));
		teachers.add(new Teacher("Sudhir","Kaicker",2));
		teachers.add(new Teacher("Nidhi","Gupta",3));
		teachers.add(new Teacher("Manish","Hurkat",4));
	}
	
	@Override
	public List<Teacher> getAllTeachers() {
		return teachers;
	}

	@Override
	public Teacher getTeacher(int id) {
		return teachers
				.parallelStream()
				.filter(e->e.getId() == id)
				.findFirst()
				.get();
	}

}
