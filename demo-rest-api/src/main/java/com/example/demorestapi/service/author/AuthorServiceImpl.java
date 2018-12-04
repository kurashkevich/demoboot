package com.example.demorestapi.service.author;

import com.example.demorestapi.domain.Author;
import com.example.demorestapi.repository.AuthorRepository;
import com.example.demorestapi.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

    private AuthorRepository authorRepository;
    private PostRepository postRepository;

    @Autowired
    public void setAuthorRepository(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Autowired
    public void setPostRepository(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override public Iterable<Author> list() {
        return authorRepository.findAll();
    }

    @Override public Author create(Author author) {
        return authorRepository.save(author);
    }

    @Override public Author read(long id) {
        return authorRepository.findById(id);
    }

    @Override
    public Author updateEmail(long id, Author update) {
        Author author = authorRepository.findById(id);
        if( update.getEmail() != null ) {
            author.setEmail(update.getEmail());
        }
        return authorRepository.save(author);
    }

    @Override public void delete(long id) {
        authorRepository.deleteById(id);
    }
}
