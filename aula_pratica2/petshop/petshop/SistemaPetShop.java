package udesc.poo.aula_pratica2.petshop.petshop;

import java.util.Scanner;

public class SistemaPetShop {
    private Veterinario[] veterinarios = new Veterinario[50];
    private int quantidadeVeterinarios;

    public void executar() {
        Scanner reader = new Scanner(System.in);
        int opcao;
        do {
            printMenu();
            opcao = reader.nextInt();
            reader.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarVeterinario();
                    break;
                case 2:
                    mostrarVeterinario();
                    break;
                case 3:
                    cadastrarEnderecoVeterinario();
                    break;
                case 4:
                    cadastrarAnimais();
                    break;
                case 5:
                    mostrarAnimais();
                    break;
                case 6:
                    cadastrarDono();
                    break;
            }
        } while (opcao != 0);
    }

    public void printMenu() {
        System.out.println("Escolha uma das opções a seguir:");
        System.out.println("0 - Encerrar o programa");
        System.out.println("1 - Cadastrar um veterinário");
        System.out.println("2 - Mostrar veterinários cadastrados");
        System.out.println("3 - Cadastrar endereço de um veterinário");
        System.out.println("4 - Cadastrar animal");
        System.out.println("5 - Mostrar os animais");
        System.out.println("6 - Cadastrar novo dono");

    }

    public void cadastrarVeterinario() {
        if (quantidadeVeterinarios < 50) {
            Scanner reader = new Scanner(System.in);
            System.out.println("Qual o nome do novo veterinário?");
            String nome = reader.nextLine();
            System.out.println("E qual o salário dele?");
            double salario = reader.nextDouble();
            Veterinario veterinario = new Veterinario(nome, salario, null, null, 0);
            veterinarios[quantidadeVeterinarios] = veterinario;
            quantidadeVeterinarios++;
        }

    }

    public void mostrarVeterinario() {
        for (int i = 0; i < quantidadeVeterinarios; i++) {
            System.out.println(i + " - " + veterinarios[i].getNome());
        }
    }

    public void cadastrarEnderecoVeterinario() {
        Scanner reader = new Scanner(System.in);

        mostrarVeterinario();

        System.out.println("Digite o índice do veterinário:");
        int index = reader.nextInt();
        reader.nextLine();
        System.out.println("Digite o índice do veterinário:");
        System.out.println("Digite a rua:");
        String rua = reader.nextLine();
        System.out.println("Digite o número:");
        int numero = reader.nextInt();
        reader.nextLine();
        System.out.println("Digite o bairro:");
        String bairro = reader.nextLine();
        System.out.println("Digite a cidade:");
        String cidade = reader.nextLine();
        System.out.println("Digite o estado:");
        String estado = reader.nextLine();
        System.out.println("Digite o CEP:");
        int cep = reader.nextInt();
        Endereco endereco = new Endereco(rua, numero, bairro, cidade, estado, cep);
        veterinarios[index].setEndereco(endereco);
    }

    public void cadastrarAnimais() {
        Scanner reader = new Scanner(System.in);
        mostrarVeterinario();
        System.out.println("Digite o índice do veterinário:");
        int index = reader.nextInt();
        reader.nextLine();
        System.out.println("Nome do animal:");
        String nome = reader.nextLine();
        System.out.println("Espécie:");
        String especie = reader.nextLine();
        System.out.println("Descrição:");
        String descricao = reader.nextLine();
        Animal animal = new Animal(nome, null, especie, descricao);
        Veterinario veterinario = veterinarios[index];
        veterinario.getAnimal()[veterinario.getQuantidadeAnimais()] = animal;
        veterinario.setQuantidadeAnimais(veterinario.getQuantidadeAnimais() + 1);
    }

    public void mostrarAnimais() {
        Scanner reader = new Scanner(System.in);
        mostrarVeterinario();
        System.out.println("Qual o índice do eterinário?");
        int index = reader.nextInt();
        Veterinario veterinario = veterinarios[index];
        for (int i = 0; i < veterinario.getQuantidadeAnimais(); i++) {
            System.out.println(i + " - " + veterinario.getAnimal()[i].getNome());
        }
    }

    public void cadastrarDono() {
        Scanner reader = new Scanner(System.in);
        mostrarVeterinario();
        System.out.println("Qual o índice do veterinário?");
        int index = reader.nextInt();
        Veterinario veterinario = veterinarios[index];
        for (int i = 0; i < veterinario.getQuantidadeAnimais(); i++) {
            System.out.println(i + " - " + veterinario.getAnimal()[i].getNome());
        }
        System.out.println("Qual animal você quer?");
        int animalIndex = Integer.parseInt(reader.nextLine());
        System.out.println("Qual o nome do dono?");
        String nomeDono = reader.nextLine();
        System.out.println("Qual o CPF do dono?");
        int CPF = Integer.parseInt(reader.nextLine());
        Dono dono = new Dono(nomeDono, null, CPF);
        veterinario.getAnimal()[animalIndex].setDono(dono);

    }

    public void cadastrarEnderecoDono() {
        Scanner reader = new Scanner(System.in);

        mostrarVeterinario();

        System.out.println("Escolha o veterinário:");
        int index = reader.nextInt();

        Veterinario veterinario = veterinarios[index];

        // Mostrar animais
        for (int i = 0; i < veterinario.getQuantidadeAnimais(); i++) {
            System.out.println(i + " - " + veterinario.getAnimal()[i].getNome());
        }

        System.out.println("Escolha o animal:");
        int animalIndex = reader.nextInt();
        reader.nextLine();

        Animal animal = veterinario.getAnimal()[animalIndex];
        if (animal.getDono() == null) {
            System.out.println("Esse animal ainda não possui dono cadastrado!");
            return;
        }
        System.out.println("Dono: " + animal.getDono().getNome());
        System.out.println("CPF: " + animal.getDono().getCPF());
        System.out.println("Digite a rua:");
        String rua = reader.nextLine();
        System.out.println("Digite o número:");
        int numero = reader.nextInt();
        reader.nextLine();
        System.out.println("Digite o bairro:");
        String bairro = reader.nextLine();
        System.out.println("Digite a cidade:");
        String cidade = reader.nextLine();
        System.out.println("Digite o estado:");
        String estado = reader.nextLine();
        System.out.println("Digite o CEP:");
        int cep = reader.nextInt();
        Endereco endereco = new Endereco(rua, numero, bairro, cidade, estado, cep);
        animal.getDono().setEndereco(endereco);

        System.out.println("Endereço cadastrado com sucesso!");
    }

}
