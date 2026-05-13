package EstruturasRepetição;

public class BreakContinue {
    public static void main(String[] args) {

        for (int numero =1; numero <+5; numero++){
            if (numero ==3 ){
                continue;}
            // Se eu colocar break ele para de printar no 2,
            // Pois quando chega no 3 ele encerra sem printar

            //Se eu colocar continue quando chegar no 3
            // Ele irá PULAR o comando do print e passar pro próximo número
            System.out.println(numero);
        }
    }
}
