package com.practice.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.practice.model.Employee;

@Component
public class EmployeeValidator implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {
		return Employee.class.isAssignableFrom(arg0);
	}

	@Override
	public void validate(Object arg0, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName", "error.firstName");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastName", "error.lastName");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "error.email");
	}
	
}
