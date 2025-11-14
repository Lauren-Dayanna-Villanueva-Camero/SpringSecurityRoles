package com.usco.SpringSecurityRoles.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@Controller
@Tag(name = "Autenticación", description = "Endpoints para login y página de inicio")
public class LoginController {

    @GetMapping("/login")
    @Operation(summary = "Página de login", description = "Muestra el formulario de autenticación")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Formulario de login mostrado exitosamente")
    })
    public String login() {
        return "login";
    }

    @GetMapping("/home")
    @Operation(summary = "Página de inicio", description = "Página principal después del login exitoso")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Página de inicio cargada exitosamente"),
        @ApiResponse(responseCode = "302", description = "Redirige a login si no está autenticado")
    })
    public String home(Authentication authentication, Model model) {
        String username = authentication.getName();
        String role = authentication.getAuthorities().stream()
                .findFirst()
                .map(GrantedAuthority::getAuthority)
                .orElse("ROLE_USUARIO");
        
        String roleName = role.replace("ROLE_", "");
        
        model.addAttribute("username", username);
        model.addAttribute("role", roleName);
        
        return "home";
    }
}