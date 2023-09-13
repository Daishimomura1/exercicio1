import java.util.Calendar;

public class exercicio5 {
    public static void main(String[] args) {
        Calendar agora = Calendar.getInstance();
        int horaAtual = agora.get(Calendar.HOUR_OF_DAY);
        int minutoAtual = agora.get(Calendar.MINUTE);
        int segundoAtual = agora.get(Calendar.SECOND);

        int segundosDesdeMeiaNoite = horaAtual * 3600 + minutoAtual * 60 + segundoAtual;
        int segundosAteMeiaNoite = 86400 - segundosDesdeMeiaNoite;

        System.out.println("Segundos desde a meia-noite: " + segundosDesdeMeiaNoite);
        System.out.println("Segundos faltando para a meia-noite: " + segundosAteMeiaNoite);
    }
}