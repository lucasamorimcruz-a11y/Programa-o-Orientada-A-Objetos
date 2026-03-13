package udesc.poo.aula_pratica2.petshop.dados;

public class Animal {
    private String nome;
    private Dono dono;
    private String especie;
    private String descricao;
    private int quantidadeAnimais;

    public Animal(String nome, Dono dono, String especie, String descricao) {
        this.nome = nome;
        this.dono = dono;
        this.especie = especie;
        this.descricao = descricao;
        this.quantidadeAnimais = quantidadeAnimais++;
    }

    public String getNome() {
        return this.nome;
    }

    public Dono getDono() {
        return this.dono;
    }

    public String getEspecie() {
        return this.especie;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
