public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        byte idade = 22;
        short ano = 2024;
        int cep = 22593100; // se começar com 0, precisa ser string/outro tipo de dado!
        long cpf = 23032943723L; // se começar com 0, precisa ser string/outro tipo de dado! 
        
        
        double salarioMinimo = 2500.33;
        float pi = 3.14F;
        
        //exemplo de short para int

        short numeroCurto = 1;
        int numeroNormal = numeroCurto; // aceita, pois int possui uma precisão maior que short utiliza
        short numeroCurto2 = (short) numeroNormal; // deve declarar a ciência que a precisão de short é menor que int

        // constantes

        final double VALOR_DE_PI = 3.14; // variavel não pode ter seu valor alterado por ter o denominador final
        String meuNome = "Felipe Brum"; // representação de textos
    
    }
}
