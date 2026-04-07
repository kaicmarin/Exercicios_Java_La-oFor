import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int limite = entrada.nextInt();

        for (int numero = 1; numero <= limite; numero++) {
            System.out.print(numero + " ");
        }
        entrada.close();
    }
}
