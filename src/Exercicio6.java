import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args){
        Scanner scannerLargura = new Scanner(System.in);
        System.out.println("Digite a largura");
        double largura = scannerLargura.nextDouble();

        Scanner scannerComprimento = new Scanner(System.in);
        System.out.println("Digite o comprimento");
        double comprimento = scannerComprimento.nextDouble();

        Scanner scannerProfundidadeInicial = new Scanner(System.in);
        System.out.println("Digite a profundidade inicial");
        double profundidadeInicial = scannerProfundidadeInicial.nextDouble();

        Scanner scannerProfundidadeFinal = new Scanner(System.in);
        System.out.println("Digite a profundidade final");
        double profundidadeFinal = scannerProfundidadeFinal.nextDouble();

        double capacidade;
        double profundidadeMedia;

        profundidadeMedia = (profundidadeInicial + profundidadeFinal) / 2;

        capacidade = (largura * comprimento * profundidadeMedia) * 1000;

        System.out.println("Essa piscina comporta " + capacidade + " litros de água");

    }
}
