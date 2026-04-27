package java_lista_7;

import java.util.Scanner;

public class at2 {
    public static void main(String[] args) {
        //O sistema deve solicitar a pressão de uma caldeira. Se
        //a pressão for menor que 10 bar, peça nova leitura. Pare quando atingir o nível
        //ideal.
        Scanner sc=new Scanner(System.in);
        int pressao;

        System.out.println("digite o nivel da pressao da caldeira");
        pressao = sc.nextInt();

        do {
            System.out.println("pressão da caldeira muito baixa reajuste a pressão: "+ pressao + "bar");
            pressao = sc.nextInt();

        }while (pressao<10);
        System.out.println("pressão ideal para a caldeira atingida: "+ pressao + "bar");
        sc.close();

    }
}
