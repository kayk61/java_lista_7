package java_lista_7;

import java.util.Scanner;

public class at8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;

        System.out.println("digite 0 se estiver tudo oq ou digite 1 para emergencia");
        n = sc.nextInt();
        do {
            if (n == 0) {
                System.out.println("tudo dentro dos conformes");
                n = sc.nextInt();
            }
        }while (n == 1 == false);
        System.out.println("emergencia acionada");
        sc.close();
    }
}
