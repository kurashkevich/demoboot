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

    @RequestMapping("/byKey/{keyword}")
    public String getByKey(@PathVariable(value = "keyword")String keyword, Model model){
        model.addAttribute("posts", postService.getPostsByKeyword(keyword));
        return "post/posts";
    }

    @RequestMapping("/byKeyLike/{keywordLike}")
    public String getByKeyLike(@PathVariable(value = "keywordLike")String keywordLike, Model model){
        model.addAttribute("posts", postService.getPostsByKeywordLike(keywordLike));
        return "post/posts";
    }

    @RequestMapping("/active")
    public String getActivePosts(Model model){
        model.addAttribute("posts", postService.getActivePosts());
        return "post/posts";
    }


    @RequestMapping("/{firstName}/{keyword}")
    public String getPostsByAuthorFirstNAmeAndKeywords(@PathVariable(value = "firstName") String firstName,
                                                       @PathVariable(value = "keyword")String keyword, Model model){
        model.addAttribute("posts", postService.getPostsByAuthorFirstNameAndKeywords(firstName, keyword));
        return "post/posts";
    }

    @RequestMapping("/slug/{slug}")
    public String findPostBySlug(@PathVariable(value = "slug")String slug, Model model){
        model.addAttribute("post", postService.getBySlugClassic(slug));
        return "post/single";
    }





}
