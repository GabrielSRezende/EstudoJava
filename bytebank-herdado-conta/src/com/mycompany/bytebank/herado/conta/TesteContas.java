
package com.mycompany.bytebank.herado.conta;

public class TesteContas {
    public static void main(String[] args) {
        
        ContaCorrente contaC = new ContaCorrente(111, 111);
        contaC.deposita(100);
        
        ContaPoupanca contaP = new ContaPoupanca(222, 222);
        contaP.deposita(200);
        
        contaC.transfere(10, contaP);
        
        System.out.println("Conta corrente: "+contaC.getSaldo());
        System.out.println("Conta poupança: "+contaP.getSaldo());
        
//        contaC.saca(10);
//        
//        System.out.println(contaC.getSaldo());

       
    }
}
