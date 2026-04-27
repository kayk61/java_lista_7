package java_lista_7;

import java.util.Scanner;

public class at7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int senha;

        System.out.println("Digite sua senha");
        senha = sc.nextInt();
        do {
            if (senha != 1234) {
                System.out.println("senha icorreta tente novamente");
                senha = sc.nextInt();
            }

        }while (senha == 1234 == false);
        System.out.println("acesso liberado");
        sc.close();
    }
}
