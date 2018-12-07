package com.example.demofinalproject.repository;

import java.util.List;

import com.example.demofinalproject.domain.Author;
import org.springframework.data.repository.CrudRepository;



public interface AuthorRepository extends CrudRepository<Author, Long> {

    List<Author> findAllByOrderByLastNameAscFirstNameAsc();

}