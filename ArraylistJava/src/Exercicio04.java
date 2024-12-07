import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos números deseja gerar?");
        int quantidade = scanner.nextInt();

        HashSet<Integer> numerosSet = new HashSet<>();
        while (numerosSet.size() < quantidade) {
            int numero = (int) (Math.random() * 100) + 1;
            numerosSet.add(numero);
        }

        ArrayList<Integer> numeros = new ArrayList<>(numerosSet);

        System.out.println("Números na ordem original:");
        System.out.println(numeros);

        Collections.sort(numeros);
        System.out.println("Números em ordem crescente:");
        System.out.println(numeros);

        Collections.reverse(numeros);
        System.out.println("Números em ordem decrescente:");
        System.out.println(numeros);
        scanner.close();
    }
}
