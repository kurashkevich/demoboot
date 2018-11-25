package com.example.h2demo.service;

import com.example.h2demo.domain.Post;
import com.example.h2demo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    private PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Post getLatestPost(){
        return postRepository.findFirstByOrderByPostedOnDesc();
    }

    public List<Post> getPostsByAuthorFirstName(String firstName){
        return postRepository.findAllByAuthorFirstName(firstName);
    }


}
