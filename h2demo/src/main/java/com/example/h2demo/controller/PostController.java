package com.example.h2demo.controller;

import com.example.h2demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/posts")
public class PostController {

    private PostService postService;

    @Autowired
    public void setPostService(PostService postService) {
        this.postService = postService;
    }

    @RequestMapping("/byAuthor/{first}")
    public String getByFirstName(@PathVariable(value = "first")String first, Model model){
        model.addAttribute("posts", postService.getPostsByAuthorFirstName(first));
        return "post/posts";
    }




}
