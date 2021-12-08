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
public class Gato extends Animal implements Corredor{
    
    
    public void comer(){
        System.out.println("Estoy comiendo --- Soy Gato");
    }
    
    public void correr(){
        System.out.println("Estoy Corriendo --- Soy Gato");
    }
}
