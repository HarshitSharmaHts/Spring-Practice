package com.practice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.practice.model.Users;

public interface UsersRepository extends MongoRepository<Users, String> {

}