package com.example.demosecurityjpa.service;

import com.example.demosecurityjpa.domain.User;
import com.example.demosecurityjpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public interface UserService {

    public User findByEmail(String email);
}
