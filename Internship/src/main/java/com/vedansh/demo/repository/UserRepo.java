package com.vedansh.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.vedansh.demo.entity.User;



public interface UserRepo extends MongoRepository<User, String>{

}
