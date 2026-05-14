package EstruturasExcepcionais;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;
public class AboutMeExceçao {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome: ");
            String nome = scanner.nextLine();

            System.out.println("Digite seu sobrenome: ");
            String sobrenome = scanner.nextLine();

            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura");
            float altura = scanner.nextFloat();

            System.out.println("Ola, me chamo " + nome.toUpperCase());
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha altura é " + altura + "M");


        }
        catch (InputMismatchException e){
            System.err.println("Os campos IDADE e ALTURA PRECISAM ser NÚMÉRICOS");

        }
    }
}
