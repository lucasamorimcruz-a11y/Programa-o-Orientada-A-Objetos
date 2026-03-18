
public class Assinatura {
    private String nomeDaAssinatura;
    private double precoDaAssinatura;
    private int validadeDaAssinatura;

    public Assinatura() {
        this.nomeDaAssinatura = "";
        this.precoDaAssinatura = 0;
        this.validadeDaAssinatura = 0;
    }

    public Assinatura(String nomeDaAssinatura, double precoDaAssinatura, int validadeDaAssinatura) {
        this.nomeDaAssinatura = nomeDaAssinatura;
        this.precoDaAssinatura = precoDaAssinatura;
        this.validadeDaAssinatura = validadeDaAssinatura;
    }

    public String getNomeDaAssinatura() {
        return this.nomeDaAssinatura;
    }

    public double getPrecoDaAssinatura() {
        return this.precoDaAssinatura;
    }

    public int getValidadeDaAssinatura() {
        return this.validadeDaAssinatura;
    }

    public void setNomeDaAssinatura(String nomeDaAssinatura) {
        this.nomeDaAssinatura = nomeDaAssinatura;
    }

    public void setPrecoDaAssinatura(double precoDaAssinatura) {
        this.precoDaAssinatura = precoDaAssinatura;
    }

    public void setValidadeDaAssinatura(int validadeDaAssinatura) {
        this.validadeDaAssinatura = validadeDaAssinatura;
    }

    @Override
    public String toString() {
        return "Assinatura{" +
                "nomeDaAssinatura='" + nomeDaAssinatura + '\'' +
                ", precoDaAssinatura=" + precoDaAssinatura +
                ", validadeDaAssinatura=" + validadeDaAssinatura +
                '}';
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Assinatura assinatura = (Assinatura) obj;

        return Double.compare(assinatura.precoDaAssinatura, precoDaAssinatura) == 0 &&
                validadeDaAssinatura == assinatura.validadeDaAssinatura &&
                nomeDaAssinatura.equals(assinatura.nomeDaAssinatura);
    }
}
