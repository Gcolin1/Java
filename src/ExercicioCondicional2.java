public class ExercicioCondicional2 {
    public static void main(String[] args){
        int idade = 18;
        int parcelas = 12;
        double emprestimo = 10000;
        double salario = 3000;
        double percentual = salario * 0.3;
        double valorParcela = emprestimo / parcelas;


        if(idade < 18 || idade > 65) {
            System.out.println(
                    "A pessoa que está solicitando o empréstimo tem "
                        + idade + " anos de idade e tem o salário de " + salario + " reais.\n" +
                    "O valor solicitado é de " + emprestimo + " reais para ser pago em "
                        + parcelas +" parcelas\n" +
                    "O empréstimo foi reprovado.");
        } else if (parcelas < 3 || parcelas > 24) {
            System.out.println(
                    "A pessoa que está solicitando o empréstimo tem "
                        + idade + " anos de idade e tem o salário de " + salario + " reais.\n" +
                    "O valor solicitado é de " + emprestimo + " reais para ser pago em "
                        + parcelas +" parcelas\n" +
                    "O empréstimo foi reprovado.");
        } else if (valorParcela > percentual) {
            System.out.println(
                    "A pessoa que está solicitando o empréstimo tem "
                         + idade + " anos de idade e tem o salário de " + salario + " reais.\n" +
                    "O valor solicitado é de " + emprestimo + " reais para ser pago em "
                        + parcelas +" parcelas\n" +
                    "O empréstimo foi reprovado.");
        }else {
            System.out.println(
                "A pessoa que está solicitando o empréstimo tem "
                        + idade + " anos de idade e tem o salário de " + salario + " reais.\n" +
                "O valor solicitado é de " + emprestimo + " reais para ser pago em "
                        + parcelas +" parcelas\n" +
                "O empréstimo foi aprovado.");
        }
    }
}
