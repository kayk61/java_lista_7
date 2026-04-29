package at;

import java.util.Scanner;

public class at9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cracha;
        String prefixo = "SENAI-";

        do {
            System.out.print("Digite o código do crachá: ");
            cracha = scanner.nextLine();


            if (cracha == null || !cracha.startsWith(prefixo)) {
                System.out.println("Crachá inválido! Deve começar com '" + prefixo + "'. Tente novamente.");
            }

        } while (cracha == null || !cracha.startsWith(prefixo));

        System.out.println("Crachá validado com sucesso: " + cracha);

        scanner.close();
    }
}

