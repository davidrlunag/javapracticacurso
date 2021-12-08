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
public class Ventas {
    Tienda tienda;

    public static void main(String a[]){
       Ventas ventas = new Ventas();
       ventas.tienda=new Tienda();
       ventas.tienda.setId(1);
       ventas.tienda.setNombre("Tienda de Digitel");
       TiendaHelper.creaProductos(ventas.tienda);
       TiendaHelper.creaVendedores(ventas.tienda);
       Cliente c1=new Cliente("1234", "David", "Luna");
       c1.setDireccion("Costa Rica");
       c1.setEmail("davidrlunag@gmail.com");
       c1.setTelefono("62265935");
       Producto p1 = ventas.tienda.getProductos().get(0);
       Vendedor v1=ventas.tienda.getVendedores().get(0);
       v1.vender(c1, p1);
       Pago pago = new Pago();
       c1.comprar(p1, pago.getTipo().EFECTIVO);
       v1.activarLinea(p1);
       c1.hacerLlamada(p1);
       
       
    }
    
    public void ajustesTienda(){
        
    }
}
