package com.example.demodatarest.controller;

import com.example.demodatarest.domain.Post;
import com.example.demodatarest.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts/")
public class PostController {

    private PostService postService;

    @Autowired
    public void setPostService(PostService postService) {
        this.postService = postService;
    }

    @RequestMapping("/")
    public Iterable<Post> getPosts(){
        return postService.getPosts();
    }
}
