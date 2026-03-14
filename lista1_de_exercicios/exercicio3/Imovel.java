
public class Imovel {
    private double largura;
    private double comprimento;
    private double preco;

    public Imovel(double largura, double comprimento, double preco) {
        this.largura = largura;
        this.comprimento = comprimento;
        this.preco = preco;
    }

    public double areaDoImovel() {
        return this.largura * this.comprimento;
    }

    public double getPreco() {
        return this.preco;
    }

    @Override
    public String toString() {
        return "A largura é " + this.largura + ", tendo como comprimento" + this.comprimento + "e o valor é de R$ "
                + this.preco;
    }

}
