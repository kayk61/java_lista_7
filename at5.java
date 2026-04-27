package java_lista_7;

import java.util.Scanner;

public class at5 {
    public static void main(String[] args) {
        //Em um ambiente de pintura, a umidade deve estar entre 40% e
        //60%. O programa deve repetir a leitura se o valor estiver fora dessa faixa,
        //alertando "Ambiente Inadequado".
        Scanner sc=new Scanner(System.in);
        int umidade;

        System.out.println("digite o nivel da umidade do local");
        umidade = sc.nextInt();

        do {
            System.out.println("ambiente inadequado: "+ umidade + "%" + " de umidade");
            umidade = sc.nextInt();

        }while (umidade<40 || umidade>60);
        System.out.println("ambiente adequado: "+ umidade + "%" + " de umidade");
        sc.close();

    }
}
