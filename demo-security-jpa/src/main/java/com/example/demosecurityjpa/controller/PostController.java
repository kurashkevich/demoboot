package com.example.demosecurityjpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PostController {
    @RequestMapping("/posts/")
    public String list(){
        return "list posts...";
    }

    @RequestMapping("/admin/posts/create")
    public String addPost(){
        return "add posts...";
    }
}
