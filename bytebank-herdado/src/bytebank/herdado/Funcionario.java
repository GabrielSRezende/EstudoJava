
package bytebank.herdado;

//abstract-bloqueia a criação de um objeto apenas funcionário
//Agora é preciso criar um que seja filho, como gerente e editor.
public abstract class Funcionario { //não pode instanciar dessa classe
    
    private String nome;
    private String cpf; 
    //protected - só as classes filhas podem acessar
    private double salario;
    
    //Método abstract - Método sem corpo, pois cada tipo de funcionário possui o método da sua forma
    public abstract double getBonificacao();
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
}
