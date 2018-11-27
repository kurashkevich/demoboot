package com.example.demosecurityjpa.repository;

import com.example.demosecurityjpa.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByEmail(String email);
}
