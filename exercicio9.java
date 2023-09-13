import java.util.Scanner;
import java.util.Calendar;

public class exercicio9 {
    public static void main(String[] args) {
        // Crie um objeto Scanner para ler a entrada do teclado
        Scanner scanner = new Scanner(System.in);

        // Solicite ao usuário que insira o ano de nascimento
        System.out.print("Insira o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        // Obtém o ano atual
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);

        // Calcula a idade
        int idade = anoAtual - anoNascimento;

        // Exibe a idade
        System.out.println("Sua idade é: " + idade + " anos");

        // Fecha o scanner
        scanner.close();
    }
}