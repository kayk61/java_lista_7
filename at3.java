package java_lista_7;

import java.util.Scanner;

public class at3 {
    public static void main(String[] args) {
        //Peças: Um sensor óptico conta peças em uma esteira. O
        //algoritmo deve somar 1 a uma variável total a cada ciclo do "Faça Enquanto"
        //até chegar a 50 peças.
        Scanner sc=new Scanner(System.in);
        int peças;
        peças = 0;


        while (peças <= 50) {
            System.out.println(peças);
            peças = peças+1;
        }
        sc.close();

    }
}
