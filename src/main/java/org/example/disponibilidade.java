import java.util.Scanner;

public class Indicadores {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o tempo total planejado em minutos: ");
        double tempoPlanejado = teclado.nextDouble();

        System.out.print("Informe o tempo de parada mecânica em minutos: ");
        double tempoParada = teclado.nextDouble();

        System.out.print("Informe o tempo de produção em minutos: ");
        double tempoProducao = teclado.nextDouble();

        System.out.print("Informe a quantidade ideal de peças: ");
        int pecasIdeais = teclado.nextInt();

        System.out.print("Informe a quantidade real de peças produzidas: ");
        int pecasReais = teclado.nextInt();

        System.out.print("Informe a quantidade de peças sem defeito: ");
        int pecasBoas = teclado.nextInt();

        double disponibilidade = ((tempoPlanejado - tempoParada) / tempoPlanejado) * 100;
        double performance = ((double) pecasReais / pecasIdeais) * 100;
        double qualidade = ((double) pecasBoas / pecasReais) * 100;
        double oee = (disponibilidade / 100) * (performance / 100) * (qualidade / 100) * 100;

        System.out.printf("Disponibilidade mecânica: %.2f%%%n", disponibilidade);
        System.out.printf("Performance: %.2f%%%n", performance);
        System.out.printf("Qualidade: %.2f%%%n", qualidade);
        System.out.printf("OEE: %.2f%%%n", oee);

        teclado.close();
    }
}