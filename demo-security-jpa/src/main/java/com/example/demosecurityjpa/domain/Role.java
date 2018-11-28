package com.example.demosecurityjpa.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Table( name = "roles" )
@Data
@Entity
public class Role {

    private Role(){

    }

    @Id
    @GeneratedValue
    private Long id;

    private String role;

    @ManyToMany( mappedBy = "roles")
    private List<User> users = new ArrayList<User>();

    @Override public String toString() {
        return "Role{" + "id=" + id + ", role='" + role + '\'' + '}';
    }
}
