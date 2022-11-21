import java.net.Inet4Address;

public class Exercicio1 {
    public static void main(String[] args){
        int[] numeros = new int[args.length];

        int maiorNumero = Integer.parseInt(args[0]);
        int menorNumero = Integer.parseInt(args[0]);

        for(int i = 0; i < args.length ; i++){
            //pegando numeros dos argumentos
            numeros[i] = Integer.parseInt(args[i]);
            int numeroAtual = numeros[i];

            //verificando qual numero é maior
            if(numeroAtual > i){
                maiorNumero = numeroAtual;
            } else if (numeroAtual < i) {
                menorNumero = numeroAtual;
            }
        }

        System.out.println("o numero maior é: " + maiorNumero + " e o numero menor é: " + menorNumero);
    }
}
