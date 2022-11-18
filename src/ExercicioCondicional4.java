import java.util.Scanner;

public class ExercicioCondicional4 {
    public static void main(String[] args){
        Scanner scannerNum = new Scanner(System.in);
        System.out.println("digite os graus que deseja converter");
        double num = scannerNum.nextInt();

        Scanner scannerLetra = new Scanner(System.in);
        System.out.println("digite c para converter para celsius ou f para farenheit");
        String letra = scannerLetra.nextLine();

        if(letra.equals("c")){
            double celsius = (num - 32) / 1.8;
            System.out.println("O valor convertido é " + celsius);
        } else if (letra.equals("f")) {
            double farenheit = num * 1.8 + 32;
            System.out.println("O valor convertido é " + farenheit);
        }else {
            System.out.println("Valor invalido");
        }
    }
}
