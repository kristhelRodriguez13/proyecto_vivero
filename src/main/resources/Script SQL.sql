CREATE DATABASE ViveroDB;
USE ViveroDB;

-- Tabla de Categorías
CREATE TABLE Categorias (
    id_categoria INT PRIMARY KEY AUTO_INCREMENT,
    nombre_categoria VARCHAR(100) NOT NULL,
    descripcion_categoria TEXT
);

-- Tabla de Productos
CREATE TABLE Productos (
    id_producto INT PRIMARY KEY AUTO_INCREMENT,
    nombre_producto VARCHAR(150) NOT NULL,
    descripcion TEXT,
    precio DECIMAL(10,2) NOT NULL,
    id_categoria INT,
    stock INT NOT NULL,
    FOREIGN KEY (id_categoria) REFERENCES Categorias(id_categoria)
);

-- Tabla de Roles de Usuarios
CREATE TABLE Roles_Usuarios (
    id_rol INT PRIMARY KEY AUTO_INCREMENT,
    nombre_rol VARCHAR(50) NOT NULL,
    descripcion_rol TEXT
);

-- Tabla de Usuarios
CREATE TABLE Usuarios (
    id_usuario INT PRIMARY KEY AUTO_INCREMENT,
    nombre_usuario VARCHAR(100) NOT NULL,
    email_usuario VARCHAR(150) NOT NULL UNIQUE,
    contraseña_usuario VARCHAR(255) NOT NULL,
    id_rol INT,  
    FOREIGN KEY (id_rol) REFERENCES Roles_Usuarios(id_rol) ON DELETE SET NULL  -- Establecer NULL si el rol es eliminado
);

-- Tabla de Contacto (para almacenar teléfonos y correos adicionales)
CREATE TABLE Contacto (
    id_contacto INT PRIMARY KEY AUTO_INCREMENT,
    id_usuario INT,
    telefono VARCHAR(20),
    email VARCHAR(150),
    FOREIGN KEY (id_usuario) REFERENCES Usuarios(id_usuario) ON DELETE CASCADE
);

-- Tabla de Blog
CREATE TABLE Blog (
    id_blog INT PRIMARY KEY AUTO_INCREMENT,
    tema VARCHAR(200) NOT NULL
);

-- Tabla de Comentarios
CREATE TABLE Comentarios (
    id_comentario INT PRIMARY KEY AUTO_INCREMENT,
    id_usuario INT,
    id_blog INT,
    texto TEXT NOT NULL,
    FOREIGN KEY (id_usuario) REFERENCES Usuarios(id_usuario) ON DELETE CASCADE,
    FOREIGN KEY (id_blog) REFERENCES Blog(id_blog) ON DELETE CASCADE
);
