package com.usco.SpringSecurityRoles.model;

import jakarta.persistence.*;
import lombok.Data;
import io.swagger.v3.oas.annotations.media.Schema;

@Entity
@Table(name = "users_roles")
@Data
@Schema(description = "Entidad de unión que relaciona usuarios con roles")
public class UserRole {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "ID único de la relación usuario-rol", example = "1")
    private Integer id;
    
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    @Schema(description = "Usuario asociado al rol")
    private User user;
    
    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false)
    @Schema(description = "Rol asignado al usuario")
    private Role role;
}