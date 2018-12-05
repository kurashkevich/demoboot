package com.example.demorestapi.controller;

import com.example.demorestapi.domain.Post;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class GetJsonObject {

    @RequestMapping("/")
    public Post getObj(){
        RestTemplate restTemplate = new RestTemplate();
        Post post = restTemplate.getForObject("http://localhost:8080/data/post.json", Post.class);
        return post;
    }
}
