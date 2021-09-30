/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bytebank;

/**
 *
 * @author gabri
 */
public class TestaMetodo {
    public static void main(String[] args) {
        //conta Rezende
        Conta contaDoRezende = new Conta();
        contaDoRezende.saldo = 1000;
        
        //conta Paulo
        Conta contaDoPaulo = new Conta();
        contaDoPaulo.saldo = 1000;
        contaDoPaulo.deposita(50);
        System.out.println(contaDoPaulo.saldo);
        
        boolean conseguiuRetirar = contaDoPaulo.saca(50);
        System.out.println(conseguiuRetirar);
        System.out.println(contaDoPaulo.saldo);
        
        boolean conseguiuTransferir = contaDoPaulo.transfere(100, contaDoRezende);
        System.out.println("Saldo do Rezende: "+contaDoRezende.saldo);
        if(conseguiuTransferir==true){
            System.out.println("Tranferência concluída!");
        } else {
            System.out.println("Error!");
        }
        
        System.out.println("Saldo do Paulo: "+contaDoPaulo.saldo);
        
        contaDoPaulo.titular = "Paulo Silveira";
        
                
    }
}
