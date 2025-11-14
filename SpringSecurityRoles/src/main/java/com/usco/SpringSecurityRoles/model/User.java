package com.usco.SpringSecurityRoles.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;
import io.swagger.v3.oas.annotations.media.Schema;

@Entity
@Table(name = "users")
@Data
@Schema(description = "Entidad que representa un usuario del sistema")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    @Schema(description = "ID único del usuario", example = "1")
    private Integer userId;
    
    @Column(name = "username", unique = true, nullable = false, length = 45)
    @Schema(description = "Nombre de usuario único para login", example = "juan.perez", required = true)
    private String username;
    
    @Column(name = "password", nullable = false, length = 64)
    @Schema(description = "Contraseña encriptada del usuario", example = "$2a$10$xyz...")
    private String password;
    
    @Column(name = "enabled", nullable = false)
    @Schema(description = "Indica si el usuario está habilitado en el sistema", example = "true")
    private Boolean enabled = true;
    
    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    @Schema(description = "Lista de roles asignados al usuario")
    private List<UserRole> userRoles;
}