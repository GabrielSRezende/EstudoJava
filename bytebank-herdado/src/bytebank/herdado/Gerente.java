
package bytebank.herdado;

public class Gerente extends Funcionario {
    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }
    
    public boolean autentica(int senha){
        if(this.senha==senha){
            return true;
        } else {
            return false;
        }
    }
    
    public double getBonificacao() {
        // this. é apenas utilizado por atributos da própria classe
        // pode utilizar super. para indicar que é var da super
        //return super.getBonificacao() + super.getSalario();
        return super.getSalario();
    } 
}
