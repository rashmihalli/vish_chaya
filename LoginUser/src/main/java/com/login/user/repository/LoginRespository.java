package com.login.user.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.login.user.model.UserPojo;

public interface LoginRespository extends MongoRepository<UserPojo, String> 
{

}
