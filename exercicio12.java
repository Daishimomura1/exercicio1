import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quanto em dólares você quer converter? ");
        double quantiaEmDolares = scanner.nextDouble();

        System.out.print("Qual é a taxa de câmbio atual (por exemplo, 5 para reais)? ");
        double taxaDeCambio = scanner.nextDouble();

        double valorConvertido = quantiaEmDolares * taxaDeCambio;

        System.out.println("O valor convertido é: " + valorConvertido + " na outra moeda.");
    }
}