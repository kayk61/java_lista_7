package java_lista_7;

import java.util.Scanner;

public class at1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int temperatura;

        System.out.println("digite a temperatura da extrusora: ");
        temperatura = sc.nextInt();
        while (temperatura < 180) {
            System.out.println("temperatura invalida: "+ temperatura+ "°C");
            temperatura = sc.nextInt();
        }
        System.out.println("A temperatura da extrusora é: "+ temperatura + "°C");
        sc.close();
    }
}
