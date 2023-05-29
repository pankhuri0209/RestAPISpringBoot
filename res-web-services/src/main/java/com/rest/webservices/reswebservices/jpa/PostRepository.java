package com.rest.webservices.reswebservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.webservices.reswebservices.restfulwebservices.user.Post;
import com.rest.webservices.reswebservices.restfulwebservices.user.User;

public interface PostRepository extends JpaRepository<Post,Integer>{

}
