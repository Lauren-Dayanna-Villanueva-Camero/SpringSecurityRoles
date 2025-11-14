package com.usco.SpringSecurityRoles.repository;

import com.usco.SpringSecurityRoles.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface UserRoleRepository extends JpaRepository<UserRole, Integer> {
    List<UserRole> findByUserUserId(Integer userId);
}