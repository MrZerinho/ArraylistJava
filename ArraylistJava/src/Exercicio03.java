import java.util.ArrayList;
import java.util.Scanner;

class Aluno {
    private int matricula;
    private String nome;
    private double notaBimestre1;
    private double notaBimestre2;

    public Aluno(int matricula, String nome, double notaBimestre1, double notaBimestre2) {
        this.matricula = matricula;
        this.nome = nome;
        this.notaBimestre1 = Math.max(0, Math.min(10, notaBimestre1));
        this.notaBimestre2 = Math.max(0, Math.min(10, notaBimestre2));
    }

    public double calcularMedia() {
        return (notaBimestre1 + notaBimestre2) / 2;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Matrícula: " + matricula + ", Nome: " + nome + ", Média: " + calcularMedia();
    }
}

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Aluno> listaAlunos = new ArrayList<>();

        System.out.println("Quantos alunos deseja cadastrar?");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite a matrícula do aluno:");
            int matricula = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Digite o nome do aluno:");
            String nome = scanner.nextLine();

            System.out.println("Digite a nota do 1º bimestre:");
            double nota1 = scanner.nextDouble();

            System.out.println("Digite a nota do 2º bimestre:");
            double nota2 = scanner.nextDouble();
            scanner.nextLine();

            listaAlunos.add(new Aluno(matricula, nome, nota1, nota2));
        }

        double somaMedias = 0;
        int aprovados = 0, reprovados = 0, exames = 0;
        double maiorMedia = Double.MIN_VALUE, menorMedia = Double.MAX_VALUE;
        String alunoMaiorMedia = "", alunoMenorMedia = "";

        for (Aluno aluno : listaAlunos) {
            double media = aluno.calcularMedia();
            somaMedias += media;

            if (media >= 6) {
                aprovados++;
                System.out.println(aluno + " - APROVADO");
            } else if (media >= 4) {
                exames++;
                System.out.println(aluno + " - EXAME");
            } else {
                reprovados++;
                System.out.println(aluno + " - REPROVADO");
            }

            if (media > maiorMedia) {
                maiorMedia = media;
                alunoMaiorMedia = aluno.getNome();
            }

            if (media < menorMedia) {
                menorMedia = media;
                alunoMenorMedia = aluno.getNome();
            }
        }

        double mediaClasse = somaMedias / listaAlunos.size();

        System.out.println("\nRelatório Final:");
        System.out.println("Total de Alunos: " + listaAlunos.size());
        System.out.println("Aprovados: " + aprovados);
        System.out.println("Exame: " + exames);
        System.out.println("Reprovados: " + reprovados);
        System.out.println("Média da Classe: " + mediaClasse);
        System.out.println("Maior Média: " + alunoMaiorMedia + " - " + maiorMedia);
        System.out.println("Menor Média: " + alunoMenorMedia + " - " + menorMedia);

        scanner.close();
    }
}
