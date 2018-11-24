package com.example.h2demo.service;

import com.example.h2demo.domain.Author;
import com.example.h2demo.domain.Post;
import com.example.h2demo.repository.AuthorRepository;
import com.example.h2demo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Date;

@Service
public class DataLoader {

    private PostRepository postRepository;
    private AuthorRepository authorRepository;


    @Autowired
    public DataLoader(PostRepository postRepository, AuthorRepository authorRepository) {
        this.postRepository = postRepository;
        this.authorRepository = authorRepository;
    }


    @PostConstruct
    private void loadData(){

        /*Author vlad = new Author("vlad", "kur");
        authorRepository.save(vlad);
        Post vladPost1 = new Post("vlad title");
        vladPost1.setAuthor(vlad);
        vladPost1.setBody("asdadad");
        vladPost1.setPostedOn(new Date());

        Post post2 = new Post("Amaizing boot  title");
        post2.setAuthor(vlad);
        post2.setBody("this is is is");
        post2.setPostedOn(new Date());
        postRepository.save(post2);*/




    }
}
