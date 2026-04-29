package at;

import java.util.Scanner;

public class at14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalPeso = 0;

        do {
            System.out.print("Digite o peso da caixa: ");
            double peso = sc.nextDouble();
            totalPeso += peso;

            System.out.println("Total atual: " + totalPeso + " kg");

        } while (totalPeso < 1000);

        System.out.println("Limite de carga atingido!");
        sc.close();
    }
}