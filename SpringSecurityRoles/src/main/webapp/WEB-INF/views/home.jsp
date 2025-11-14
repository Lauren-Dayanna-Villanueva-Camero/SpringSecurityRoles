<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Inicio - Spring Security Roles</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <div class="row justify-content-center">
            <div class="col-md-6">
                <div class="card shadow">
                    <div class="card-header bg-success text-white text-center">
                        <h3>🎉 ¡Bienvenido!</h3>
                    </div>
                    <div class="card-body text-center">
                        <h4 class="text-primary">${username}</h4>
                        <p class="lead">Has ingresado como: <strong>${role}</strong></p>
                        
                        <div class="mt-4">
                            <c:if test="${role == 'ADMINISTRADOR'}">
                                <div class="alert alert-info">
                                    <h5>🔧 Panel de Administrador</h5>
                                    <p>Tienes acceso completo al sistema</p>
                                </div>
                            </c:if>
                            
                            <c:if test="${role == 'USUARIO'}">
                                <div class="alert alert-warning">
                                    <h5>👤 Panel de Usuario</h5>
                                    <p>Tienes acceso limitado al sistema</p>
                                </div>
                            </c:if>
                        </div>
                        
                        <a href="/logout" class="btn btn-outline-danger mt-3">Cerrar Sesión</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>