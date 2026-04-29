package at;

import java.util.Scanner;

public class at17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dia;

        do {
            System.out.print("Digite o dia (1 a 31): ");
            dia = sc.nextInt();

            if (dia < 1 || dia > 31) {
                System.out.println("Valor inválido!");
            }

        } while (dia < 1 || dia > 31);

        System.out.println("Data válida!");
        sc.close();
    }
}