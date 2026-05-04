package EXERCICIO_TV;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    // Parametros base da TV \\

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Mudando para o canal: " + canal); }
    // Metodo mudar canal: usuario decide o  num do canal e ele muda para o num escolhido \\

public void aumentarCanal(){
    canal++;
    System.out.println("Aumentando para o canal: " + canal);}
    // Metodos aumentar e diminuir canal \\

    public void diminuirCanal(){
    canal--;
        System.out.println("Diminuindo para o canal: " + canal);
    }


    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando volume para: " + volume); }
    // Metodos aumentar e diminuir volume \\

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo volume para: " + volume); }


    public void ligar(){
        ligada = true; }
    // Metodos ON/OFF \\

    public void desligar(){
        ligada= false; }

}
