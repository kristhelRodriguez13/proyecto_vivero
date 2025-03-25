/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.viero.vivero_proyecto.controller;

/**
 *
 * @author 50686
 */
import com.viero.vivero_proyecto.domain.Usuario;
import com.viero.vivero_proyecto.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/register")
    public String handleRegister(@RequestParam("nombre") String nombre,
                                 @RequestParam("apellido") String apellido,
                                 @RequestParam("email") String email,
                                 @RequestParam("password") String password) {
        Usuario usuario = new Usuario();
        usuario.setNombreUsuario(nombre);
        usuario.setApellidoUsuario(apellido);
        usuario.setEmailUsuario(email);
        usuario.setContraseñaUsuario(password);  

        usuarioService.registrarUsuario(usuario);

     
        return "redirect:/login.html?registered=true";
    }
    
     @PostMapping("/login")
    public String handleLogin(@RequestParam("email") String email,
                              @RequestParam("password") String password) {
        // Verifica las credenciales del usuario
        Usuario u = usuarioService.loginUsuario(email, password);
        if (u != null) {
            // Si el login es exitoso, redirige a la página de inicio
            return "redirect:/home.html";
        } else {
            // Si falla, redirige de vuelta al login con un parámetro de error
            return "redirect:/login.html?error=true";
        }
    }
}
