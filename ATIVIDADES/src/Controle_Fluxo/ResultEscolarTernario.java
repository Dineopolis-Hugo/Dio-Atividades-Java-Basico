package Controle_Fluxo;

public class ResultEscolarTernario {
    public static void main(String[] args) {

        /*int nota = 7;
         *String resultado = nota >= 7 ? "aprovado" : "reprovado";
         *System.out.println(resultado);*/

        int nota = 7;
        String resultado = nota >= 7 ? "aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);

        //OPERADOR TERNARIO PODE SER USADO PARA SUBSTITUIR UMA CONDICIONAL E DEIXAR O CÓDIGO MAIS LIMPO
        // ESTRUTURA: VAR RESULTADO = CONDIÇAO TERNARIO "?" SE A CONDIÇAO FOR VERDADEIRA VAR = RESULTADO (":" SENÃO) VAR = RESULTADO2
    }
}
