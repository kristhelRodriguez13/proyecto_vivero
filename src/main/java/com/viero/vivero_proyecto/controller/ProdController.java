/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.viero.vivero_proyecto.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProdController {
    private ProductoService productoService;

    public ProdController() {
        this.productoService = new ProductoService();
    }

    @GetMapping("/productos")
    public String obtenerProductos(Model model) {
        model.addAttribute("productos", productoService.obtenerProductos());
        return "products"; // El nombre del archivo de la plantilla
    }
}
