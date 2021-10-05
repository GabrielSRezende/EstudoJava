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
public class Cliente implements Autenticavel{

    private AutenticacaoUtil autenticador;
    
    public Cliente() {
        this.autenticador = new AutenticacaoUtil();
    }
    
    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
       return this.autenticador.autentica(senha);
    }  
}
