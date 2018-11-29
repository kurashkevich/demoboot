package com.example.demosecurityjpa.service.role;

import com.example.demosecurityjpa.domain.Role;
import com.example.demosecurityjpa.repository.RoleRepository;
import com.example.demosecurityjpa.service.role.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    private RoleRepository roleRepository;

    @Autowired
    public void setRoleRepository(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override public Role addRole(Role role) {
        return roleRepository.save(role);
    }
}
