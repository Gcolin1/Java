import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        int anoAtual = 2022;
        int idade;

        Scanner anoDeNasc = new Scanner(System.in);
        System.out.println("digite seu ano de nascimento");
        int anoNasc = anoDeNasc.nextInt();
        idade = anoAtual - anoNasc;

        System.out.println("a idade dessa pessoa é: " + idade);
    }
}
