package com.example.h2demo;

import com.example.h2demo.domain.Post;
import com.example.h2demo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class H2demoApplication {


    @Autowired
    PostRepository postRepository;


    public static void main(String[] args) {
        SpringApplication.run(H2demoApplication.class, args);
    }

    // @PostConstruct - отработает после всех инициализаий сприкнг контектса
    @PostConstruct
    void seePosts(){
        for(Post post: postRepository.findAll()){
            System.out.println(post.toString());
        }
    }

}
