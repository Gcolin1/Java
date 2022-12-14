package Notas;

public class Main {
    public static void main(String[] args){
        int quantidadeDeAlunos = 3;
        Aluno[] alunos = new Aluno[quantidadeDeAlunos];
        Leitor leitor = new Leitor();

        for (int i = 0; i< quantidadeDeAlunos; i++){
            Aluno aluno = new Aluno();
            aluno.nome = leitor.lerString("digite o nome do aluno: ");
            aluno.notas[0] = leitor.lerDecimal("digite a primeira nota do aluno: ");
            aluno.notas[1] = leitor.lerDecimal("digite a segunda nota do aluno: ");
            aluno.notas[2] = leitor.lerDecimal("digite a terceira nota do aluno: ");
            aluno.notas[3] = leitor.lerDecimal("digite a quarta nota do aluno: ");
            alunos[i] = aluno;
        }

        for(Aluno aluno : alunos){
            System.out.printf(" %s teve a media %f", aluno.nome, aluno.calcularMedia());
        }
    }
}
