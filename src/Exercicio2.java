public class Exercicio2 {
    public static  void main(String[] args){
        int fileiras = 10;
        int cadeiras = 8;
        int capacidade;
        double reservados;

        capacidade = fileiras * cadeiras;
        reservados = capacidade * 0.1;

        System.out.println("A capacidade dessa sala é de " + capacidade + ".\nSendo que " + reservados + " lugares são reservados para PCDs");

    }
}
