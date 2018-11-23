package com.course.thymeleaf.controller.post;

import com.course.thymeleaf.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/posts/")
public class PostController {

    private PostService postService;

    @Autowired
    public void setPostService(PostService postService) {
        this.postService = postService;
    }

    @RequestMapping("/")
    public String getPosts(Model model){
        model.addAttribute("posts", postService.getPosts());
        System.out.println(postService.getPosts());
        return "views/list";
    }
}
