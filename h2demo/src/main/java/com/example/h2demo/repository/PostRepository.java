package com.example.h2demo.repository;

import com.example.h2demo.domain.Post;
import javafx.geometry.Pos;
import org.springframework.boot.autoconfigure.quartz.QuartzDataSource;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PostRepository extends CrudRepository<Post, Long> {

    Post findFirstByOrderByPostedOnDesc();

    List<Post> findAllByAuthorFirstNameIgnoreCase(String firstName);

    List<Post> findAllByKeywordsIgnoreCase(String keyword);

    List<Post> findAllByKeywordsLikeIgnoreCase(String keyword);

    List<Post> findAllByActiveTrue();

    List<Post> findAllByAuthorFirstNameIgnoreCaseAndKeywordsIgnoreCase(String firstName, String keywords);


    // this two methods are equals
    @Query("select p from Post p where p.slug = :slug")
    Post findPostBySlugNamedParam(@Param("slug")String slug);

    Post findPostBySlugIgnoreCase(String slug);

    // using native query
    // @Query (value = "SELECT * FROM POST", nativeQuery = true)


}
