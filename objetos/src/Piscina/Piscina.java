package Piscina;

public class Piscina {
    double largura;
    double comprimento;
    double profundidade;


    public double calcularVolume(){
        double volume = (largura * comprimento * profundidade);
        return volume;
    }
}
