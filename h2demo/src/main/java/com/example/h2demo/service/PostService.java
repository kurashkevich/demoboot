package com.example.h2demo.service;

import com.example.h2demo.domain.Post;
import com.example.h2demo.repository.PostRepository;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    private PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Post getLatestPost(){
        return postRepository.findFirstByOrderByPostedOnDesc();
    }

    public List<Post> getPostsByAuthorFirstName(String firstName){
        return postRepository.findAllByAuthorFirstNameIgnoreCase(firstName);
    }

    public List<Post> getPostsByKeyword(String keyword){
        return postRepository.findAllByKeywordsIgnoreCase(keyword);
    }

    public List<Post> getPostsByKeywordLike(String keyword){
        return postRepository.findAllByKeywordsLikeIgnoreCase('%' + keyword + '%');
    }

    public List<Post> getActivePosts(){
        return postRepository.findAllByActiveTrue();
    }

    public List<Post> getPostsByAuthorFirstNameAndKeywords(String firstName, String keyword){
        return postRepository.findAllByAuthorFirstNameIgnoreCaseAndKeywordsIgnoreCase(firstName, keyword);
    }

    public Post getBySlug(String slug){
        return postRepository.findPostBySlugNamedParam(slug);
    }

    public Post getBySlugClassic(String slug){
        return postRepository.findPostBySlugIgnoreCase(slug);
    }




}
