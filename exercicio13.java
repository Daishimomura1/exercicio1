import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro não negativo: ");

        int numero = scanner.nextInt();
        scanner.close();

        long fatorial = calcularFatorial(numero);

        if (fatorial != -1) {
            System.out.println("O fatorial de " + numero + " é " + fatorial);
        } else {
            System.out.println("Não é possível calcular o fatorial de um número negativo.");
        }
    }

    public static long calcularFatorial(int numero) {
        if (numero < 0) {
            return -1; // Retornar -1 para indicar que não é possível calcular o fatorial de números negativos.
        }

        if (numero == 0 || numero == 1) {
            return 1; // O fatorial de 0 e 1 é 1.
        }

        long fatorial = 1;
        for (int i = 2; i <= numero; i++) {
            fatorial *= i;
        }

        return fatorial;
    }
}