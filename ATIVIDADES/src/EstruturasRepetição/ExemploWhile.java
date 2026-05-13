package EstruturasRepetição;
import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
    public static void main(String[] args) {

        double mesada = 50.0;

        while(mesada > 0 ){
            // Enquanto a mesada for maior que zero ele pega um doce
            double valorDoce = valorAleatorio();

            if(valorDoce > mesada) {
                valorDoce = mesada;}
                // Se o doce for um preço maior que a mesada o doce fica com o valor da mesada

                System.out.printf( "Doce do valor: %.2f " , valorDoce , " Adicionado ao carrinho");
                mesada = mesada - valorDoce;

                // Adiciona o doce ao "carrinho" e "paga" o doce

            System.out.println(" ");

            System.out.printf("Mesada: %.2f " , mesada);
            // Print valor da mesada

            System.out.println(" ");

            System.out.println("Joãozinho gastou toda a sua mesada em doces");

            //printf para formatar usei % + "numero de casas apos a virgula" + f
        }



        }
        private static double valorAleatorio(){
        return  ThreadLocalRandom.current().nextDouble(2,8);
        // Método pra pegar um valor aleatório
        }
    }

