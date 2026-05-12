package Controle_Fluxo;

public class SistemaMedida {
    public static void main(String[] args) {

       /* String sigla = "M";

        *if (sigla == "P"){
        *    System.out.println("PEQUENO");
        *} else if (sigla == "M") {
         *   System.out.println("MÉDIO");}
        *else if (sigla == "G") {
        *    System.out.println("GRANDE");}
        *else {
        *    System.out.println("INDEFINIDO");}
        *algoritmo no IF/ELSE */

        String sigla = "M";

        switch (sigla){
            case "P":{
                System.out.println("PEQUENO");
                break;}

            case "M":{
                System.out.println("MÉDIO");
                break;}

            case "G":{
                System.out.println("GRANDE");
                break;}

            default:{
                System.out.println("INDEFINIDO");}
            // NESTE CASO NÃO TEVE UM BENEFÍCIO NO USO DO SWITCH,
            // POIS FICOU MAIOR QUE COM IF ELSE DESEMOENHANDO O MESMO PAPEL
        }



    }
}
