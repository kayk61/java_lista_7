package at;

import java.util.Scanner;

public class at16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int estoque = 100;

        do {
            System.out.print("Quantidade usada: ");
            int uso = sc.nextInt();
            estoque -= uso;

            System.out.println("Estoque restante: " + estoque);

        } while (estoque > 10);

        System.out.println("Estoque abaixo do mínimo!");
        sc.close();
    }
}