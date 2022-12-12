import java.util.Scanner;

public class Leitor {
    Scanner scanner = new Scanner(System.in);

    String lerString(String mensagem){
        System.out.println(mensagem);
        return scanner.nextLine();
    }

    int lerInteiro(String mensagem){
        System.out.println(mensagem);
        String idadeString = scanner.next();
        return Integer.parseInt(idadeString);
    }
}
