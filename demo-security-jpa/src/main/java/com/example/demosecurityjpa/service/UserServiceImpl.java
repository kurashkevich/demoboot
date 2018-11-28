package com.example.demosecurityjpa.service;

import com.example.demosecurityjpa.domain.User;
import com.example.demosecurityjpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService, UserDetailsService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = findByEmail(username);
        if( user == null ){
            throw new UsernameNotFoundException(username);
        }

        return new UserDetailsImpl(user);
    }

    @Override public User addUser(User user) {
        return userRepository.save(user);
    }
}