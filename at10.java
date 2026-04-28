package java_lista_7;

import java.util.Scanner;

public class at10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t1,media,c;
        c = 0;
        media = 0;

        System.out.println("digite a quantidade de peças produzidas no primeiro turno e nos outros 4 turnos");

        do {
            t1  = sc.nextInt();
            c = c+1;
            media = media+t1;

        }while (c<5);
        System.out.println("a media das peças produzidas nos 5 turnos é: "+ (media/5));
        sc.close();


    }
}
