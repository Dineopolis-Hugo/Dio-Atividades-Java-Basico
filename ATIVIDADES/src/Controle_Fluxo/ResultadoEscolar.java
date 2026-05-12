package Controle_Fluxo;

public class ResultadoEscolar {
    public static void main(String[] args) {

        int nota = 6;

        if (nota >= 7) {
            System.out.println("Aprovado");}

        else if (nota >= 5 && nota < 7) {
            System.out.println("Em Recuperação");
            //ESTRUTURA CONDICIONAL ENCADEADA (QUANDO POSSUI O ELSE IF)
            
        } else{
            System.out.println("Reprovado");}

        //ESTRUTURA CONDICIONAL COMPOSTA (NA ESTRUTURA CONTÉM IF E ELSE)

    }
}
