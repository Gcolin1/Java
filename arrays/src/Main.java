public class Main {
    public static void main(String[] args) {
        double[] notas = new double[args.length];

        double soma = 0;

        for(int i = 0; i < args.length; i++){
           notas[i] = Double.parseDouble(args[i]);
        }

        for (double nota : notas){
            soma = soma + nota;
        }

        double media = soma / notas.length;
        System.out.println(media);
    }
}