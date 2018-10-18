package com.tutorial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.tutorial.dao.EmployeeDAO;
import com.tutorial.model.Employee;

@Service
public class EmployeeManagerImplFirst implements EmployeeManager {

	@Autowired
	@Qualifier("employeeDaoImplFirst")
	private EmployeeDAO dao;
	
	@Override
	public List<Employee> getAllEmployee() {
		return dao.getAllEmployee();
	}

}
