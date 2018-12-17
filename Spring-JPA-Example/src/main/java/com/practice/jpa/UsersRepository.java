package com.practice.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.model.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {

	List<Users> findByFirstName(String firstName);
	List<Users> findByName(String firstName);
}
