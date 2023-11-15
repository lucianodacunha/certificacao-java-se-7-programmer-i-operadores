package aula04;

import java.io.*;

class Logicos {
    static PrintStream t = System.out;

    public static void main(String... arg){

        t.println("1 == 1 & 1 > 2: " + (1 == 1 & 1 > 2)); // e
        t.println("1 == 1 | 2 > 1: " + (1 == 1 | 2 > 1)); // ou 
        t.println("1 == 1 ^ 2 > 1: " + (1 == 1 ^2 > 1)); // ou exclusivo
        t.println("!(1 == 1): " + !(1 == 1)); // negação

        /**
         * Nessas comparações o Java testa os dois lados.
         * Para agilizar, existem os operadores de curto circuito
         * que testa um lado, caso a condição seja satisfeita, 
         * não testa o outro lado.
         */
        // comparando os dois lados, mesmo qdo não necessário
        t.println("1 != 1 & test(1): " + (1 != 1 & test(1))); // e
        t.println("1 != 1 | test(2): " + (1 != 1 | test(2))); // ou 

        // comparando os dois lados, somente quando necessário
        t.println("1 != 1 && test(1): " + (1 != 1 && test(1))); // e
        t.println("1 != 1 || test(2): " + (1 != 1 || test(2))); // ou 

        t.println(false && false);
    }

    static boolean test(int i){
        t.print(i + ": ");
        return true;
    }
}