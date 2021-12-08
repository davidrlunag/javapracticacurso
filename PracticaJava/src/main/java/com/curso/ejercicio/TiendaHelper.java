/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.ejercicio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gameth
 */
public class TiendaHelper {
    private static List<Vendedor> vendedores=new ArrayList<>();
    private static List<Producto> productos=new ArrayList<>();

    public static void creaProductos(Tienda tienda){
        Producto p1 = new Producto();
        p1.setCodigo("1");
        p1.setNombre("Linea Movistar 5G");
        p1.setPrecio(10);
        Producto p2= new Producto();
        p2.setCodigo("2");
        p2.setNombre("Linea Movistar Plus 5G");
        p2.setPrecio(10);
        Producto p3 = new Producto();
        p3.setCodigo("3");
        p3.setNombre("Linea Movistar Pepe 5G");
        p3.setPrecio(10);
        Producto p4= new Producto();
        p4.setCodigo("4");
        p4.setNombre("Linea Movistar Lunatica 5G");
        p4.setPrecio(10);
        if(tienda.getId()==1){
            productos.add(p1);
            productos.add(p2);
        }else if(tienda.getId()==2){
            productos.add(p1);
            productos.add(p2);
            productos.add(p3);
        }else{
            productos.add(p1);
            productos.add(p2);
            productos.add(p3);
            productos.add(p4);

        }
        tienda.setProductos(productos);
    }
    
    public static void creaVendedores(Tienda tienda){
        Vendedor v1 = new Vendedor("1","Vendedor 01", "0001");
        v1.setCodigo("1");
        v1.setTienda(tienda);
        Vendedor v2 = new Vendedor("2","Vendedor 02", "0002");;
        v1.setCodigo("2");
        v1.setTienda(tienda);
        vendedores.add(v2);
        vendedores.add(v1);
        tienda.setVendedores(vendedores);
    }
    
}
