/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cursojava.prueba1;

/**
 *
 * @author Gameth
 */
public abstract class Prueba1{
    private final int edad;
    
     public  Prueba1(int edad){
        this.edad=edad;
        System.out.println("Soy el constructor de Prueba 1 --- " + edad);
    }
    
    public final int getEdad(){
        return edad;
    }
    
}
