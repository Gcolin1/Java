import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){

        double num = digitarNumero();
        String letra = digitarLetra();

        if(letra.equals("c")){
            double celsius = converterCelcius(num);
            System.out.println("O valor convertido é " + celsius);
        } else if (letra.equals("f")) {
            double farenheit = converterFarenheit(num);
            System.out.println("O valor convertido é " + farenheit);
        }else {
            System.out.println("Valor invalido");
        }
    }

    static double digitarNumero(){
        Scanner scannerNum = new Scanner(System.in);
        System.out.println("digite os graus que deseja converter");
        double num = scannerNum.nextInt();
        return num;
    }

    static String digitarLetra(){
        Scanner scannerLetra = new Scanner(System.in);
        System.out.println("digite c para converter para celsius ou f para farenheit");
        String letra = scannerLetra.nextLine();
        return letra;
    }
    static double converterCelcius(double num){
        return (num - 32) / 1.8;
    }
    static double converterFarenheit(double num){
        return num * 1.8 + 32;
    }
}
