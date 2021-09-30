
package bytebank.herdado;

public class TesteReferencias {
    public static void main(String[] args) {
        //Gerente é funcionário
        Funcionario g1 = new Gerente();
        g1.setNome("Marcos");
        g1.setSalario(5000);
       
        ControleBonificacao controle = new ControleBonificacao();
        
        Funcionario e1 = new EditorVideo();
        e1.setNome("João");
        e1.setSalario(2500);
        
        Funcionario d1 = new Designer();
        d1.setNome("João");
        d1.setSalario(2000);
        
        controle.registra(g1);
        controle.registra(e1);
        controle.registra(d1);
        
        System.out.println(controle.getSoma());
        
    }
}
