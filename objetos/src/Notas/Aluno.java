package Notas;

public class Aluno {
    String nome;
    double[] notas = new double[4];

    double calcularMedia(){
        double soma = 0;

        for (double nota : notas){
            soma += nota;
        }

        return soma / notas.length;
    }
}
