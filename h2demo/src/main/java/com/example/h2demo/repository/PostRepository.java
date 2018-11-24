package com.example.h2demo.repository;

import com.example.h2demo.domain.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {


}
