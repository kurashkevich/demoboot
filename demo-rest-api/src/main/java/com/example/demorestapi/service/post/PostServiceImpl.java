package com.example.demorestapi.service.post;

import com.example.demorestapi.domain.Post;
import com.example.demorestapi.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;

    @Autowired
    public void setPostRepository(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override public Iterable<Post> list() {
        return postRepository.findAll();
    }

    @Override public Post create(Post post) {
        return postRepository.save(post);
    }

    @Override public Post read(long post) {
        return null;
    }

    @Override public Post update(Long id, Post post) {
        return null;
    }

    @Override public void delete(Long id) {

    }
}
