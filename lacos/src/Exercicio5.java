import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();


        System.out.print("Digite uma letra: ");
        char letra = scanner.next().charAt(0);

        int ocorrencias = 0;

        for(int i = 0; i < palavra.length(); i++){
            if(palavra.charAt(i) == letra){
                ocorrencias++;
            }
        }

        System.out.println("Existem " + ocorrencias + " da letra " + letra + " na palavra " + palavra);

    }
}
