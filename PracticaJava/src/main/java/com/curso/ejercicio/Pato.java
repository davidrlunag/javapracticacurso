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
public class Pato extends Animal implements Volador, Corredor{

    @Override
    public void comer() {
        System.out.println("Estoy Comiendo --- Soy Pato");
    }

    @Override
    public void volar() {
        System.out.println("Estoy Volando --- Soy Pato");
    }

    @Override
    public void correr() {
        System.out.println("Estoy Corriendo --- Soy Pato");
    }
    
}
