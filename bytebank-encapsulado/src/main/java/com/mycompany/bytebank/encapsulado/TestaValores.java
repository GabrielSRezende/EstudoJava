/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bytebank.encapsulado;

/**
 *
 * @author gabri
 */
public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 24226); //parentesses invoca um construtor
        
        //Conta está incosistente
        conta.setAgencia(-50);
        conta.setNumero(-300);
        
        System.out.print(conta.getAgencia());
        
        conta.setAgencia(12345);
        
        Conta conta2 = new Conta(1337, 16549); 
        
        System.out.println(Conta.getTotal());
    }
            
}
