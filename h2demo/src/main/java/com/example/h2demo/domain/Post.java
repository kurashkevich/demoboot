package com.example.h2demo.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Data
@Entity
public class Post {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String body;
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
