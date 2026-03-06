package udesc.poo.aula_pratica2.petshop.dados;

public class Dono {
    private String nome;
    private Endereco endereco;
    private int CPF;

    Dono(String nome, Endereco endereco, int CPF) {
        this.nome = nome;
        this.endereco = endereco;
        this.CPF = CPF;
    }

    public String getNome() {
        return this.nome;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public int getCPF() {
        return this.CPF;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }
}
