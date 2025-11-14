package com.usco.SpringSecurityRoles.repository;

import com.usco.SpringSecurityRoles.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Role findByName(String name);
}