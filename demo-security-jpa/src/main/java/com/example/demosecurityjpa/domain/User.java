package com.example.demosecurityjpa.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Table(name = "users")
@Data
@Entity
public class User implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column( unique=true, nullable=false )
    private String email;


    /**
     * Для примера храним пароль в БД, но это плохая практика
     * В реальной жизни нужно переопределять метод SET, присваивать паролю хеш, и хранить в БД хеш
     *
     * **/
    @Column(nullable = false)
    private String password;

    private String fullName;

    /** **/
    @ManyToMany( cascade = CascadeType.ALL, fetch = FetchType.EAGER )
    @JoinTable(
        name = "users_roles",
        joinColumns = {@JoinColumn(name="user_id")},
        inverseJoinColumns = {@JoinColumn(name="role_id")}
    )
    private List<Role> roles = new ArrayList<>();

    private User(){

    }


    public User(String email, String password, String fullName) {
        this.email = email;
        this.password = password;
        this.fullName = fullName;
    }

    public User(String email, String password, String fullName, List<Role> roles) {
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        this.roles = roles;
    }



    @Override public String toString() {
        return "User{" + "id=" + id + ", email='" + email + '\'' + ", password='" + password + '\'' + ", fullName='"
            + fullName + '\'' + '}';
    }




}
