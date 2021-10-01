
package bytebank.herdado;

public class Gerente extends FuncionarioAutenticavel {
    
    public double getBonificacao() {
        // this. é apenas utilizado por atributos da própria classe
        // pode utilizar super. para indicar que é var da super
        //return super.getBonificacao() + super.getSalario();
        return super.getSalario();
    } 
}
