public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartv = new SmartTv();

        smartv.diminuirVolume();
        smartv.diminuirVolume();
        smartv.diminuirVolume();
        smartv.aumentarVolume();

        System.out.println("Volume atual " + smartv.volume);

        System.out.println("Tv ligada ? " + smartv.ligada);
        System.out.println("Canal atual ? " + smartv.canal);
        System.out.println("Volume atual ? " + smartv.volume);

        System.out.println();

        smartv.ligar();
        System.out.println("Novo status -> Tv ligada ? " + smartv.ligada);

        System.out.println(smartv.canal);
        System.out.println("Canal atual: " + smartv.canal);
        smartv.mudarCanal(13);
        System.out.println("Canal atual: " + smartv.canal);

    }
}
