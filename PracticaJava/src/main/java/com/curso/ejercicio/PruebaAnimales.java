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
public class PruebaAnimales{
    

    public static void animalComiendo(Animal a1){
        a1.comer();
    }

    public static void animalVolando(Volador a1){
        a1.volar();
    }
    
    public static void main(String a[]){
        Gato g1 = new Gato();
        Perro p1 = new Perro();
        Culebra c1 = new Culebra();
        c1.volar();
        animalComiendo(g1);
        animalComiendo(p1);
        animalComiendo(c1);
        
        animalVolando(c1);
        Volador t1 = new Culebra();
        t1.volar();
    }
    
}
