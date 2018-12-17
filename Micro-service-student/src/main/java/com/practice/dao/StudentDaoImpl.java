package com.practice.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.practice.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

	private static List<Student> students;
	
	public StudentDaoImpl() {
		students = new ArrayList<>();
		students.add(new Student("Harshit", "Sharma",1));
		students.add(new Student("Yagika", "Kaushik",2));
		students.add(new Student("Anmol", "Singh",3));
		students.add(new Student("Jane", "Sumeal",4));
		students.add(new Student("Anjula", "Chouhan",5));
	}
	
	@Override
	public List<Student> getAllStudents() {
		return students;
	}
	
	@Override
	public Student getStudent(int id) {
		return students
					.parallelStream()
					.filter(e->e.getId()==id)
					.findFirst()
					.get();
	}
}
