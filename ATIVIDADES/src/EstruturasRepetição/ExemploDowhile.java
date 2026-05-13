package EstruturasRepetição;
import java.util.Random;
public class ExemploDowhile {
    public static void main(String[] args) {

        System.out.println("Discando...");

        do {
            //executando repetidas vezes, até alguém atender
            System.out.println("Telefone tocando");

            System.out.println(" ");
        }while (tocando());
            // Esse do while vai executar "tocando" ATÉ QUE
            // O método "tocando" seja false (Tenham atendido)
        System.out.println("Alô !!!");

    }
    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu?" + atendeu);

        return ! atendeu;
        // o "!" Ele inverte um valor booleano:
        //true vira false
        //false vira true

        //No contexto do método ele retorna o contrário:
        //se atendeu → o telefone NÃO continua tocando
        //se não atendeu → continua tocando
    }
}
