/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.ejercicio;

/**
 *
 * @author Gameth
 */
public abstract class Animal {
    private String nombre;
    private String raza;
    
    public void dormir(){
        System.out.println("El animal " + raza + " duerme");
    }
    
    public abstract void comer();

}
