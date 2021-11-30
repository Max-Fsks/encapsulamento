
package Encapsulamento;


public class Principal {
    
    public static void main(String[] args) {
        Agenda agenda1 = new Agenda();
        Agenda agenda2 = new Agenda();
        
        agenda1.anote(12, 10, "dia da criança");
        agenda2.anote(12, 15, "Natal");
        
        agenda1.mostraAnotacao();
        agenda2.mostraAnotacao();
    }
}
