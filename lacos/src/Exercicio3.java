import java.util.Random;

public class Exercicio3 {
    public static void main(String[] args){
        int num = 3;
        int soma = 0;

        for (int i = 0; i < num; i++){
            Random numSorteio = new Random();
            int numeroSorteado = numSorteio.nextInt(1, 7);
            System.out.println("o numero " + numeroSorteado + " foi sorteado");

            soma += numeroSorteado;
       }

        System.out.println("A soma dos numeros sorteados é " + soma);

    }
}
