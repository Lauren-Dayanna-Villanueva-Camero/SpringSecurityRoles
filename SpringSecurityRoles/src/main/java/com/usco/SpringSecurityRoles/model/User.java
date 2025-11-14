package com.usco.SpringSecurityRoles.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Table(name = "users")
@Data
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer userId;
    
    @Column(name = "username", unique = true, nullable = false, length = 45)
    private String username;
    
    @Column(name = "password", nullable = false, length = 64)
    private String password;
    
    @Column(name = "enabled", nullable = false)
    private Boolean enabled = true;
    
    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private List<UserRole> userRoles;
}