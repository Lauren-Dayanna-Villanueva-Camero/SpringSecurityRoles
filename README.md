# Spring Security Roles

## Descripción
Esta aplicación permite un acceso a una página basada en los roles de usuario y administrador.

## Características
- Autenticación y autorización con Spring Security
- Roles de usuario (ADMINISTRADOR, USUARIO)
- Interfaz web con [Thymeleaf/JSP/HTML]
- Protección de rutas por roles
- Documentación en Swagger

## Tecnologías
- **Backend:** Spring Boot 3.5.7, Spring Security, Spring Data JPA
- **Frontend:** [Thymeleaf/HTML + CSS/JS]
- **Base de datos:** PostgreSQL
- **Java:** 21
- **Build tool:** Maven/Gradle

## Instalación y Configuración

### Pre-requisitos
- Java 21
- Base de datos PostgreSQL

### Pasos de instalación
1. Clonar el repositorio: https://github.com/Lauren-Dayanna-Villanueva-Camero/SpringSecurityRoles.git
2. Crear la base de datos en PostgreSQL con el nombre de: SpringSecurityLogin
- CREATE DATABASE SpringSecurityLogin
3. Configurar base de datos en `application.properties`
   - spring.datasource.username=[tu usuario]
   - spring.datasource.password=[tu contraseña]
4. Ejecutar la aplicación

### Documentación en Swagger
1. La documentación en Swagger se encuentra disponible en el siguiente link: http://localhost:8080/swagger-ui/index.html
