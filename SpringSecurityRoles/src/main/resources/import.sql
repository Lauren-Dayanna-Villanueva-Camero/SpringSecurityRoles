-- Insertar roles
INSERT INTO roles (name) VALUES ('ADMINISTRADOR');
INSERT INTO roles (name) VALUES ('USUARIO');

-- Insertar usuario administrador (password: 1234)
INSERT INTO users (username, password, enabled) VALUES ('admin', '$2a$10$kReZUnYT0LU8fbSDwJjyQOYMfzipGL/CapXzldUVMkksQKaSVhEn6', true);

-- Insertar usuario normal (password: 1234)
INSERT INTO users (username, password, enabled) VALUES ('usuario', '$2a$10$kReZUnYT0LU8fbSDwJjyQOYMfzipGL/CapXzldUVMkksQKaSVhEn6', true);

-- Asignar roles
INSERT INTO users_roles (user_id, role_id) VALUES (1, 1);
INSERT INTO users_roles (user_id, role_id) VALUES (2, 2);