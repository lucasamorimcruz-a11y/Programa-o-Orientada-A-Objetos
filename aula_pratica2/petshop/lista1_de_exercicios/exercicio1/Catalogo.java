import java.util.Arrays;

public class Catalogo {
    private Filme[] filmes;
    private Serie[] series;
    private int tamanhoCatalogo;

    Catalogo() {
        this.filmes = null;
        this.series = null;
        this.tamanhoCatalogo = 0;
    }

    Catalogo(Filme[] filmes, Serie[] series, int tamanhoCatalogo) {
        this.filmes = filmes;
        this.series = series;
        this.tamanhoCatalogo = tamanhoCatalogo;
    }

    public Filme[] getFilmes() {
        return this.filmes;
    }

    public Serie[] getSeries() {
        return this.series;
    }

    public int getTamanhoCatalogo() {
        return this.tamanhoCatalogo;
    }

    public void setFilmes(Filme[] filmes) {
        this.filmes = filmes;
    }

    public void setSeries(Serie[] series) {
        this.series = series;
    }

    public void setTamanhoCatalogo(int tamanhoCatalogo) {
        this.tamanhoCatalogo = tamanhoCatalogo;
    }

    @Override
    public String toString() {
        return "Catalogo{" +
                "filmes=" + Arrays.toString(filmes) +
                ", series=" + Arrays.toString(series) +
                ", tamanhoCatalogo=" + tamanhoCatalogo +
                '}';
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Catalogo catalogo = (Catalogo) obj;

        return tamanhoCatalogo == catalogo.tamanhoCatalogo &&
                Arrays.equals(filmes, catalogo.filmes) &&
                Arrays.equals(series, catalogo.series);
    }
}
