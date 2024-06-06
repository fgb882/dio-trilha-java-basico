public class ExemploFor {

    public static void main(String[] args) {
        
        for ( int carneirinhos = 1; carneirinhos <= 20; carneirinhos++){
            System.out.println(carneirinhos);
        }

        String alunos[] = {"FELIPE", "MATHEUS", "JULIA", "CARLA"};

        for (int x=0; x<alunos.length; x++){
            System.out.println("Aluno no indice x=" + x + " é " + alunos[x]);
        }

        for (String aluno : alunos){
            System.out.println("Aluno " + aluno);
        }

        for(int x=1;x<=10;x++){
            if(x % 2==0) //% operador que representa módulo de uma divisão
                System.out.println(x);
        }



    }

    
}
