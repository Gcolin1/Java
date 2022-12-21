package Heranca;

public class Pessoa {
    String nome;
    String cpf;
    int dataNasc;
    int idade;

    void seApresente(){
        System.out.println("Meu nome é: " + nome);
        System.out.println("Tenho: " + idade + " anos");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(int dataNasc) {
        this.dataNasc = dataNasc;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
