package com.example.demorestapi.service.author;

import com.example.demorestapi.domain.Author;

public interface AuthorService {

    Iterable<Author> list();

    Author create(Author author);

    Author read(long id);

    Author updateEmail(long id, Author author);

    void delete(long id);

}
