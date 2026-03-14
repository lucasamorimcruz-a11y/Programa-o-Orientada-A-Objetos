
public class Filme {
    private double tamanhoDoFilme;
    private String nomeDoFilme;
    private String generoDoFilme;
    private int idadeIndicativaDoFilme;

    public Filme() {
        this.tamanhoDoFilme = 0;
        this.nomeDoFilme = "";
        this.generoDoFilme = "";
        this.idadeIndicativaDoFilme = 0;
    }

    public Filme(double tamanhoDoFilme, String nomeDoFilme, String generoDoFilme, int idadeIndicativaDoFilme) {
        this.tamanhoDoFilme = tamanhoDoFilme;
        this.nomeDoFilme = nomeDoFilme;
        this.generoDoFilme = generoDoFilme;
        this.idadeIndicativaDoFilme = idadeIndicativaDoFilme;
    }

    public double getTamanhoDoFilme() {
        return this.tamanhoDoFilme;
    }

    public String getNomeDoFilme() {
        return this.nomeDoFilme;
    }

    public String getGeneroDoFilme() {
        return this.generoDoFilme;
    }

    public int getIdadeIndicativaDoFilme() {
        return this.idadeIndicativaDoFilme;
    }

    public void setTamanhoDoFilme(double tamanhoDoFilme) {
        this.tamanhoDoFilme = tamanhoDoFilme;
    }

    public void setNomeDoFilme(String nomeDoFilme) {
        this.nomeDoFilme = nomeDoFilme;
    }

    public void setGeneroDoFilme(String generoDoFilme) {
        this.generoDoFilme = generoDoFilme;
    }

    public void setIdadeIndicativaDoFilme(int idadeIndicativaDoFilme) {
        this.idadeIndicativaDoFilme = idadeIndicativaDoFilme;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "nomeDoFilme='" + nomeDoFilme + '\'' +
                ", generoDoFilme='" + generoDoFilme + '\'' +
                ", tamanhoDoFilme=" + tamanhoDoFilme +
                ", idadeIndicativaDoFilme=" + idadeIndicativaDoFilme +
                '}';
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Filme filme = (Filme) obj;

        return Double.compare(filme.tamanhoDoFilme, tamanhoDoFilme) == 0 &&
                idadeIndicativaDoFilme == filme.idadeIndicativaDoFilme &&
                nomeDoFilme.equals(filme.nomeDoFilme) &&
                generoDoFilme.equals(filme.generoDoFilme);
    }
}
