
package com.mycompany.bytebank.herado.conta;


public abstract class Conta {
    //Atributos
    //Atributo privados, fazem com que os atributos só possam ser mexidos aqui dentro.
    private double saldo;
    private int agencia, numero;
    //Composição
    private Cliente titular;
    private static int total; //static, da classe, não do objeto
    
    //Construtor - rotina de inicialização / obriga situações 
    public Conta(int agencia, int numero){
        Conta.total++;
        //System.out.println("O total de contas é: "+Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        //System.out.println("Estou criando uma conta!");
    }
    
    //Métodos
    public abstract void deposita(double valor);
    
    public boolean saca(double valor){
        if(this.saldo>=valor){
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }   
    }
    //Conta é um tipo genérico (POLIMORFISMO)
    public boolean transfere(double valor, Conta destino){ 
        if(this.saca(valor)){
            destino.deposita(valor);
            //destino.saldo += valor;
            return true;
        } 
        return false;
    }
    
    //get não é palavra chave.
    public double getSaldo(){
        return this.saldo;
        //Se tivesse banco de dados, aqui rodaria uma query para mostar o saldo
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public int getNumero() {
        return this.numero;
    }
    
    public void setNumero(int numero) {
        if(numero <= 0){
            System.out.println("Não pode ser negativo!");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
        
    }

    public void setAgencia(int agencia) {
        if(agencia <= 0){
            System.out.println("Não pode ser negativo!");
            return;
        }
        this.agencia = agencia;
    }

    public Cliente getTitular() {
        return titular;
    }
    
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return Conta.total;
    }
    
    
    
}

