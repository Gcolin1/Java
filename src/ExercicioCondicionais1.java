import java.util.Scanner;

public class ExercicioCondicionais1 {
    public static void main(String[] args) {
        int media;

        Scanner sNota1 = new Scanner(System.in);
        System.out.println("Digite a primeira nota");
        int nota1 = sNota1.nextInt();

        Scanner sNota2 = new Scanner(System.in);
        System.out.println("Digite a segunda nota");
        int nota2 = sNota2.nextInt();

        Scanner sNota3 = new Scanner(System.in);
        System.out.println("Digite a terceira nota");
        int nota3 = sNota3.nextInt();

        Scanner sNota4 = new Scanner(System.in);
        System.out.println("Digite a quarta nota");
        int nota4 = sNota4.nextInt();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Sua media é " + media);

        if(media >= 5){
            System.out.println("Aluno aprovado!");
        } else if (media < 5) {
            System.out.println("Aluno reprovado!");
        }
    }
}
