import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String mensagemDeErro = "Deve-se informar 9 caracteres validos entre \"o\", \"x\" e \"_\".";
        String[] tabuleiro = new String[9];

        for (int c = 0; c < tabuleiro.length; c++){
            tabuleiro[c] = " ";
        }

        for (int i = 0; i <=  8; i++){
            System.out.printf("1 %s | %s | %s \n", tabuleiro[0], tabuleiro[1], tabuleiro[2]);
            System.out.printf("2 %s | %s | %s \n", tabuleiro[3], tabuleiro[4], tabuleiro[5]);
            System.out.printf("3 %s | %s | %s \n", tabuleiro[6], tabuleiro[7], tabuleiro[8]);

            String caractere = DigitarCaractere();

            if (!caractere.equals("x") && !caractere.equals("o")){
                System.out.println(mensagemDeErro);
                break;
            }else {
                System.out.println("Escolha a posição do tabuleiro que deseja jogar");
                String posicao = DigitarPosicao();

                if (posicao.equals("1 a")) {
                    tabuleiro[0] = caractere;
                } else if (posicao.equals("1 b")) {
                    tabuleiro[1] = caractere;
                } else if (posicao.equals("1 c")) {
                    tabuleiro[2] = caractere;
                } else if (posicao.equals("2 a")) {
                    tabuleiro[3] = caractere;
                } else if (posicao.equals("2 b")) {
                    tabuleiro[4] = caractere;
                } else if (posicao.equals("2 c")) {
                    tabuleiro[5] = caractere;
                } else if (posicao.equals("3 a")) {
                    tabuleiro[6] = caractere;
                } else if (posicao.equals("3 b")) {
                    tabuleiro[7] = caractere;
                } else if (posicao.equals("3 c")) {
                    tabuleiro[8] = caractere;
                }
            }
        }
    }
    static String DigitarCaractere(){
        Scanner scannerCaracter = new Scanner(System.in);
        System.out.println("Digite um caracter entre x e o");
        String caractere = scannerCaracter.nextLine();
        return caractere;
    }

    static  String DigitarPosicao(){
        Scanner scannerCPosicao = new Scanner(System.in);
        String posicao = scannerCPosicao.nextLine();
        return posicao;
    }
}

