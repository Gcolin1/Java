package DD;

import java.util.Random;

public class Personagem {
     String nome;
     int HP;
     int defesa;
     int armadura;
     int arma;
     int dano;

    Random sorteador = new Random();

    public Personagem(String nome, int HP, int armadura, int arma){
        this.nome = nome;
        this.arma = arma;
        this.armadura = armadura;
        this.defesa = 10 + armadura;
        this.HP = HP;
        this.dano = sortearDado(1, 9) + this.arma;
    }

    public int sortearDado(int origin, int bound){
        int numeroSorteado = sorteador.nextInt(origin, bound);
        return numeroSorteado;
    }

}
