public class Exercicios4 {
    public static void main(String[] args){
        String produto1 = "Coca cola";
        double preco1 = 7;

        String produto2 = "bolacha";
        double preco2 = 9;

        String produto3 = "agua";
        double preco3 = 10;

        System.out.println("Foi informado o produto " + produto1 + " que custa R$" + preco1);
        System.out.println("Foi informado o produto " + produto2 + " que custa R$" + preco2);
        System.out.println("Foi informado o produto " + produto3 + " que custa R$" + preco3);

        if (preco1 > preco2 && preco1 > preco3){
            System.out.println(produto1 + " mais caro");
        } else if (preco2 > preco1 && preco2 > preco3) {
            System.out.println(produto2 + " mais caro");
        }else{
            System.out.println(produto3 + " mais caro");
        }
    }
}
