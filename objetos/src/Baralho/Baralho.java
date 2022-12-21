package Baralho;

import java.util.Random;

public class Baralho {
    private final String[] naipes = {"Ouros", "Paus", "Copas", "Espadas"};
    private final String[] ranks = {"Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Reis"};
    private final int quantidadeCartas = 52;
    private  Carta[] cartas = new Carta[quantidadeCartas];
    private Random sorteador = new Random();

    public Baralho(){
        int i = 0;

        for(String rank : ranks){
            for(String naipe : naipes){
                Carta carta = new Carta(rank, naipe);
                cartas[i] = carta;
                i++;
            }
        }
    }

    public Carta sortear(){
        int numero = sorteador.nextInt(0, quantidadeCartas);
        return cartas[numero];
    }

    @Override
    public String toString() {
        String string = "";

        for (Carta carta : cartas){
            string += carta + "\n" ;
        };

        return string;
    }
}
