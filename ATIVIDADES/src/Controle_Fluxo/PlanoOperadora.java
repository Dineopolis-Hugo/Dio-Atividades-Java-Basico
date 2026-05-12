package Controle_Fluxo;

public class PlanoOperadora {
    public static void main(String[] args) {

        /*String plano = "M";
         *if(plano == "B"){
         *  System.out.println("100 minutos de ligação");}
         *else if (plano == "M") {
         *   System.out.println("100 minutos de ligação");
         *   System.out.println("Whats e insta grátis");}
         *else if (plano == "T") {
         *   System.out.println("100 minutos de ligação");
         *   System.out.println("Whats e insta grátis");
         *   System.out.println("5Gb youtube");}
         * IF ELSE ALGORITMO
         */

        String plano = "M";

        switch (plano) {
            case "T": {
                System.out.println("5Gb Youtube");
            }
            case "M": {
                System.out.println("Whats e insta grátis");
            }
            case "B": {
                System.out.println("100 minutos de ligação");
            } /* HINT: COMO NAO COLOCOU BREAK
              * ELE VAI PEGAR O PLANO SELECIONADO E ADICIONAR O BENEFICIO DELE E OS DE BAIXO

              * EX: SE EU ESCOLHER O PLANO "M" ELE IRA PRINTAR O QUE ESTÁ NO PLANO "M" E O DO "B"

              * MAS, SE EU COLOCAR O PLANO "B" ELE SÓ IRÁ PRINTAR O QUE TA NO "B"

              * E SE SCOLHER O PLANO "T" ELE IRÁ PRINTAR O DO PLANO "T" E TODOS ABAIXO POIS NÃO TEM BREAK
              */

        } // USO EM QUE O SWITCH FOI MELHOR UTILIZADO
          // NESSE CASO ELE FEZ A MESMA FUNÇÃO DEIXANDO O CODIGO MAIS LIMPO
    }
}
