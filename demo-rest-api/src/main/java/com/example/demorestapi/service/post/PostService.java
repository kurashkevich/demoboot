package com.example.demorestapi.service.post;

import com.example.demorestapi.domain.Post;

public interface PostService {

    Iterable<Post> list();

    Post create(Post post);

    Post read(long id);

    Post update(Long id, Post post);

    void delete(Long id);

}