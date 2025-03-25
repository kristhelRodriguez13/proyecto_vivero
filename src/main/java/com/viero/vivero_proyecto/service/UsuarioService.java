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

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

  
    public Usuario registrarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
    
    public Usuario loginUsuario(String email, String password) {
        Usuario u = usuarioRepository.findByEmailUsuario(email);
        if (u != null && u.getContraseñaUsuario().equals(password)) {
            return u; 
        }
        return null; 
    }
}
