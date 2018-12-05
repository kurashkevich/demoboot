package com.example.demodatarest.service;

import com.example.demodatarest.domain.Post;
import com.example.demodatarest.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    private PostRepository postRepository;

    @Autowired
    public void setPostRepository(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Iterable<Post> getPosts(){
        return postRepository.findAll();
    }
}
