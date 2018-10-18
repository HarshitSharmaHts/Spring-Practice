package com.tutorial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tutorial.service.EmployeeManager;

@Controller
public class EmployeeController {

	@Autowired
	@Qualifier("employeeManagerImplFirst")
	private EmployeeManager managerFirst;

	@Autowired
	@Qualifier("employeeManagerImplSecond")
	private EmployeeManager managerSecond;
	
	@RequestMapping(value="/employees", method=RequestMethod.GET)
	public ModelAndView getAllEmployees() {
		ModelAndView mAv = new ModelAndView("employees","employeesFirst", managerFirst.getAllEmployee());
		mAv.addObject("employeesSecond", managerSecond.getAllEmployee());
		return mAv;
	}
}
