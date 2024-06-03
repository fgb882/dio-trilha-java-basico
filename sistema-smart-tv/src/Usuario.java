public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        System.out.println("TV Ligada?: " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume TV: " + smartTv.volume);

        smartTv.ligarTv();
        System.out.println("TV Ligada?: " + smartTv.ligada);
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarValorCanal();
        smartTv.diminuirValorCanal();
        smartTv.diminuirValorCanal();
        smartTv.aumentarValorCanal();
        smartTv.definirValorCanal(25);




    }
}
