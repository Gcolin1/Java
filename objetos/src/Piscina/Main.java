package Piscina;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Piscina piscina = new Piscina();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a largura");
        piscina.largura = scanner.nextDouble();

        System.out.println("Digite o comprimento");
        piscina.comprimento = scanner.nextDouble();

        System.out.println("Digite a profundidade inicial");
        piscina.profundidadeInicial = scanner.nextDouble();

        System.out.println("Digite a profundidade final");
        piscina.profundidadeFinal = scanner.nextDouble();

        piscina.profundidadeMedia(piscina.profundidadeInicial, piscina.profundidadeFinal);

        System.out.println("Essa piscina comporta " + piscina.capacidade + " litros de água");

    }
}
