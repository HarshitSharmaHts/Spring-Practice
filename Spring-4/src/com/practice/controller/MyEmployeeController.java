package com.practice.controller;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.practice.model.Employee;

@Controller
@SessionAttributes("employee")
public class MyEmployeeController {

	private Validator validator;
	
    public MyEmployeeController() {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        validator = validatorFactory.getValidator();
    }
 
	
	@RequestMapping(value="/add-employee", method=RequestMethod.GET)
	public ModelAndView addEmployeeGet() {
		return new ModelAndView("addNewUser","employee",new Employee());
	}
	
	@RequestMapping(value="/add-employee", method=RequestMethod.POST)
	public String addEmployeePost(@ModelAttribute("employee") Employee employeeVO, BindingResult result, SessionStatus status) {
	    Set<ConstraintViolation<Employee>> violations = validator.validate(employeeVO);
	     
	    for (ConstraintViolation<Employee> violation : violations)
	    {
	        String propertyPath = violation.getPropertyPath().toString();
	        String message = violation.getMessage();
	        // Add JSR-303 errors to BindingResult
	        // This allows Spring to display them in view via a FieldError
	        result.addError(new FieldError("employee",propertyPath,"Invalid "+ propertyPath + "(" + message + ")"));
	    }
	 
	    if (result.hasErrors()) {
	        return "addNewUser";
	    }
	    
	    status.setComplete();
	    return "redirect:success";
	}
	
	@RequestMapping(value="/success", method= {RequestMethod.GET, RequestMethod.POST})
	public String success() {
		return "success";
	}
}
