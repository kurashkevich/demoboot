package com.course.thymeleaf.controller.post;

import com.course.thymeleaf.domain.Post;
import com.course.thymeleaf.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

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

    @RequestMapping("/get/{slug}")
    public String getPost(@PathVariable(value = "slug") String slug) throws Exception {
        System.out.println(slug);
        Post post = null;
        if(post == null) {
            throw new Exception(("sorry, we couldn't find any post with name: " + slug));
        }
        return "welcome";
    }

    @ExceptionHandler(Exception.class)
    public String myExceptionHandler(HttpServletRequest httpServletRequest, Exception exc, Model model){
        System.out.println("halo");
        model.addAttribute("errorMsg", exc.getMessage());
        return "views/error/error";
    }
}
