import java.util.Scanner;
import java.util.Random;

public class ExercicioCondicional5 {
    public static void main(String[] args){
        Scanner scannerNum = new Scanner(System.in);
        System.out.println("aposte em um numero de 1 a 6");
        int num = scannerNum.nextInt();

        Random sorteio = new Random();
        int numeroSorteado = sorteio.nextInt(6);

        if (num == numeroSorteado){
            System.out.println(num);
            System.out.println("Parabens o numero " + num + " Foi sorteado");
        }else {
            System.out.println(num);
            System.out.println("O numero sorteado foi " + numeroSorteado + " tente novamente");
        }


    }
}
