public class Exercicio4 {
    public static void main(String[] args){
        double dolar, euro, libra, rublo, iene;
        double real = 10;

       dolar = real / 5.16;
       euro = real / 5.18;
       libra = real / 5.87;
       rublo = real / 0.084;
       iene = real / 0.035;

        System.out.println("o valor recebido é de: " + real + " reais\n isso equivale a: ");
        System.out.println(dolar + " Dólares");
        System.out.println(euro + " Euros");
        System.out.println(libra + " Libras");
        System.out.println(rublo + " Rublos");
        System.out.println(iene + " Ienes");


    }
}
