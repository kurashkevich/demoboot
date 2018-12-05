package com.example.demodatarest.repository;

import com.example.demodatarest.domain.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PostRepository extends CrudRepository<Post, Long> {

    List<Post> findByTitleContainingIgnoreCase(@Param("title") String title);
}
