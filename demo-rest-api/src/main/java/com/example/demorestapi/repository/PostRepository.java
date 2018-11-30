package com.example.demorestapi.repository;

import com.example.demorestapi.domain.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {

   /* @Override public Post create(Post post) {
        return null;
    }

    @Override public Post read(Post post) {
        return null;
    }

    @Override public Post update(Long id, Post post) {
        return null;
    }

    @Override public void delete(Long id) {

    }*/


}
