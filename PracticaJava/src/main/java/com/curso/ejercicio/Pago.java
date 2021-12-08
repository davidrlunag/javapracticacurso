/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.ejercicio;

import lombok.Data;

/**
 *
 * @author Gameth
 */
@Data
public class Pago {
    private TIPOPAGO tipo;
    private String dato;
            
    public void cobrar(float monto){
        System.out.println("El pago se realizó correctamente");
    }
            
    
}

enum TIPOPAGO{
    EFECTIVO,
    TARJETADEBITO,
    TARJETACREDITO,
    TRANSFERENCIA
}
