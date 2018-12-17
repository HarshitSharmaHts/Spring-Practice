package com.practice.model;

public class Users {

	private String firstName;
	private String lastName;
	private int id;

	public Users() {}
	
	public void update (Users user) {
		this.firstName = user.firstName;
		this.lastName = user.lastName;
		this.id = user.id;
	}
	
	public Users(String firstName, String lastName, int id) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public Users setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}
	
	public String getLastName() {
		return lastName;
	}
	public Users setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}
	
	public int getId() {
		return id;
	}
	public Users setId(int id) {
		this.id = id;
		return this;
	}
}
