import java.util.Scanner;

public class Exercicio2 {
    public static  void main(String[] args){
        Scanner scannerFileiras = new Scanner(System.in);
        System.out.println("digite o numero de fileiras");
        int fileiras = scannerFileiras.nextInt();

        Scanner scannerCadeiras = new Scanner(System.in);
        System.out.println("digite o numero de cadeiras");
        int cadeiras = scannerCadeiras.nextInt();

        int capacidade;
        double reservados;

        capacidade = fileiras * cadeiras;
        reservados = capacidade * 0.1;

        System.out.println("A capacidade dessa sala é de " + capacidade + ".\nSendo que " + reservados + " lugares são reservados para PCDs");

    }
}
