package com.example.demosecurityjpa.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table( name = "roles" )
@Data
public class Role {

    @Id
    @GeneratedValue
    private Long id;

    private String role;

    @ManyToMany( mappedBy = "roles")
    private Set<User> users = new HashSet<User>();

    @Override public String toString() {
        return "Role{" + "id=" + id + ", role='" + role + '\'' + ", users=" + users + '}';
    }
}
