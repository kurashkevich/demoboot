package com.example.h2demo.repository;

import com.example.h2demo.domain.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepository extends CrudRepository<Post, Long> {

    Post findFirstByOrderByPostedOnDesc();

    //find all posts by authors first name
    List<Post> findAllByAuthorFirstName(String firstName);



}
