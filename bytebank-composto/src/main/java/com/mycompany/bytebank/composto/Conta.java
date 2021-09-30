
package com.mycompany.bytebank.composto;


public class Conta {
    //Atributos
    //Atributo privados, fazem com que os atributos só possam ser mexidos aqui dentro.
    private double saldo;
    int agencia, numero;
    Cliente titular;
    
    //Métodos
    public void deposita(double valor) { //void (Não espere nada) - Se não teria que colocar o tipo desvolvido
        this.saldo += valor;
        //System.out.println(saldo);
    }
    
    public boolean saca(double valor){
        if(this.saldo>=valor){
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }   
    }
    
    public boolean transfere(double valor, Conta destino){
        if(this.saldo>=valor){
            this.saldo -= valor;
            //destino.saldo += valor;
            destino.deposita(valor);
            return true;
        } 
        return false;
    }
    
    //get não é palavra chave.
    public double getSaldo(){
        return this.saldo;
        //Se tivesse banco de dados, aqui rodaria uma query para mostar o saldo
    }
    
    
    
}

