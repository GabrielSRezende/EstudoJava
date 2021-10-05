//Tudo abstrato - podemos tranformar em uma interface
//Contrato Autenticavel
        //Quem assina esse contrato, precisa implementar 
                //Método set senha 
                //Método autentica
package bytebank.herdado;

public abstract interface Autenticavel{

    public abstract void setSenha(int senha);
    
    public abstract boolean autentica(int senha);
}
