
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class exercicio_2 {

    public static void main(String[] args) {
        int[] idades = new int[5];
        String[] nomes = new String[5];
        Scanner reader = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Escolha um nome");
            nomes[i] = reader.nextLine();

            System.out.println("Qual a idade de " + nomes[i] + "?");
            idades[i] = Integer.parseInt(reader.nextLine());
        }

        String nomeTemp;
        int idadeTemp;

        for (int i = 0; i < nomes.length; i++) {
            for (int j = i + 1; j < idades.length; j++) {
                if (idades[i] < idades[j]) {
                    nomeTemp = nomes[i];
                    nomes[i] = nomes[j];
                    nomes[j] = nomeTemp;
                    idadeTemp = idades[i];
                    idades[i] = idades[j];
                    idades[j] = idadeTemp;
                }
            }
        }
        for (int i = 0; i < nomes.length;i++){
            System.out.println(nomes[i] + " tem " +  idades[i] + " anos!");
        }
    }
    // static class Pessoa {
    //     String nome;
    //     int idade;

    //     Pessoa(String nome, int idade) {
    //         this.nome = nome;
    //         this.idade = idade;
    //     }
    // }

    // public static void main(String[] args) {
    //     Scanner reader = new Scanner(System.in);
    //     Pessoa[] pessoas = new Pessoa[5];
    //     for (int i = 0; i < 5; i++) {
    //         System.out.println("Qual o nome dessa pessoa?");
    //         String nome = reader.nextLine();
    //         System.out.println("Qual a idade dessa pessoa?");
    //         int idade = reader.nextInt();
    //         reader.nextLine();

    //         pessoas[i] = new Pessoa(nome, idade);
    //     }
    //     Arrays.sort(pessoas, new Comparator<Pessoa>() {
    //         public int compare(Pessoa p1, Pessoa p2) {
    //             return p2.idade - p1.idade;
    //         }
    //     });
    //     System.out.println("Idade das pessoas em ordem decrescente:");
    //     for (int i = 0; i < 5; i++) {
    //         System.out.println(pessoas[i].nome + " tem a seguinte idade: " + pessoas[i].idade);
    //     }

    // }

}
