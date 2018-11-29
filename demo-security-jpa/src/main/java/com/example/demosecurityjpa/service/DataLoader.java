package com.example.demosecurityjpa.service;

import com.example.demosecurityjpa.domain.Role;
import com.example.demosecurityjpa.domain.User;
import com.example.demosecurityjpa.service.role.RoleService;
import com.example.demosecurityjpa.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.DelegatingPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.scrypt.SCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.*;

@Service
public class DataLoader {

    private UserService userService;
    private RoleService roleService;

    @Autowired
    public DataLoader(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }


    @Bean
    public PasswordEncoder delegatingPasswordEncoder() {
        PasswordEncoder defaultEncoder = new SCryptPasswordEncoder();
        Map<String, PasswordEncoder> encoders = new HashMap<>();
        encoders.put("bcrypt", new BCryptPasswordEncoder());
        encoders.put("scrypt", new SCryptPasswordEncoder());

        DelegatingPasswordEncoder passworEncoder = new DelegatingPasswordEncoder(
            "bcrypt", encoders);
        passworEncoder.setDefaultPasswordEncoderForMatches(defaultEncoder);

        return passworEncoder;
    }

    @PostConstruct
    private void loadData(){
        Role roleUser = new Role("ROLE_USER");
        Role roleAdmin = new Role("ROLE_ADMIN");

        String passForAdmin = delegatingPasswordEncoder().encode("admin");
        String passForUser = delegatingPasswordEncoder().encode("user");

        List<Role> rolesForAdm = new ArrayList<>();
        rolesForAdm.add(roleAdmin);
        //rolesForAdm.add(roleUser);

        List<Role> roles = new ArrayList<>();
        roles.add(roleUser);

        User userAdmin = new User(  "v.kur@gmail.com", passForAdmin, "vlad kur", rolesForAdm);
        User user = new User( "d.vega@gmail.com", passForUser, "dan vega", roles);

        userService.addUser(user);
        userService.addUser(userAdmin);


       /* roleService.addRole(roleUser);
        roleService.addRole(roleAdmin);*/




    }
}
