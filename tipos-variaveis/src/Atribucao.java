
public class Atribucao {

    public static void main(String[] args) {

        /* Atribuição */
        int numero = 1;
        double numeroDivido = 1.2;

        /* Operadores */
        double soma = 10.5 + 2.1;
        int subtração = 10 - 2;
        int multiplicacao = 12 * 4;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (30 / 3);

        /* Com String, o Operador de Adição (+) causará a concatenação dos textos */
        String texto = "Olá" + " " + "Mundo!" + " " + (1 + 1 + 1);
        System.out.println(texto);


        /* Operadores Unários */
        int numeroTeste = 5;

        numeroTeste = -numeroTeste;
        System.out.println(numeroTeste);

        numeroTeste = +numeroTeste * -1;
        System.out.println(numeroTeste);

        /* Incremento de Número */
        System.out.println(numeroTeste++);
        System.out.println(numeroTeste);

        /* Incrementa antes de mostrar a informação no console */
        System.out.println(++numeroTeste);

        /* Decremento de Número */
        System.out.println(numeroTeste--);
        System.out.println(numeroTeste);

        /* Decremento antes de mostrar a informação no console */
        System.out.println(--numeroTeste);

        /* Booleano */

        boolean variavel = true;

        System.out.println(variavel);

        /* Mostra o valor inverso sem atribuir um novo valor a variavel */
        System.out.println(!variavel);



    }

}
