package Baralho;

public class Carta {
    private String naipe;
    private String rank;

    public Carta(String naipe, String rank){
        this.naipe = naipe;
        this.rank = rank;
    }

    public String toString() {
        return String.format("%s de %s", naipe, rank);
    }
}
