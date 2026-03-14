
public class Main {
    public static void main(String[] args) {

        Imobiliaria imobiliaria = new Imobiliaria();

        Imovel i1 = new Imovel(10, 20, 300000);
        Imovel i2 = new Imovel(8, 15, 200000);
        Imovel i3 = new Imovel(12, 25, 500000);
        Imovel i4 = new Imovel(5, 10, 100000);

        imobiliaria.adicionarImovel(i1);
        imobiliaria.adicionarImovel(i2);
        imobiliaria.adicionarImovel(i3);
        imobiliaria.adicionarImovel(i4);

        Imovel[] filtrados = imobiliaria.filtrarPorArea(150);

        System.out.println("Imóveis com área maior que 150m² ordenados por preço:\n");

        for (Imovel imovel : filtrados) {
            System.out.println(imovel);
        }
    }
}
