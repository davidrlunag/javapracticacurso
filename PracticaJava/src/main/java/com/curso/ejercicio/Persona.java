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
public class Persona {
    private String cedula;
    private String nombre;
    private String apellido;
    
    public Persona(String v1, String v2, String v3){
        this.cedula=v1;
        this.nombre=v2;
        this.apellido=v3;
    }


}
