package Encapsulamento;

public class Agenda {

   private int dia;
   private int mes;
   private String anotacao;

    public void anote(int d, int m, String nota) {
        dia = d;
        mes = m;
        anotacao = nota;
        validaData();
    }

    private void validaData() {
        if ((dia < 1) || (dia > 31) || (mes < 1) || (mes > 12)) {
            dia = 0;
            mes = 0;
            anotacao = "Anotação não inserida devido a data invalida";
        }

    }

    public void mostraAnotacao() {
        System.out.println(dia + "/" + mes + " :" + anotacao);
    }

}
