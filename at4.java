package java_lista_7;

import java.util.Scanner;

public class at4 {
    public static void main(String[] args) {
        //Leia o nível de um tanque de óleo (0 a 100%). Enquanto
        //o nível for menor que 80%, o algoritmo deve exibir "Enchendo..." e pedir nova
        //leitura.

        Scanner sc=new Scanner(System.in);
        int oleo;

        System.out.println("digite o nivel do tanque de óleo");
        oleo = sc.nextInt();

        do {
            System.out.println("enchendo: "+ oleo + "%");
            oleo = sc.nextInt();
        }while (oleo<80);
        if (oleo>100){
            System.out.println("nivel digitado invalido");
        }else {
            System.out.println("nivel do tanque maior ou igual à 80%");
        }
        sc.close();
    }
}
