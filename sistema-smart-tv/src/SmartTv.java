public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 50;

    public void ligarTv(){
        ligada = true;
    }

    public void desligarTv(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Volume aumentado para: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Volume diminuido para: " + volume);
    }

    public void aumentarValorCanal(){
        canal++;
        System.out.println("Canal: " + canal);
    }

    public void diminuirValorCanal(){
        if(canal > 1){
            canal--;
            System.out.println("Canal: " + canal);
        }else{
            System.out.println("Canal já está no canal mínimo");
        }
      
    }

    public void definirValorCanal(int valorCanal){
        if(valorCanal >= 1){
        canal = valorCanal;
        System.out.println("Canal: " + canal);
        }else{
            System.out.println("Canal menor que 1, selecione um canal válido.");
        }
    }

}