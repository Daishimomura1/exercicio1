import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione uma opção:");
        System.out.println("1 - Gestante");
        System.out.println("2 - Pessoa Idosa");
        System.out.println("3 - Pessoa com Deficiência (PCD)");
        System.out.println("4 - Outros");

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Você tem direito à fila prioritária como Gestante.");
                break;
            case 2:
                System.out.println("Você tem direito à fila prioritária como Pessoa Idosa.");
                break;
            case 3:
                System.out.println("Você tem direito à fila prioritária como Pessoa com Deficiência (PCD).");
                break;
            case 4:
                System.out.println("Você não tem direito à fila prioritária.");
                break;
            default:
                System.out.println("Opção inválida. Por favor, selecione uma opção válida.");
                break;
        }

        scanner.close();
    }
}