import java.util.ArrayList;
import java.util.Scanner;

class Cliente {
    int id;
    String nome;
    int idade;
    String telefone;

    public Cliente(int id, String nome, int idade, String telefone) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", Idade: " + idade + ", Telefone: " + telefone;
    }
}

public class Exercicio01 {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Digite o ID do cliente (negativo para sair): ");
            int id = scanner.nextInt();
            if (id < 0) break;

            scanner.nextLine();
            System.out.println("Digite o nome do cliente: ");
            String nome = scanner.nextLine();

            System.out.println("Digite a idade do cliente: ");
            int idade = scanner.nextInt();

            scanner.nextLine();
            System.out.println("Digite o telefone do cliente: ");
            String telefone = scanner.nextLine();

            clientes.add(new Cliente(id, nome, idade, telefone));
        }

        System.out.println("Lista de Clientes:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }

    scanner.close();

    }
}
