public class Operadores {
public static void main(String[] args) {

/*String nomecompleto = "LINGUAGEM " + "JAVA";
   * System.out.println(nomecompleto); */

   /*String concatenaçao = "?";

    concatenaçao = 1+1+1+"1";
    System.out.println(concatenaçao);
    // 31 Pois foi 1+1+1 = 3 e o caracter 1

    concatenaçao = 1+"1"+1+1;
    System.out.println(concatenaçao);
    /* 1111 Pois a partir do momento que ele identificou o caracter
    * ele reconheceu os outros numeros como caracter também
    */

    /*concatenaçao = 1+"1"+1+"1";
     *System.out.println(concatenaçao);
    // Mesmo caso do anterior \\

    concatenaçao = "1"+1+1+1;
    System.out.println(concatenaçao);
    // Mesmo caso do anterior \\

    concatenaçao = "1"+(1+1+1);
    System.out.println(concatenaçao);
    /* 13 pois ele fez a soma primeiro (pois estava em parenteses)
     * e depois printou o caracter e o resultado da soma
     */

    //int numero = 5;
   // numero = - numero;
    // o sinal " - " transforma o número em negativo

       // System.out.println(numero);
  //  numero = numero * -1;
    // Fazendo a multiplicação por -1 transforma em positivo dnv

       // System.out.println(numero);

        //boolean var = true;
   // System.out.println(! var);
    // "!" é o sinal de diferente, entao vai printar o contrario da afirmação lógica \\

    // Operadores condicionais
boolean condicao1 = true;
boolean condicao2 = false;

if (condicao1 &&  condicao2) {
    /* NO && (E) as duas condições tem que ser verdadeiras para retornar true
     * NO || (OU) uma ou as duas das condições tem que ser verdadira para retornar true
     * no ^ (OU EXCLUSIVO) APENAS UMA das condiçoes tem que ser verdadeira para retornar true
     */
    System.out.println("as duas condições são verdadeiras");
    if (condicao1 || condicao2) {
        System.out.println("uma das condições é verdadeira");
    }
        }
    System.out.println("fim");
    }
}
