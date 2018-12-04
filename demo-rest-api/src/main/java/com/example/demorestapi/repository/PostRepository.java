package com.example.demorestapi.repository;

import com.example.demorestapi.domain.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {

    Post findById(long id);
    void deleteById(long id);

}
