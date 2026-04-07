import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int quantidadeMaioresDe50 = 0;
        double somaAlturasMaioresDe50 = 0;

        for (int pessoa = 1; pessoa <= 10; pessoa++) {
            System.out.print("Digite a idade da pessoa " + pessoa + ": ");
            int idadePessoa = entrada.nextInt();

            System.out.print("Digite a altura da pessoa " + pessoa + ": ");
            double alturaPessoa = entrada.nextDouble();

            if (idadePessoa > 50) {
                somaAlturasMaioresDe50 += alturaPessoa;
                quantidadeMaioresDe50++;
            }
        }

        if (quantidadeMaioresDe50 > 0) {
            double mediaAlturas = somaAlturasMaioresDe50 / quantidadeMaioresDe50;
            System.out.println("Média das alturas: " + mediaAlturas);
        } else {
            System.out.println("Nenhuma pessoa com mais de 50 anos.");
        }
        entrada.close();
    }
}
