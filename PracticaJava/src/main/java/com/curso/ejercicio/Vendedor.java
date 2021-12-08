/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.ejercicio;

import java.util.logging.Level;
import java.util.logging.Logger;
import lombok.Data;

/**
 *
 * @author Gameth
 */
@Data
public class Vendedor extends Persona {
    private String codigo;
    private Tienda tienda;
    
   public Vendedor(String cedula, String nombre, String apellido){
       super(cedula, nombre, apellido);
   }
   
   public void vender(Cliente c1, Producto p1){
       System.out.println("Le voy a vender a " + c1.getNombre() + " el producto " + p1.getNombre());
   }
   
   public void activarLinea(Producto p1) {
       System.out.println("EL vendedor se encuentra activando su línea... Espere unos momentos");
       p1.activar();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Vendedor.class.getName()).log(Level.SEVERE, null, ex);
        }
       System.out.println("Su línes ya see encuentra activa, ahora si puede realizar llamadas");
   }

}
