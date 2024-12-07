import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        ArrayList<String> telefones = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("(a) Adicionar telefone");
            System.out.println("(r) Remover telefone");
            System.out.println("(l) Listar telefones");
            System.out.println("(s) Sair");

            String opcao = scanner.nextLine().toLowerCase();

            switch (opcao) {
                case "a":
                    System.out.println("Digite o telefone para adicionar:");
                    telefones.add(scanner.nextLine());
                    break;

                case "r":
                    System.out.println("Digite o índice do telefone para remover:");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    if (index >= 0 && index < telefones.size()) {
                        telefones.remove(index);
                        System.out.println("Telefone removido.");
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;

                case "l":
                    System.out.println("Lista de telefones:");
                    for (int i = 0; i < telefones.size(); i++) {
                        System.out.println(i + ": " + telefones.get(i));
                    }
                    break;

                case "s":
                    System.out.println("Encerrando programa.");
                    return;

                default:
                    System.out.println("Opção inválida.");

                    scanner.close();
            }
        }   
    }   
}
