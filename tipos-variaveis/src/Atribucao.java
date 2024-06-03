
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

        /* Operadores Ternários */
        /* Condicional ? Verdadeiro : Falso */
        int a = 5;
        int b = 2;

        int resultadoTernario = a == b ? 2 : 1;
        System.out.println(resultadoTernario);

        /* Comparando Objetos */
        String nomeUm = "FELIPE";
        String nomeDois = new String("FELIPE");

        System.out.println(nomeUm.equals(nomeDois));

        /* Operadores Lógicos */
        
        boolean condicao1 = true;
        boolean condicao2 = false;

        /* E */
        String resultadoLogico = condicao1 == true && condicao2 == true ? "verdadeiro" : "falso";
        /* Ou */
        String resultadoLogico2 = condicao1 == true || condicao2 == true ? "verdadeiro" : "falso";
        
        System.out.println(resultadoLogico);
        System.out.println(resultadoLogico2);



    }

}
