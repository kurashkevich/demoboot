package com.example.demosecurityjpa.controller;

import com.example.demosecurityjpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/posts")
public class PostController {

    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    public String home(Model model){
        model.addAttribute("users", userService.getUsers());
        return "index";
    }

    @RequestMapping("/getPosts")
    public String list(Model model){
        model.addAttribute("users", userService.getUsers());
        return "post/posts";

    }

    @RequestMapping("/admin/posts/create")
    public String addPost(){
        return "add posts...";
    }
}
