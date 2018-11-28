package com.example.demosecurityjpa.repository;

import com.example.demosecurityjpa.domain.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Long> {
    Role save(Role role);

}
