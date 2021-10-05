
package bytebank.herdado;
//Gerente é um funcionário, gerente herda class funcionário, assina o contrato autenticavel
public class Gerente extends Funcionario implements Autenticavel{
    
    private final AutenticacaoUtil autenticador;
    
    public Gerente() {
        this.autenticador = new AutenticacaoUtil();
    }
    
    @Override
    public double getBonificacao() {
        // this. é apenas utilizado por atributos da própria classe
        // pode utilizar super. para indicar que é var da super
        //return super.getBonificacao() + super.getSalario();
        return super.getSalario();
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
