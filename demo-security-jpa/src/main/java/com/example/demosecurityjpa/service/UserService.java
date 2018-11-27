package com.example.demosecurityjpa.service;

import com.example.demosecurityjpa.domain.User;
import com.example.demosecurityjpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public User findByEmail(String email){
        return userRepository.findByEmail(email);
    }
}
