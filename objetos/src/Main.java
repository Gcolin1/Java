/* import Notas.Aluno;

public class Main {
    public static void main(String[] args) {
        int quantidadeDeAlunos = 3;
        Aluno[] alunos = new Aluno[quantidadeDeAlunos];
        Leitor leitor = new Leitor();

        for(int i = 0; i < quantidadeDeAlunos; i++){
            Aluno aluno = new Aluno();

            aluno.nome = leitor.lerString("digite o nome do aluno: ");
            aluno.email = leitor.lerString("Digite o email do aluno: ");
            aluno.idade = leitor.lerInteiro("Digite a idade do aluno: ");

            alunos[i] = aluno;
        }

        for(Aluno aluno : alunos){
            System.out.printf("%s : %s : %d\n", aluno.nome, aluno.email, aluno.idade);
        }
    }
}

*/
