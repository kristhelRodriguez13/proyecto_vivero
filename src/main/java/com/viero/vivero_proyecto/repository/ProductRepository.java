/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.viero.vivero_proyecto.repository;


import java.util.List;
import java.util.ArrayList;

public class ProductoRepository {
    public List<Producto> obtenerTodos() {
        List<Producto> productos = new ArrayList<>();
        
        productos.add(new Producto("Monstera", "Originaria de América Central, su follaje único la convierte en un detalle exótico en cualquier espacio.", 15.00, "https://www.provenwinners.com/sites/provenwinners.com/files/ifa_upload/monstera_delicisoa_monster_mash_swiss_cheese_vine_tag.jpg"));
        productos.add(new Producto("Hoja de Violín", "Esta planta es famosa por sus hojas grandes y brillantes, perfectas para la decoración interior.", 20.00, "https://cdn.be.green/large/63e0d90c4dbd1955162692.jpg"));
        productos.add(new Producto("Planta Serpiente", "La Sansevieria es muy resistente y purifica el aire, ideal para interiores con poca luz.", 12.00, "https://images.prismic.io/begreen/b10bbf3b-2192-4f0e-8630-5e72452231ac_1_1_serpiente.jpg?auto=compress,format&rect=0,0,1600,1600&w=680&h=680"));
        
        return productos;
    }
}
