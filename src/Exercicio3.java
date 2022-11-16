import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){
        Scanner scannerKm = new Scanner(System.in);
        System.out.println("digite a kilometragem");
        double kilometros = scannerKm.nextInt();
        double milhas;

        milhas = kilometros / 1.609;

        System.out.println("O resultado em milhas é: " + milhas);
    }
}
