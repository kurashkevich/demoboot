package com.example.demorestapi.controller;

import com.example.demorestapi.domain.Author;
import com.example.demorestapi.repository.AuthorRepository;
import com.example.demorestapi.service.author.AuthorService;
import com.example.demorestapi.service.post.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/author")
public class AuthorController {

    private AuthorService authorService;
    private PostService postService;

    @Autowired
    public void setAuthorService(AuthorService authorService) {
        this.authorService = authorService;
    }

    @Autowired
    public void setPostService(PostService postService) {
        this.postService = postService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Iterable<Author> getAllAuthors(){
        return authorService.list();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Author getAuthor(@PathVariable long id){
        return authorService.read(id);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Author createAuthor(@RequestBody Author author){
        return authorService.create(author);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Author updateAuthorEmail(@PathVariable long id, @RequestBody Author author){
        return authorService.updateEmail(id, author);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteAuthorById(@PathVariable long id){
        authorService.delete(id);
    }




}
