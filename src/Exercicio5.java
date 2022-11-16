import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args){
        double farenheit;
        Scanner scannerCelsius = new Scanner(System.in);
        System.out.println("digite os graus em celsius que deseja converter");
        double celsius = scannerCelsius.nextInt();

        farenheit = celsius * 1.8 + 32;
        System.out.println("O valor convertido é " + farenheit);
    }
}
