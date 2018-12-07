package com.example.demofinalproject.service;

import com.example.demofinalproject.domain.Post;
import com.example.demofinalproject.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PostService {

    private PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository){
        this.postRepository = postRepository;
    }

    public Post getLatestPost(){
        return postRepository.findFirstByOrderByPostedOnDesc();
    }

    public List<Post> list() {
        return postRepository.findAllByOrderByPostedOnDesc();
    }

    public Post getBySlug(String slug) {
        return postRepository.findBySlug(slug);
    }

    public List<Post> listByAuthor(Long id) {
        return postRepository.findAllByAuthorIdOrderByPostedOnDesc(id);
    }

    public Optional<Post> get(Long id) {
        return postRepository.findById(id);
    }

}