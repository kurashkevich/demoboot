package com.example.demodatarest.repository;

import com.example.demodatarest.domain.Author;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AuthorRepository extends PagingAndSortingRepository<Author, Long> {
}
