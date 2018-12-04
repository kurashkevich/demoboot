package com.example.demorestapi.service.post;

import com.example.demorestapi.domain.Post;

public interface PostService {

    Iterable<Post> list();

    Post create(Post post);

    Post read(long id);

    Post updateHeader(long id, Post post);

    void delete(long id);

}