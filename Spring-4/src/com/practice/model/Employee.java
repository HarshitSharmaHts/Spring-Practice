package com.practice.model;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Employee {

	@Size(min=3, max=20)
	private String firstName;
	
	@Size(min=3, max=20)
	private String lastName;
	
	@Pattern(regexp=".+@.+\\.[a-z]+")
	private String email;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
