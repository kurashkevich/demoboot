package com.example.demorestapi.domain;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
public class Post implements Serializable{

    public Post(){

    }

    public Post(String header, String body, Date postedOn, Boolean active) {
        this.header = header;
        this.body = body;
        this.postedOn = postedOn;
        this.active = active;
    }

    public Post(String header, String body) {
        this.header = header;
        this.body = body;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

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
