package DD;

import java.util.Random;

public class Combate {
    Personagem colin = new Personagem("colin", 10, 4, 2);
    Personagem orc = new Personagem("orc", 8, 0, 0);

    Random dado = new Random();


    public void combate(){
        for (int i = 0; this.orc.HP > 0|| this.colin.HP > 0; i++){
            i++;
            System.out.println("Rodada " + i);
            int numeroSorteado = dado.nextInt(1, 21);

            if(numeroSorteado > this.orc.defesa){
                System.out.println("O ataque do " + this.colin.nome + " acertou e o dano foi de " + this.colin.dano);
                this.orc.HP = this.orc.HP - this.colin.dano;
                System.out.println("vida do " + this.orc.nome + " é " + this.orc.HP);
                if(this.orc.HP <= 0 || this.colin.HP <= 0){
                    System.out.println("Jogo finalizado");
                    break;
                }

            }else {
                System.out.println("O ataque foi " + this.colin.dano + " e errou");
            }

           if (numeroSorteado > this.colin.defesa){
               System.out.println("O ataque do " + this.orc.nome + " acertou e o dano foi de " + this.orc.dano);
               this.colin.HP -=  this.orc.dano;
               System.out.println("vida do " + this.colin.nome + " é " + this.colin.HP);

               if(this.orc.HP <= 0 || this.colin.HP <= 0){
                   System.out.println("Jogo finalizado");
                   break;
               }
           }else {
               System.out.println("O ataque foi " + this.orc.dano + " e errou");
           }
        }
    }
}


