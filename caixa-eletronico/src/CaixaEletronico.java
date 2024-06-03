public class CaixaEletronico {

    public static void main(String[] args) {
        double saldo = 30.0;
        double valorSolicitado = 14.0;

        if(saldo >= valorSolicitado){
            saldo = saldo - valorSolicitado;
            System.out.println("Valor deduzido! Agora seu saldo é " + saldo);
        }else{
            System.out.println("Saldo insuficiente! Seu saldo é " + saldo);
        }


    }
    
}
