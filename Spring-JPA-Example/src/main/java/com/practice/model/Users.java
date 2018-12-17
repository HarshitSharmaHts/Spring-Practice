package com.practice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="dummy", catalog="jpa_dummmy")
@NamedQuery(name="Users.findByName",query="SELECT u FROM Users u WHERE u.lastName = ?1")
public class Users {

	@Column(name="fName")
	private String firstName;
	
	@Column(name="lName")
	private String lastName;
	
	@Id
	@Column(name="id")
	@GeneratedValue
	private  Integer id;
	
	
	
	public Users(String firstName, String lastName, Integer id) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}

	public Users() {
		
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
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
}
