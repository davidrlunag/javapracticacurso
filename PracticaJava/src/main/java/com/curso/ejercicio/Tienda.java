/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.ejercicio;

import java.util.List;
import lombok.Data;

/**
 *
 * @author Gameth
 */
@Data
public class Tienda {
    private int id;
    private String nombre;
    private String telefono;
    private String direccion;
    private List<Vendedor> vendedores;
    private List<Producto> productos;
    
    
}
