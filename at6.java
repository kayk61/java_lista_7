package java_lista_7;

import java.util.Objects;
import java.util.Scanner;

public class at6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String nome;

        System.out.println("digite seu nome");
        nome = sc.nextLine();

        do {
            if (!nome.equals("ADMIN")) {
                System.out.println("senha incorreta");
                nome = sc.nextLine();
            }
        }while (!nome.equals( "ADMIN"));
        System.out.println("Acesso liberado usuario: "+ nome);
        sc.close();
    }
}
