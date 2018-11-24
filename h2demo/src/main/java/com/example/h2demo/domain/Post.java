package com.example.h2demo.domain;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Post {
    @Id
    @GeneratedValue
    private Long id;
    private String title;

    @Column(columnDefinition = "TEXT")
    private String body;

    @Column(columnDefinition = "TEXT")
    private String teaser;

    private String slug;

    @CreatedDate @Column(columnDefinition = "TIMESTAMP")
    private Date postedOn;

    // we have many posts which belongs to one author
    @ManyToOne
    private Author author;

    // private no-arg constructor is needed by JPA
    private Post(){

    }

    public Post(String title) {
        this.title = title;
    }

    public Post(String title, String body, Date postedOn, Author author) {
        this.title = title;
        this.body = body;
        this.postedOn = postedOn;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", postedOn=" + postedOn +
                '}';
    }
}
