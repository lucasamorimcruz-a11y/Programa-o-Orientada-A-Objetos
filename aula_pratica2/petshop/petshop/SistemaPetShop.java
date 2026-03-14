package udesc.poo.aula_pratica2.petshop.petshop;

import java.util.Scanner;

public class SistemaPetShop {
    private Veterinario[] veterinarios = new Veterinario[50];
    private int quantidadeVeterinarios;

    public void main(String[] args) {
        boolean option = true;
        while (option){
            printMenu();
        }
    }

    public void printMenu(){
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
        Scanner reader = new Scanner (System.in);
        mostrarVeterinario();
        System.out.println("Qual veterinário você quer ver os animais que ele cuida?");
        String veterinarioEscolhido = reader.nextLine();
        for (int i = 0; i < veterinarios.length; i++){
            if (veterinarios[i].getNome().equals(veterinarioEscolhido)){
                int count = 0;
                for (Animal animal : veterinarios[i].getAnimal()){
                    ++count;
                    System.out.println(count + " - " + animal.toString());
                }
            }
        }
    }

    public void cadastrarDono() {
        Scanner reader = new Scanner (System.in);
        for (Veterinario vet : veterinarios){
            System.out.println(vet.getAnimal());
        }
        System.out.println("Qual você deseja registar o dono?");
        String animalEscolhido = reader.nextLine();
        for (Veterinario vet : veterinarios){
            if (vet.getAnimal().equals(animalEscolhido)){
                Animal newAnimal = vet.getAnimal();
            }
        }

    }

    public void cadastrarEnderecoDono() {
    }

}
