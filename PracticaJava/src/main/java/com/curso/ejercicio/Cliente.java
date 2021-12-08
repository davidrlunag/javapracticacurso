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
public class Cliente extends Persona{
    private String direccion;
    private String telefono;
    private String email;
    
   public Cliente(String cedula, String nombre, String apellido){
       super(cedula, nombre, apellido);
   }
    public void comprar(Producto producto, TIPOPAGO pago){
        System.out.println("Estás comprando " +  producto.getNombre() + " y tiene un costo de " + producto.getPrecio());
        pagar(pago,producto.getPrecio());
    }
    
    private void pagar(TIPOPAGO pago, float monto){
        System.out.println("Se está procesando su pago con " + pago + " ´por un monto de " + monto);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Su pago se procesó de forma exitosa");
    }
    
    public void hacerLlamada(Producto p1){
        System.out.println("Voy a realizar una llamada... Marcando...");
       p1.llamar();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Ya finalicé la llamada");
   }
}
