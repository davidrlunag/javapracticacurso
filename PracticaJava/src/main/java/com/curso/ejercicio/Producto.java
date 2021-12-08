/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.ejercicio;

import lombok.Data;

/**
 *
 * @author Gameth
 */
@Data
public class Producto {
    private String codigo;
    private String nombre;
    private float precio;
    private boolean activar;
    
    public void llamar(){
        if(activar)
            System.out.println("Estoy llamando");
        else
            System.out.println("La linea está inactiva");
    }
    
    public void activar(){
        activar=true;
        System.out.println("Línea Activa");
    }
}
