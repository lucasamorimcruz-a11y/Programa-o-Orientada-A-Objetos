public class Usuario {
    private String nome;
    private int idade;
    private String dataDeNascimento;
    private static int cont = 0;
    private int id;

    public Usuario() {
        this.nome = "";
        this.idade = 0;
        this.dataDeNascimento = "";
        cont++;
        this.id = cont;
    }

    public Usuario(String nome, int idade, String dataDeNascimento, int id) {
        this.nome = nome;
        this.idade = idade;
        this.dataDeNascimento = dataDeNascimento;
        cont++;
        this.id = cont;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public String getDataDeNascimento() {
        return this.dataDeNascimento;
    }

    public int getId() {
        return this.id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dataDeNascimento='" + dataDeNascimento + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Usuario usuario = (Usuario) obj;

        return idade == usuario.idade &&
                id == usuario.id &&
                nome.equals(usuario.nome) &&
                dataDeNascimento.equals(usuario.dataDeNascimento);
    }

}
