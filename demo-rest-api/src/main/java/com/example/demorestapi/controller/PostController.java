package com.example.demorestapi.controller;

import com.example.demorestapi.domain.Author;
import com.example.demorestapi.domain.Post;
import com.example.demorestapi.service.post.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/posts")
public class PostController {

    private PostService postService;

    @Autowired
    public void setPostService(PostService postService) {
        this.postService = postService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Iterable<Post> getPosts(){
        return postService.list();
    }

    @RequestMapping( value = "/", method = RequestMethod.POST )
    public Post create(@RequestBody Post post){
        System.out.println(post + " :!");
        return postService.create(post);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Post updatePost(@PathVariable(value="id") long id, @RequestBody Post post){
        return postService.update(id, post);
    }


    // что значит @RequestBody
    //

}
