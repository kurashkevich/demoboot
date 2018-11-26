package com.example.demosecurity.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
public class PostController {

    @Secured("ROLE_ADMIN")
    @RequestMapping("/list")
    public String list(){
        return "list posts..";
    }
}
