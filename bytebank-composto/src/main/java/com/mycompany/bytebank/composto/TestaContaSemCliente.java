/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bytebank.composto;

/**
 *
 * @author gabri
 */
public class TestaContaSemCliente {
    public static void main(String[] args) {
        Conta contaDaMarcela = new Conta();
        Cliente marcela = new Cliente();
        marcela.nome = "Marcela Lima";
        marcela.cpf = "111.111.111-11";
        marcela.profissao = "DBA";
        
        System.out.println(contaDaMarcela.getSaldo());
        
        
        contaDaMarcela.titular = marcela;
        System.out.println(contaDaMarcela.titular.nome);
    }
}
