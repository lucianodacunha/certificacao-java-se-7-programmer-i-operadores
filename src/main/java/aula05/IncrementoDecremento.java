package aula05;

import java.io.*;

class IncrementeDecremento{
    static PrintStream t = System.out;
    public static void main(String... arg){
        int i = 5;
        i--;
        t.println("i: " + i);
        t.println("i--: " + i--); // primeiro imprime, depois decrementa
        t.println("i: " + i);
        t.println("--i: " + i); // primeiro decrementa, depois imprime
        t.println("i: " + i);

        /**
         * Operadores para realizar operações e atribuições de uma 
         * só vez
         */
        int a = 10;
        t.println("a: " + a);
        t.println("a += 10: " + (a += 10));
        t.println("a -= 10: " + (a -= 10));
        /**
         * quando utilizamos esse operador, o compilador faz os ajustes
         * necessários para adequar o resultado à variável.
         * Pois, o resultado de uma operação
         */
        t.println("a /= 3.0: " + (a /= 3.0)); // o compilador resolve 
        int b = 10;
        // int c = 3;
        // int d = b / 3.0; // o retorno será o maior, o compilador ñ resolve
        // t.println("d: " + d);
        t.println("b / 3: " + ( b / 3));
        t.println("a *= 10: " + (a *= 10));
        t.println("a %= 10: " + (a %= 10));
        // a += 10;
        // t.println("a: "+ a);

        /**
         * em expressões, a execução ocorrerá da esquerda para a direita.
         */
        t.println("a: " + a);
        t.println("a += ++a + a + ++a: " + (a += ++a + a + ++a));
        t.println("a: " + a);

        a = 0;
        t.println("a (reset a): " + a);
        t.println("a += a++ + a + a++: " + (a += a++ + a + a++));
        t.println("a: " + a);
        /**
         * a += a++ + a + a++
         * a = a + a++ + a + a++
         * a = 0 + a++ + a + a++
         * a = 0 + 0 + a + a++
         * a = 0 + 0 + 1 + a++
         * a = 0 + 0 + 1 + 1
         * a = 2
         */
        // b++ incrementa 1 mas retorna o valor anterior
        a = 0;
        b = 0;
        t.println("a (reset a): " + a);
        t.println("a += b++ + b + b++: " + (a += b++ + b + b++));
        t.println("a: " + a);
        t.println("b: " + b);

        // b = 2 // atribui 2 e retorna o valor atribuido
        int aa = 0, bb = 0, c = 0, d = 0, e = 0;
        aa = bb = c = d = e = 10;
        t.printf("%d, %d, %d, %d, %d\n" , aa, bb, c, d, e);

    }
}