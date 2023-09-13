import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double numero3 = scanner.nextDouble();

        double maior = Math.max(numero1, Math.max(numero2, numero3));
        double menor = Math.min(numero1, Math.min(numero2, numero3));
        double media = (numero1 + numero2 + numero3) / 3;

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.println("Média aritmética: " + media);

        scanner.close();
    }
}