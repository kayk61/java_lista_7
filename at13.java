package at;

import java.util.Scanner;

public class at13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i;
        i=0;

        do {
            i = i+1;
            System.out.println(" Máquina " + i + " ");

            System.out.print("Tempo total de máquina ligada (em minutos): ");
            double tempoTotal = scanner.nextDouble();

            System.out.print("Tempo efetivamente produzindo (em minutos): ");
            double tempoProduzindo = scanner.nextDouble();


            if (tempoTotal > 0) {
                double disponibilidade = (tempoProduzindo / tempoTotal) * 100;
                System.out.printf("Disponibilidade da Máquina %d: %.2f%%%n", i, disponibilidade);
            } else {
                System.out.println("Tempo total não pode ser zero.");
            }
            System.out.println();
        }while (i<3);

        scanner.close();
        System.out.println("Cálculos finalizados.");

    }
}
