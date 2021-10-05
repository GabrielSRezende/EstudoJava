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
public class TesteFuncionario {
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente();
        
        Gerente nico = new Gerente();
        nico.setNome("Nico Speddat");
        nico.setCpf("234.234.234.2");
        nico.setSalario(2400.00);
        
        System.out.println(nico.getNome());   
        System.out.println(nico.getBonificacao());
        
    }
}
