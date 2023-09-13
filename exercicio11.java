import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra ou frase: ");
        String entrada = scanner.nextLine();

        int contadorVogais = contarVogais(entrada);

        System.out.println("O número de vogais na entrada é: " + contadorVogais);
    }

    public static int contarVogais(String texto) {
        int contador = 0;
        texto = texto.toLowerCase(); // Converter para minúsculas para considerar todas as vogais.

        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);
            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
                contador++;
            }
        }

        return contador;
    }
}