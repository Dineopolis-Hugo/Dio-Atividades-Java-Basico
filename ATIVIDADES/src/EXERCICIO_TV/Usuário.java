package EXERCICIO_TV;

public class Usuário {
    public static void main(String[] args) throws Exception{
        SmartTv smartTv= new SmartTv();

        smartTv.mudarCanal(15);
            // usa o nome do objeto e o ponto pra chamar os metodos, como ai em cima \\

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);


    }
}
