package at;

import java.util.Scanner;

public class at15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double horas = 0;

        do {
            System.out.print("Horas da missão: ");
            double voo = sc.nextDouble();
            horas += voo;

            System.out.println("Total acumulado: " + horas + "h");

        } while (horas < 20);

        System.out.println("Drone precisa de manutenção!");
        sc.close();
    }
}