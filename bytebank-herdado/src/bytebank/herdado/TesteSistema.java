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
public class TesteSistema {
    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setSenha(2222);
        
        Administrador adm = new Administrador();
        adm.setSenha(2222);
         
        SistemaInterno sistema = new SistemaInterno();
        sistema.autentica(g);
        sistema.autentica(adm);
    }
}
