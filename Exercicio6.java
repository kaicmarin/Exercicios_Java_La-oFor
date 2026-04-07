import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] votosPorCandidato = new int[4];
        int votosNulos = 0;
        int votosBrancos = 0;

        for (int eleitor = 1; eleitor <= 10; eleitor++) {
            System.out.print("Digite o voto do eleitor " + eleitor + ": ");
            int voto = entrada.nextInt();

            if (voto >= 1 && voto <= 4) {
                votosPorCandidato[voto - 1]++;
            } else if (voto == 5) {
                votosNulos++;
            } else if (voto == 6) {
                votosBrancos++;
            }
        }

        for (int candidato = 0; candidato < votosPorCandidato.length; candidato++) {
            System.out.println("Candidato " + (candidato + 1) + ": " + votosPorCandidato[candidato] + " votos");
        }
        System.out.println("Votos nulos: " + votosNulos);
        System.out.println("Votos em branco: " + votosBrancos);

        double percentualInvalidos = ((double)(votosNulos + votosBrancos) / 10) * 100;
        System.out.println("Percentual de nulos e brancos: " + percentualInvalidos + "%");
        entrada.close();
    }
}
