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
public class Administrador extends FuncionarioAutenticavel{
    
    @Override
    public double getBonificacao() {
        return 50;
    }
    
}
