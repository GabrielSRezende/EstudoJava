
package bytebank;


public class Conta {
    //Atributos
    double saldo;
    int agencia, numero;
    String titular;
    
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
    
}

