package com.practice.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.practice.model.Users;

@Repository
public class UsersRepository {
	
	private static List<Users> users;
	
	public UsersRepository() {
		users = new ArrayList<Users>();
		users.add(new Users()
				.setFirstName("Harshit")
				.setLastName("Sharma")
				.setId(1));
		users.add(new Users()
				.setFirstName("Anmol")
				.setLastName("Singh")
				.setId(2));
		users.add(new Users()
				.setFirstName("Archit")
				.setLastName("Kaila")
				.setId(3));
		users.add(new Users()
				.setFirstName("Ashish")
				.setLastName("Kumar")
				.setId(4));
	}

	public List<Users> getAll() {
		return users;
	}
	
	public void add(Users user) {
		users.add(user);
	}
	
	public Users getById(int id) {
		return users.stream().filter(e-> e.getId() == id).findFirst().get();
	}
	
	public Users update(Users user) {
		for(Users u : users) {
			if(u.getId() == user.getId()) {
				u.update(user);
				break;
			}
		}
		return getById(user.getId());
	}
}
