package com.example.demorestapi.domain;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
public class Post implements Serializable{

    private Post(){

    }

    @Id
    @GeneratedValue
    private Long id;

    private String header;

    @Column(columnDefinition = "TEXT")
    private String body;

    @CreatedDate @Column(columnDefinition = "TIMESTAMP")
    private Date postedOn;


    @ManyToOne
    private Author author;

    private Boolean active;

    @Override public String toString() {
        return "Post{" + "id=" + id + ", header='" + header + '\'' + ", body='" + body + '\'' + ", author=" + author
            + '}';
    }
}
