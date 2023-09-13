import java.util.Scanner;

public class exercicio7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Solicita a idade do usuário
        System.out.print("Digite sua idade: ");
        int idade = input.nextInt();

        // Solicita o salário do usuário
        System.out.print("Digite seu salário mensal em R$: ");
        double salario = input.nextDouble();

        // Verifica se a pessoa é maior de idade e ganha mais de R$ 2.000,00
        if (idade >= 18 && salario > 2000) {
            System.out.println("Parabéns! Você pode comprar um automóvel.");
        } else {
            System.out.println("Desculpe, você não atende aos requisitos para comprar um automóvel.");
        }

        // Fecha o scanner
        input.close();
    }
}