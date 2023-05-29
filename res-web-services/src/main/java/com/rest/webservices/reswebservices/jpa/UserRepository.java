package com.rest.webservices.reswebservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.webservices.reswebservices.restfulwebservices.user.User;

public interface UserRepository extends JpaRepository<User,Integer>{

}
