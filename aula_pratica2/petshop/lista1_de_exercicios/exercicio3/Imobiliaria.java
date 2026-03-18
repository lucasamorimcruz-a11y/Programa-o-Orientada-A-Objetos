
import java.util.ArrayList;

public class Imobiliaria {

    private String nome;
    private ArrayList<Imovel> imoveis;

    public Imobiliaria() {
        this.nome = "";
        this.imoveis = new ArrayList<>();
    }

    public void adicionarImovel(Imovel imovelASerAdicionado) {
        imoveis.add(imovelASerAdicionado);
    }

    public Imovel[] filtrarPorArea(double x) {
        int contador = 0;
        for (int i = 0; i < imoveis.size(); i++) {
            if (imoveis.get(i).areaDoImovel() >= x) {
                contador++;
            }
        }
        int index = 0;
        Imovel[] arrayImoveis = new Imovel[contador];
        for (int i = 0; i < imoveis.size(); i++) {
            if (imoveis.get(i).areaDoImovel() >= x) {
                arrayImoveis[index] = imoveis.get(i);
                index++;
            }
        }
        quickSort(arrayImoveis, 0, arrayImoveis.length - 1);
        return arrayImoveis;
    }

    public void quickSort(Imovel[] array, int menor, int maior) {
        if (menor < maior) {
            int res = partition(array, menor, maior);

            quickSort(array, menor, res - 1);
            quickSort(array, res + 1, maior);
        }
    }

    public int partition(Imovel[] array, int menor, int maior) {
        double foco = array[maior].getPreco();
        int i = menor - 1;
        for (int j = menor; j < maior; j++) {
            if (array[j].getPreco() <= foco) {
                i++;
                Imovel temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        Imovel temp = array[i + 1];
        array[i + 1] = array[maior];
        array[maior] = temp;

        return i + 1;
    }

    public String toString() {
        return "O nome da imobiliaria é " + this.nome + " e todos os imóveis disponíveis são: " + this.imoveis;
    }
}
