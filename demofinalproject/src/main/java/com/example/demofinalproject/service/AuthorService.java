package com.example.demofinalproject.service;

import com.example.demofinalproject.domain.Author;
import com.example.demofinalproject.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    private AuthorRepository authorRepository;

    @Autowired
    public AuthorService(AuthorRepository authorRepository) {
        super();
        this.authorRepository = authorRepository;
    }

    public List<Author> list() {
        return authorRepository.findAllByOrderByLastNameAscFirstNameAsc();
    }

}