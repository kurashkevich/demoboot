package com.example.demorestapi.service.post;

import com.example.demorestapi.domain.Post;
import com.example.demorestapi.repository.AuthorRepository;
import com.example.demorestapi.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;
    private AuthorRepository authorRepository;

    @Autowired
    public void setPostRepository(PostRepository postRepository, AuthorRepository authorRepository) {
        this.postRepository = postRepository;
        this.authorRepository = authorRepository;
    }

    @Override public Iterable<Post> list() {
        return postRepository.findAll();
    }

    @Override
    @Transactional
    public Post create(Post post) {
        authorRepository.save(post.getAuthor());
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
