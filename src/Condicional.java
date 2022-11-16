public class Condicional {
    public static void main(String[] args){
        double valor = 989;
        String marca = "iphone";
        int memoria = 6;

        if(valor <= 1500 && marca.equals("iphone")){
            if(memoria >= 6){
                System.out.println("comprei");
            }else {
            System.out.println("memoria abaixo do esperado");
            }
        }else {
            System.out.println("não comprei");
        }
    }
}
