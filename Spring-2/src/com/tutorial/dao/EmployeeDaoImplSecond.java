package com.tutorial.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tutorial.model.Employee;

@Repository
public class EmployeeDaoImplSecond implements EmployeeDAO {

	public List<Employee> getAllEmployee() {
		
		List<Employee> lst = new ArrayList<Employee>();
		
		lst.add(new Employee(1,"Archit","Kaila"));
		lst.add(new Employee(2,"Ankit","Pahuja"));
		lst.add(new Employee(3,"Mayank","Bhotika"));
		lst.add(new Employee(4,"Hitesh","Yadav"));
		
		return lst;
	}

}
