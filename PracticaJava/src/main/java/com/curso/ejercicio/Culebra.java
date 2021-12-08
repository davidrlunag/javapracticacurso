/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.ejercicio;

import java.io.Serializable;

/**
 *
 * @author Gameth
 */
public class Culebra  extends Animal implements Volador, Serializable{
    
    public void comer(){
        System.out.println("Estoy comiendo -- Soy la Culebra");
    }
    
    public void volar(){
         System.out.println("Soy la Culebra voladora");
    }
}