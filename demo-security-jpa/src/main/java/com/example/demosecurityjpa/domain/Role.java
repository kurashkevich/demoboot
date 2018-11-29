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
    private Set<User> users = new HashSet<>();

    private Role(){

    }

    public Role(String role) {
        this.role = role;
    }

    public Role(String role, Set<User> users) {
        this.role = role;
        this.users = users;
    }

    @Override public String toString() {
        return "Role{" + "id=" + id + ", role='" + role + '\'' + '}';
    }
}
