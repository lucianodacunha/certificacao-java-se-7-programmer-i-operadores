package aula06;


import java.io.*;
import java.util.Random;


class Ternarios {
    public static void main(String... ar){
        /**
         * operador ternario ligado a 3 coisas
         * - condicao
         * - caso v
         * - caso f
         * - tem que retornar valores passiveis de impressão/atribuicao
         */
        int i = 5;
        int result = (i == 5) ? 100 : -100;
        System.out.println("result: " + result);
        System.out.println("result: " + (i));
        int numeroAleatorio = new Random().nextInt(100);
        System.out.println("Valor de aleatorio: " + numeroAleatorio);
        System.out.println( 
            numeroAleatorio >= 30 ? "Maior ou igual que 30" : "Menor que 30");

        /**
         * Operador de acesso a metodos
         */
        String palavra = "Java";
        System.out.println("palavra.length(): " + palavra.length());

        /**
         * Concateção em String
         */
        String a = "Java";
        String b = "Certificação";
        System.out.println(a + " " + b);

        /**
         * Precedência de operadores
         * pré [in,de]crementos
         * *, /, mod, +, -, <<, >>, >>>, 
         * pós [in,de]crementos
         */

    }
}