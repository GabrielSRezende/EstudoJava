/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bytebank.herdado;

/**
 *
 * @author gabri
 */
public class ControleBonificacao {
    
    private double soma;

    //Aponta de uma maneira genérica
    public void registra(Funcionario f){
        double boni = f.getBonificacao();
        this.soma += boni;
    }
    
    public double getSoma() {
        return soma;
    }
    
}
