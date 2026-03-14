package udesc.poo.aula_pratica2.petshop.petshop;

public class Veterinario {
    private String nome;
    private double salario;
    private Endereco endereco;
    private Animal[] animais;
    private int quantidadeAnimais;

    public Veterinario(String nome, double salario, Endereco endereco, Animal[] animais, int quantidadeAnimais) {
        this.nome = nome;
        this.salario = salario;
        this.endereco = endereco;
        this.animais = animais;
        this.quantidadeAnimais = quantidadeAnimais;
    }

    public String getNome() {
        return this.nome;
    }

    public double getSalario() {
        return this.salario;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public Animal[] getAnimal() {
        return this.animais;
    }

    public int getQuantidadeAnimais() {
        return this.quantidadeAnimais;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setAnimais(Animal[] animais) {
        this.animais = animais;
    }

    public void setQuantidadeAnimais(int quantidadeAnimais) {
        this.quantidadeAnimais = quantidadeAnimais;
    }

}
