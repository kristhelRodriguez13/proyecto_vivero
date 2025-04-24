/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.viero.vivero_proyecto.service;

/**
 *
 * @author 50686
 */
import com.viero.vivero_proyecto.domain.Usuario;
import com.viero.vivero_proyecto.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // Esta anotación indica que esta clase es un servicio de Spring (componente de lógica de negocio)
public class UsuarioService {

    // Inyección automática del repositorio que maneja la entidad Usuario
    @Autowired
    private UsuarioRepository usuarioRepository;

    // Método para registrar un nuevo usuario en la base de datos
    public Usuario registrarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario); // Guarda el usuario y lo retorna
    }
    
    // Método para validar el inicio de sesión del usuario
    public Usuario loginUsuario(String email, String password) {
        // Busca el usuario por su correo
        Usuario u = usuarioRepository.findByEmailUsuario(email);

        // Si existe y la contraseña coincide, retorna el usuario (login exitoso)
        if (u != null && u.getContraseñaUsuario().equals(password)) {
            return u; 
        }

        // Si no coincide el usuario o la contraseña, retorna null (login fallido)
        return null; 
    }
}