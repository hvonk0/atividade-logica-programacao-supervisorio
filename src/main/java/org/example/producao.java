import java.util.Scanner;

public class Producao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a quantidade total de peças processadas: ");
        int totalPecas = teclado.nextInt();

        System.out.print("Informe o tempo total de produção em segundos: ");
        double tempoTotal = teclado.nextDouble();

        System.out.print("Informe a quantidade de peças separadas corretamente: ");
        int pecasCorretas = teclado.nextInt();

        double tempoCiclo = tempoTotal / totalPecas;
        double taxaAcerto = (pecasCorretas * 100.0) / totalPecas;

        System.out.println("Total de peças processadas: " + totalPecas);
        System.out.printf("Tempo de ciclo por peça: %.2f segundos%n", tempoCiclo);
        System.out.printf("Taxa de acerto: %.2f%%%n", taxaAcerto);

        teclado.close();
    }
}