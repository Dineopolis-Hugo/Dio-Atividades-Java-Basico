package Debug_E_PilhaDeExecução;

import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
                        // RESOLUÇÃO
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Camila" , "Lucas" , "Bruna" , "Pedro"  };

        int media = calculaMediaDaTurma(alunos, scan);
        // DOUBLE media

        System.out.printf("Média da turma%d" , media);
        // "Média da turma %.1f
    }
    public static int calculaMediaDaTurma(String[] alunos, Scanner scanner) {
        // public static DOUBLE calculaMediaDaTurma

        int soma = 0;
        // DOUBLE soma
        for(String aluno : alunos){
            System.out.printf("Nota do aluno %s: ", aluno);
            int nota = scanner.nextInt();
            // DOUBLE nota
            soma += nota;


        }
        return soma /  alunos.length;
    }
    /* Debugging
     * Neste exemplo o programa esta danto a nota como número inteiro.
     * Mas se eu colocar algumas nótas a média deveria ser double (decimal)
     */

    /* Resolução
     * O programa estava tratando as notas como INT (INTEIRO)
     * O correto seria tratar como DOUBLE (DECIMAL)
     */
}
