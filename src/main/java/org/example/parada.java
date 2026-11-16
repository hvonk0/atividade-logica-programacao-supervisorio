import java.util.Scanner;

public class ParadaEmergencia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("PARADA EMERGÊNCIA");
        System.out.print("Digite 1 para acionar a parada de emergência: ");
        int comando = teclado.nextInt();

        if (comando == 1) {
            System.out.println("Comando de interrupção enviado ao CLP/robô.");
            System.out.println("Célula robótica parada imediatamente.");
        } else {
            System.out.println("Comando não acionado.");
        }

        teclado.close();
    }
}