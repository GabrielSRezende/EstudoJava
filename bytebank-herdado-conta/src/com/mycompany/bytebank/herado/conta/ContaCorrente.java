
//New ContaCorrente
package com.mycompany.bytebank.herado.conta;

public class ContaCorrente extends Conta{
    
    public ContaCorrente(int agencia, int numero){
        //Chamando construtor específico
        super(agencia, numero); //chamada do construtor da classe mãe
    }
    
    //Mais um exemplo de polimorfismo
    @Override //Anotação - compilador sabe que vc está sobre escrevendo o método
    public boolean saca(double valor) {
       //double valorASacar = valor + ;
        return super.saca(valor+0.2); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deposita(double valor) {
        double saldo = super.getSaldo();
        super.setSaldo(saldo += valor);
    }
  
}
