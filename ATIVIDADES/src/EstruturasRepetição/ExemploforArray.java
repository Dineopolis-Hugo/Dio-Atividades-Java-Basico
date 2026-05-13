package EstruturasRepetição;

public class ExemploforArray {
    public static void main(String[] args) {

        //Em Arrays o indice inicia em ZERO

        String alunos[] = {"FELIPE" , "JONAS" , "JULIA" , "MARCOS"};

        //Array alunos
        //Array = conjuntos de elementos

        //for (int x=0; x< alunos.length; x++){

            // Enquanto X for menor que o tamanho de alunos X recebe +1
            //Length = tamanho

           // System.out.println("O alunos no índice x= " + x + " é " + alunos[x]);
        //exemplo 1 FOR ARRAYS

        for(String aluno: alunos){
            System.out.println("Nome do aluno é: " + aluno);
            //Com esse for each a cada aluno do array
            // vai mudar a variavel "aluno" do for
        }
        }
    }

