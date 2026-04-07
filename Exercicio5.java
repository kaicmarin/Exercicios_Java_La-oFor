import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int totalAprovados = 0, totalExames = 0, totalReprovados = 0;
        double somaMediasDaTurma = 0;

        for (int aluno = 1; aluno <= 6; aluno++) {
            System.out.print("Digite a primeira nota do aluno " + aluno + ": ");
            double primeiraNota = entrada.nextDouble();

            System.out.print("Digite a segunda nota do aluno " + aluno + ": ");
            double segundaNota = entrada.nextDouble();

            double mediaDoAluno = (primeiraNota + segundaNota) / 2;
            somaMediasDaTurma += mediaDoAluno;

            if (mediaDoAluno <= 3) {
                System.out.println("Aluno " + aluno + ": REPROVADO");
                totalReprovados++;
            } else if (mediaDoAluno < 7) {
                System.out.println("Aluno " + aluno + ": EXAME");
                totalExames++;
            } else {
                System.out.println("Aluno " + aluno + ": APROVADO");
                totalAprovados++;
            }
        }

        System.out.println("Total aprovados: " + totalAprovados);
        System.out.println("Total exames: " + totalExames);
        System.out.println("Total reprovados: " + totalReprovados);
        System.out.println("Média da turma: " + (somaMediasDaTurma / 6));
        entrada.close();
    }
}
