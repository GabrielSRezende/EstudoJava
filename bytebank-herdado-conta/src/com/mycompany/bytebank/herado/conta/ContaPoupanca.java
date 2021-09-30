/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bytebank.herado.conta;

/**
 *
 * @author gabri
 */
public class ContaPoupanca extends Conta{
    
    public ContaPoupanca(int agencia, int numero){
        //Chamando construtor específico
        super(agencia, numero); //chamada do construtor da classe mãe
    }
    
    @Override
    public void deposita(double valor) {
        double saldo = super.getSaldo();
        super.setSaldo(saldo += valor);
    }
    
}
