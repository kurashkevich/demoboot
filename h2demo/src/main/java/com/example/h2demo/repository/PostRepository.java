package com.example.h2demo.repository;

import com.example.h2demo.domain.Post;
import javafx.geometry.Pos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepository extends CrudRepository<Post, Long> {

    Post findFirstByOrderByPostedOnDesc();

    List<Post> findAllByAuthorFirstNameIgnoreCase(String firstName);

    List<Post> findAllByKeywordsIgnoreCase(String keyword);

    List<Post> findAllByKeywordsLikeIgnoreCase(String keyword);

    List<Post> findAllByActiveTrue();

    List<Post> findAllByAuthorFirstNameIgnoreCaseAndKeywordsIgnoreCase(String firstName, String keywords);

}
