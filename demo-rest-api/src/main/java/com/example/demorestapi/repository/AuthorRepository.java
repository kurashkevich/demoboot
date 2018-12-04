package com.example.demorestapi.repository;

import com.example.demorestapi.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
    Author findById(long id);
    void deleteById(long id);

}
