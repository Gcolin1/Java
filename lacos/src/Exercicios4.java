import java.util.Random;

public class Exercicios4 {
    public static void main(String[] args){
        int num = Integer.parseInt(args[0]);
        int numeroSorteado = 0;
        int quantidadeDeNumeros = 0;

        while(numeroSorteado != num){
            Random numSorteio = new Random();
            numeroSorteado = numSorteio.nextInt(1, 7);
            System.out.println("o numero " + numeroSorteado + " foi sorteado");
            quantidadeDeNumeros++;
        }

        System.out.println("foram necessarios " + quantidadeDeNumeros + " sorteios para que o numero " + numeroSorteado + " fosse sorteado");





    }
}
