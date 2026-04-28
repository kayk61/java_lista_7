package java_lista_7;

import java.util.Scanner;

public class at11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int kwh,total;
        total = 0;

        System.out.println("digite o consumo da maquina em kwh e continue digitando novos valos se nao ultrapassar o limite(o limite é de 500kwh)");

        do {
            kwh = sc.nextInt();
            total = total+kwh;

        }while (total<500);
        System.out.println("limite de kwh ultrapassado");
        sc.close();
    }
}
