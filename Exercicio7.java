import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int quantidadeMaioresDe50 = 0;
        int quantidadeEntre10e20 = 0;
        int quantidadeAbaixoDe40Kg = 0;
        double somaAlturasEntre10e20 = 0;

        for (int pessoa = 1; pessoa <= 10; pessoa++) {
            System.out.print("Digite a idade da pessoa " + pessoa + ": ");
            int idadePessoa = entrada.nextInt();

            System.out.print("Digite a altura da pessoa " + pessoa + ": ");
            double alturaPessoa = entrada.nextDouble();

            System.out.print("Digite o peso da pessoa " + pessoa + ": ");
            double pesoPessoa = entrada.nextDouble();

            if (idadePessoa > 50) quantidadeMaioresDe50++;
            if (idadePessoa >= 10 && idadePessoa <= 20) {
                somaAlturasEntre10e20 += alturaPessoa;
                quantidadeEntre10e20++;
            }
            if (pesoPessoa < 40) quantidadeAbaixoDe40Kg++;
        }

        System.out.println("Quantidade de pessoas maiores de 50 anos: " + quantidadeMaioresDe50);
        if (quantidadeEntre10e20 > 0) {
            double mediaAlturas = somaAlturasEntre10e20 / quantidadeEntre10e20;
            System.out.println("Média das alturas (10 a 20 anos): " + mediaAlturas);
        } else {
            System.out.println("Nenhuma pessoa entre 10 e 20 anos.");
        }
        double percentualAbaixo40Kg = ((double)quantidadeAbaixoDe40Kg / 10) * 100;
        System.out.println("Porcentagem com peso < 40kg: " + percentualAbaixo40Kg + "%");
        entrada.close();
    }
}
