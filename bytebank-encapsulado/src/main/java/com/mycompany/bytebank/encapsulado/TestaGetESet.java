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
public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 24226);
        //conta.numero = 1337;
        conta.setNumero(1337);
        System.out.println(conta.getNumero());
        
        Cliente paulo = new Cliente();
        //conta.titular = paulo
        paulo.setNome("Paulo Silveira");
        conta.setTitular(paulo);
        
        System.out.println(conta.getTitular().getNome());
        
        conta.getTitular().setProfissao("Programador");
        //agora em duas linhas
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("Programador");
    }
}
