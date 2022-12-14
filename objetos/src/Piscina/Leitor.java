package Piscina;
import java.util.Scanner;
public class Leitor {
    Scanner scanner = new Scanner(System.in);

    double lerDecimal(String mensagem){
        System.out.println(mensagem);
        String numString = scanner.next();
        return Double.parseDouble(numString);
    }
}
