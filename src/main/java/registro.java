import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class LogsRobo {
    public static void registro (String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<String> logs = new ArrayList<>();

        System.out.print("Quantos eventos deseja registrar? ");
        int quantidade = teclado.nextInt();
        teclado.nextLine();

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Descreva a ação executada: ");
            String acao = teclado.nextLine();

            String horario = LocalTime.now().toString();
            logs.add(horario + " - " + acao);
        }

        System.out.println("\nLOGS DO ROBÔ:");
        for (String log : logs) {
            System.out.println(log);
        }

        teclado.close();
    }
}