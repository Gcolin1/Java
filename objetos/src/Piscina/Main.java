package Piscina;

public class Main {
    public static void main(String[] args){
        Piscina piscina = new Piscina();
        Leitor leitor = new Leitor();

        piscina.largura = leitor.lerDecimal("digite a largura da piscina");
        piscina.comprimento = leitor.lerDecimal("digite a largura da comprimento");
        piscina.profundidade = leitor.lerDecimal("digite a largura da profundidade");

        System.out.printf("O volume da piscina é %f m³ .", piscina.calcularVolume());
    }
}
