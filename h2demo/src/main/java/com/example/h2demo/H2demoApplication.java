package com.example.h2demo;

import com.example.h2demo.domain.Post;
import com.example.h2demo.repository.PostRepository;
import com.example.h2demo.service.DataLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class H2demoApplication {

    public static void main(String[] args) {
        SpringApplication.run(H2demoApplication.class, args);
    }
}
