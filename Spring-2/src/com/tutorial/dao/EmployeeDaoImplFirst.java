package com.tutorial.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tutorial.model.Employee;

@Repository
public class EmployeeDaoImplFirst implements EmployeeDAO {

	public List<Employee> getAllEmployee() {
		List<Employee> lst = new ArrayList<Employee>();
		
		lst.add(new Employee(1,"Harshit","Sharma"));
		lst.add(new Employee(2,"Yagika","Kaushik"));
		lst.add(new Employee(3,"Anmol","Singh"));
		lst.add(new Employee(4,"Anjula","Chouhan"));
		
		return lst;
	}

}
