package com.usco.SpringSecurityRoles.model;

import jakarta.persistence.*;
import lombok.Data;
import io.swagger.v3.oas.annotations.media.Schema;

@Entity
@Table(name = "roles")
@Data
@Schema(description = "Entidad que representa un rol en el sistema")
public class Role {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    @Schema(description = "ID único del rol", example = "1")
    private Integer roleId;
    
    @Column(name = "name", nullable = false, length = 45)
    @Schema(description = "Nombre del rol", example = "ADMINISTRADOR", 
            allowableValues = {"ADMINISTRADOR", "USUARIO", "INVITADO"})
    private String name;
}