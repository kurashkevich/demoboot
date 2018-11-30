package com.example.demorestapi.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
public class Author implements Serializable{

    private Author(){

    }

    @Id
    @GeneratedValue
    private Long id;

    private String firstName;
    private String lastName;
    private String email;

    @JsonIgnore
    @OneToMany(mappedBy = "author")
    private List<Post> posts;

    @Override public String toString() {
        return "Author{" + "id=" + id + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\''
            + ", email='" + email + '\'' + ", posts=" + posts + '}';
    }
}

