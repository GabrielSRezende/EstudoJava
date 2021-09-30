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
public class TesteSacaNegativo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.deposita(100);
        conta.saca(200);
        System.out.println(conta.getSaldo());
       
        
//        //Queremos que isso seja proibído:
//        conta.saldo = conta.saldo - 101;
//        System.out.println(conta.saldo);
    }
}
