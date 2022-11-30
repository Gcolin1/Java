public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        double volume = calcularMultiplicacao(5, 5);
        double litros = converterLitros(volume);

        System.out.println(volume);
        System.out.println("Volume em litros " + litros);
    }

    static double calcularMultiplicacao(double n1, double n2){
        double resultado = n1 * n2;

        return resultado;
    }

    static double converterLitros(double volume){
       double litros = volume * 1000;
       return litros;
    }
}