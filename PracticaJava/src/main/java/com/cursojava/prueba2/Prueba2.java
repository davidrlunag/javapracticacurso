/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cursojava.prueba2;
import com.cursojava.prueba1.Prueba1;
import java.util.Scanner;
/**
 *
 * @author Gameth
 */
public class Prueba2 extends Prueba1 {
    
    Prueba2(){
        super(10);
        System.out.println("Soy el constructor de Prueba 2");
    }
    
    public static void main(String args[]) {

        Prueba2 p2= new Prueba2();
        
    }
}
