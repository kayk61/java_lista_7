package at;

import java.util.Scanner;

public class at18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double lance;

        do {
            System.out.print("Digite seu lance: ");
            lance = sc.nextDouble();

        } while (lance < 50);

        System.out.println("Lance aceito!");
        sc.close();
    }
}