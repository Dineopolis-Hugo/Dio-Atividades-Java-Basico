package EstruturasExcepcionais;

import java.text.NumberFormat;
import java.text.ParseException;


public class ExemploExceção {
    public static void main(String[] args) {

        //Number valor = Double.valueOf("a1.75");

        Number valor = null;
        try {
            // O try vai rodar o código
            valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);

        } catch (ParseException e) {
            // O catch pega a exceção para tratar
            throw new RuntimeException(e);
        }

    }
}
