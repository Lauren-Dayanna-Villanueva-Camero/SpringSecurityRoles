package com.usco.SpringSecurityRoles.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@Tag(name = "API de Usuarios", description = "Endpoints REST para gestión de usuarios y autenticación")
public class UserApiController {

    @GetMapping("/users")
    @Operation(summary = "Obtener todos los usuarios", description = "Retorna lista de usuarios (solo ADMIN)")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Usuarios obtenidos exitosamente"),
        @ApiResponse(responseCode = "403", description = "No autorizado")
    })
    public String getAllUsers() {
        return "Lista de usuarios";
    }

    @GetMapping("/users/{id}")
    @Operation(summary = "Obtener usuario por ID", description = "Retorna un usuario específico")
    public String getUserById(@PathVariable Integer id) {
        return "Usuario con ID: " + id;
    }

    @PostMapping("/auth/login")
    @Operation(summary = "Autenticar usuario", description = "Endpoint para autenticación via API")
    public String login(@RequestBody String credentials) {
        return "Token de autenticación";
    }
}