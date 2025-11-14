package com.usco.SpringSecurityRoles.controller;

import com.usco.SpringSecurityRoles.model.User;
import com.usco.SpringSecurityRoles.model.Role;
import com.usco.SpringSecurityRoles.model.UserRole;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/models")
@Tag(name = "Modelos del Sistema", description = "Endpoints para visualizar los modelos en Swagger")
public class ModelController {

    @GetMapping("/user")
    @Operation(summary = "Obtener modelo User", description = "Muestra la estructura del modelo User")
    public User getUserModel() {
        return new User();
    }

    @GetMapping("/role")
    @Operation(summary = "Obtener modelo Role", description = "Muestra la estructura del modelo Role")
    public Role getRoleModel() {
        return new Role();
    }

    @GetMapping("/user-role")
    @Operation(summary = "Obtener modelo UserRole", description = "Muestra la estructura del modelo UserRole")
    public UserRole getUserRoleModel() {
        return new UserRole();
    }
}