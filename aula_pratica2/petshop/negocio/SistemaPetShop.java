package udesc.poo.aula_pratica2.petshop.negocio;

import java.util.Scanner;

import udesc.poo.aula_pratica2.petshop.dados.Animal;
import udesc.poo.aula_pratica2.petshop.dados.Endereco;
import udesc.poo.aula_pratica2.petshop.dados.Veterinario;

public class SistemaPetShop {
    private Veterinario[] veterinarios = new Veterinario[50];
    private int quantidadeVeterinarios;

    public void cadastrarVeterinario() {
        if (quantidadeVeterinarios < 50) {
            Scanner reader = new Scanner(System.in);
            System.out.println("Qual o nome do novo veterinário?");
            String nome = reader.nextLine();
            System.out.println("E qual o salário dele?");
            double salario = reader.nextDouble();
            Veterinario veterinario = new Veterinario(nome, salario, null, null, quantidadeVeterinarios++);
            for (int i = 0; i < veterinarios.length; i++) {
                if (veterinarios[i].equals(null)) {
                    veterinarios[i] = veterinario;
                }
            }
        }

    }

    public void mostrarVeterinario() {
        int i = 0;
        while (veterinarios[i] != null) {
            System.out.println(veterinarios[i]);
            i++;
        }
    }

    public void cadastrarEnderecoVeterinario() {
        mostrarVeterinario();
        Scanner reader = new Scanner(System.in);
        System.out.println("Qual funcionário você quer cadastrar o endereço?");
        String veterinarioEscolhido = reader.nextLine();
        for (int i = 0; i < veterinarios.length; i++) {
            if (veterinarios[i].getNome().equals(veterinarioEscolhido)) {
                System.out.println("Digite a rua");
                String rua = reader.nextLine();
                System.out.println("Digite o bairo");
                String bairro = reader.nextLine();
                System.out.println("Digite a cidade");
                String cidade = reader.nextLine();
                System.out.println("Digite o estado");
                String estado = reader.nextLine();
                System.out.println("Digite o CEP");
                int CEP = reader.nextInt();
                Endereco enderecoVeterinario = new Endereco(rua, 0, bairro, cidade, estado, CEP);
                veterinarios[i].setEndereco(enderecoVeterinario);
            }
        }

    }

    public void cadastrarAnimais() {
        Scanner reader = new Scanner(System.in);
        mostrarVeterinario();
        System.out.println("Qual veterináro você quer cadastrar um novo animal?");
        String veterinarioEscolhido = reader.nextLine();
        for (int i = 0; i < veterinarios.length; i++) {
            if (veterinarios[i].getNome().equals(veterinarioEscolhido)) {
                System.out.println("Qual o nome do animal?");
                String nomeAnimal = reader.nextLine();
                System.out.println("Qual a espécie do animal?");
                String especieAnimal = reader.nextLine();
                System.out.println("Qual a descrição do animal?");
                String descricaoAnimal = reader.nextLine();
                Animal novoAnimal = new Animal(nomeAnimal, null, especieAnimal, descricaoAnimal);

            }
        }
    }

    public void mostrarAnimais() {

    }

    public void cadastrarDono() {

    }

    public void cadastrarEnderecoDono() {

    }

}
