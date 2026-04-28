package java_lista_7;

import java.util.Objects;
import java.util.Scanner;

public class at12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int contd;
        String peça;
        contd = 0;

        System.out.println("digite o se a peça produzida esta ok ou com defeito");

        do {
            peça = sc.nextLine();
            if (peça.equals( "defeito")) {
                contd = contd+1;
                System.out.println("peça com defeito");

            }else {
                System.out.println("peça ok");

            }
        }while (contd<5);
        System.out.println("limite de 5 defeitos atingido");
        sc.close();
    }
}
