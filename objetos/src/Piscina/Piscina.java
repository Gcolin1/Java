package Piscina;

public class Piscina {
    double largura;
    double  altura;
    double comprimento;
    double capacidade;
    double profundidadeInicial;
    double profundidadeFinal;


    public double profundidadeMedia(double profundidadeInicial, double profundidadeFinal){
        double profundidadeMedia = (profundidadeInicial + profundidadeFinal) / 2;
        return CalcularCapacidade(profundidadeMedia);
    }

    public double CalcularCapacidade(double profundidadeMedia){
        capacidade = (largura * comprimento * profundidadeMedia) * 1000;
        return capacidade;
    };

}
