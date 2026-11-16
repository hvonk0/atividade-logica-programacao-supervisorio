import java.util.Scanner;

public class SeparacaoPecas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int vermelhas = 0;
        int azuis = 0;
        int verdes = 0;

        System.out.print("Informe a quantidade de peças a separar: ");
        int total = teclado.nextInt();

        for (int i = 1; i <= total; i++) {
            System.out.print("Informe a cor da peça " + i + " (1-Vermelha, 2-Azul, 3-Verde): ");
            int cor = teclado.nextInt();

            if (cor == 1) {
                vermelhas++;
            } else if (cor == 2) {
                azuis++;
            } else if (cor == 3) {
                verdes++;
            } else {
                System.out.println("Cor inválida. Peça não contabilizada.");
            }
        }

        System.out.println("Peças vermelhas: " + vermelhas);
        System.out.println("Peças azuis: " + azuis);
        System.out.println("Peças verdes: " + verdes);
        System.out.println("Peças cinzas");
        teclado.close();
    }
}