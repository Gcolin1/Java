import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args){
        Scanner scannerLargura = new Scanner(System.in);
        System.out.println("Digite a largura");
        double largura = scannerLargura.nextInt();

        Scanner scannerComprimento = new Scanner(System.in);
        System.out.println("Digite o comprimento");
        double comprimento = scannerComprimento.nextInt();

        Scanner scannerProfundidade = new Scanner(System.in);
        System.out.println("Digite a profundidade");
        double profundidade = scannerProfundidade.nextInt();
        double capacidade;

        capacidade = (largura * comprimento * profundidade) * 1000;

        System.out.println("Essa piscina comporta " + capacidade + " litros de água");

    }
}
