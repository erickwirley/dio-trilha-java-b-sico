package aula.exercicio;

public class Usuario {
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Está no canal: " + smartTv.canal);
        System.out.println("Está no volume:" + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status->Tv ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status->Tv ligada? " + smartTv.ligada);

        smartTv.diminuirVolume();
        System.out.println("Volume Atual: " + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Volume Atual: " + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Volume Atual: " + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.aumentarVolume();
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.mudarCanal(15);
        System.out.println("Canal atual: "+ smartTv.canal);
        
        smartTv.aumentarCanal();
        System.out.println("Canal atual: "+ smartTv.canal);

        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        System.out.println("Canal atual: " + smartTv.canal);



    }
}
