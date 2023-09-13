import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        // Defina o valor do salário mínimo
        double salarioMinimo = 1320.0; // Em reais

        // Crie um scanner para ler o valor do salário do usuário
        Scanner scanner = new Scanner(System.in);

        // Peça ao usuário para inserir o valor do seu salário
        System.out.print("Digite o valor do seu salário em reais: ");
        double salarioUsuario = scanner.nextDouble();

        // Calcule a quantidade de salários mínimos que o usuário ganha
        double quantidadeSalariosMinimos = salarioUsuario / salarioMinimo;

        // Exiba o resultado
        System.out.printf("Você ganha %.2f salários mínimos.%n", quantidadeSalariosMinimos);

        // Feche o scanner
        scanner.close();
    }
}