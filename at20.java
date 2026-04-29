package at;

import java.util.Scanner;

public class at20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total,boas,refugos;
        double perda;
         boas = 0;
         refugos = 0;

        do {
            System.out.print("Peça boa (b) ou refugo (r) ");
            char status = sc.next().toLowerCase().charAt(0);

            if (status == 'b') {
                boas = boas+1;
            } else if (status == 'r') {
                refugos= refugos+1;
            }

        } while (boas + refugos < 50);

        total = boas + refugos;
        perda = (refugos * 100.0) / total;

        System.out.println("\nPeças boas: " + boas);
        System.out.println("Refugos: " + refugos);
        System.out.printf("Percentual de perda: %.2f%%\n", perda);

        sc.close();
    }
}