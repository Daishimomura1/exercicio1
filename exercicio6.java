import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade < 16) {
            System.out.println("Você não pode votar.");
        } else if (idade >= 16 && idade <= 17 || idade > 65) {
            System.out.println("O voto é facultativo.");
        } else {
            System.out.println("O voto é obrigatório.");
        }

        scanner.close();
    }
}