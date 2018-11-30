package com.example.h2demo.controller;

import com.example.h2demo.domain.Post;
import com.example.h2demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/rest")
public class RestPostController {

    @Autowired PostService postService;

    @RequestMapping("/posts")
    public Iterable<Post> getPosts(){
        return postService.getPosts();
    }

    @RequestMapping("posts/1")
    public Post getPost(){
        return postService.getLatestPost();
    }
}
