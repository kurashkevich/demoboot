package com.example.demosecurityjpa.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Table( name = "roles" )
@Data
@Entity
public class Role implements Serializable {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String role;

    @ManyToMany( mappedBy = "roles")
    private List<User> users = new ArrayList<>();

    private Role(){

    }

    public Role(String role) {
        this.role = role;
    }



    @Override public String toString() {
        return "Role{" + "id=" + id + ", role='" + role + '\'' + '}';
    }
}
