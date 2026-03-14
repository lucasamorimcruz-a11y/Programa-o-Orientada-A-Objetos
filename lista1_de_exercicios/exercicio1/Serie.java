
public class Serie {
    private String nomeDaSerie;
    private String generoDaSerie;
    private int quantidadeEpisodiosDaSerie;
    private int quantidadeDeTemporadas;

    public Serie() {
        this.nomeDaSerie = "";
        this.generoDaSerie = "";
        this.quantidadeEpisodiosDaSerie = 0;
        this.quantidadeDeTemporadas = 0;
    }

    public Serie(String nomeDaSerie, String generoDaSerie, int quantidadeEpisodiosDaSerie, int quantidadeDeTemporadas) {
        this.nomeDaSerie = nomeDaSerie;
        this.generoDaSerie = generoDaSerie;
        this.quantidadeEpisodiosDaSerie = quantidadeEpisodiosDaSerie;
        this.quantidadeDeTemporadas = quantidadeDeTemporadas;
    }

    public String getNomeDaSerie() {
        return this.nomeDaSerie;
    }

    public String getGeneroDaSerie() {
        return this.generoDaSerie;
    }

    public int getQuantidadeEpisodiosDaSerie() {
        return this.quantidadeEpisodiosDaSerie;
    }

    public int getQuantidadeDeTemporadas() {
        return this.quantidadeDeTemporadas;
    }

    public void setNomeDaSerie(String nomeDaSerie) {
        this.nomeDaSerie = nomeDaSerie;
    }

    public void setGeneroDaSerie(String generoDaSerie) {
        this.generoDaSerie = generoDaSerie;
    }

    public void setQuantidadeEpisodiosDaSerie(int quantidadeEpisodiosDaSerie) {
        this.quantidadeEpisodiosDaSerie = quantidadeEpisodiosDaSerie;
    }

    public void setQuantidadeDeTemporadas(int quantidadeDeTemporadas) {
        this.quantidadeDeTemporadas = quantidadeDeTemporadas;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "nomeDaSerie='" + nomeDaSerie + '\'' +
                ", generoDaSerie='" + generoDaSerie + '\'' +
                ", quantidadeEpisodiosDaSerie=" + quantidadeEpisodiosDaSerie +
                ", quantidadeDeTemporadas=" + quantidadeDeTemporadas +
                '}';
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Serie serie = (Serie) obj;

        return quantidadeEpisodiosDaSerie == serie.quantidadeEpisodiosDaSerie &&
                quantidadeDeTemporadas == serie.quantidadeDeTemporadas &&
                nomeDaSerie.equals(serie.nomeDaSerie) &&
                generoDaSerie.equals(serie.generoDaSerie);
    }
}
