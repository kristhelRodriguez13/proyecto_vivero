/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.viero.vivero_proyecto.domain;

/**
 *
 * @author 50686
 */

import jakarta.persistence.*;

import jakarta.persistence.*;

@Entity // Indica que esta clase es una entidad JPA (se mapea a una tabla en la BD)
@Table(name = "Usuarios") // Especifica el nombre de la tabla en la base de datos
public class Usuario {

    // Clave primaria, se autogenera con incremento automático
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_usuario;

    // Campo obligatorio, máximo 100 caracteres
    @Column(name = "nombre_usuario", nullable = false, length = 100)
    private String nombreUsuario;

    // Campo obligatorio, único (no se puede repetir), máximo 150 caracteres
    @Column(name = "email_usuario", nullable = false, length = 150, unique = true)
    private String emailUsuario;

    // Campo obligatorio para la contraseña, se puede encriptar para más seguridad
    @Column(name = "contraseña_usuario", nullable = false, length = 255)
    private String contraseñaUsuario;

    // Campo opcional para el apellido del usuario
    @Column(name = "apellido_usuario", length = 100)
    private String apellidoUsuario;

    // Constructor vacío requerido por JPA
    public Usuario() {
    }

    // Constructor útil para crear usuarios rápidamente en el código
    public Usuario(String nombreUsuario, String apellidoUsuario, String emailUsuario, String contraseñaUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.emailUsuario = emailUsuario;
        this.contraseñaUsuario = contraseñaUsuario;
    }

    // Getters y setters para acceder o modificar los datos del usuario

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getContraseñaUsuario() {
        return contraseñaUsuario;
    }

    public void setContraseñaUsuario(String contraseñaUsuario) {
        this.contraseñaUsuario = contraseñaUsuario;
    }
}