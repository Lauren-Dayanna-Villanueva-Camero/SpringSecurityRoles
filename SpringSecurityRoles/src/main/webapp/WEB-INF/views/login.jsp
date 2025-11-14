<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login - Spring Security Roles</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            min-height: 100vh;
            display: flex;
            align-items: center;
            justify-content: center;
        }
        .login-container {
            background: white;
            border-radius: 15px;
            box-shadow: 0 10px 25px rgba(0,0,0,0.2);
            padding: 40px;
            width: 100%;
            max-width: 400px;
        }
    </style>
</head>
<body>
<div class="login-container">
    <div class="text-center mb-4">
        <h2>🔐 Spring Security Roles</h2>
        <p class="text-muted">Sistema de autenticación con roles</p>
    </div>

    <c:if test="${param.error != null}">
        <div class="alert alert-danger">Usuario o contraseña incorrectos</div>
    </c:if>

    <c:if test="${param.logout != null}">
        <div class="alert alert-success">Has cerrado sesión correctamente</div>
    </c:if>

    <form action="/perform-login" method="post">
        <div class="mb-3">
            <label class="form-label">Usuario</label>
            <input type="text" name="username" class="form-control" required>
        </div>
        
        <div class="mb-3">
            <label class="form-label">Contraseña</label>
            <input type="password" name="password" class="form-control" required>
        </div>
        
        <button type="submit" class="btn btn-primary w-100">Ingresar</button>
    </form>

    <div class="mt-4 p-3 bg-light rounded">
        <h6>👥 Usuarios de prueba:</h6>
        <small>
            <div><strong>Administrador:</strong> admin / 1234</div>
            <div><strong>Usuario:</strong> usuario / 1234</div>
        </small>
    </div>
</div>
</body>
</html>