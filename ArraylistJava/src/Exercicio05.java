import java.util.ArrayList;
import java.util.Scanner;

class Contato {
    String nome;
    String email;
    String telefone;

    public Contato(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Email: " + email + ", Telefone: " + telefone;
    }
}

class Agenda {
    ArrayList<Contato> contatos = new ArrayList<>();

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void excluirContato(String nome) {
        contatos.removeIf(contato -> contato.nome.equalsIgnoreCase(nome));
    }

    public void listarContatos() {
        for (Contato contato : contatos) {
            System.out.println(contato);
        }
    }

    public void buscarContato(String nomeParte) {
        for (Contato contato : contatos) {
            if (contato.nome.toLowerCase().contains(nomeParte.toLowerCase())) {
                System.out.println(contato);
            }
        }
    }
}

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("[1] Incluir Contato");
            System.out.println("[2] Excluir Contato");
            System.out.println("[3] Listar Contatos");
            System.out.println("[4] Pesquisar Contato");
            System.out.println("[5] Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome:");
                    String nome = scanner.nextLine();

                    System.out.println("Digite o email:");
                    String email = scanner.nextLine();

                    System.out.println("Digite o telefone:");
                    String telefone = scanner.nextLine();

                    agenda.adicionarContato(new Contato(nome, email, telefone));
                    break;

                case 2:
                    System.out.println("Digite o nome do contato a excluir:");
                    String nomeExcluir = scanner.nextLine();
                    agenda.excluirContato(nomeExcluir);
                    break;

                case 3:
                    agenda.listarContatos();
                    break;

                case 4:
                    System.out.println("Digite parte do nome do contato:");
                    String nomeBusca = scanner.nextLine();
                    agenda.buscarContato(nomeBusca);
                    break;

                case 5:
                    System.out.println("Encerrando...");
                    return;

                default:
                    System.out.println("Opção inválida.");
                scanner.close();
            }
        }
    }
}
