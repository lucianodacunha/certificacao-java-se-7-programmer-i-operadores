package aula03;

import java.io.*;

class Comparacao {
    public static void main(String... ar){
        PrintStream t = System.out;
        /**
         * Uma comparaçao pode devolver dois possíveis valores:
         * true ou false
         */
        t.println(2 == 1 );
        t.println(2 >= 1 );
        t.println(2 <= 1 );
        t.println(2 != 1 );
        t.println(2 > 1 );
        t.println(2 < 1 );

        /**
         * Uma comparacao nao considera os tipos
         */

        t.println("2 == 2.0f: " + (2 == 2.0f));

        /**
         * Valores não primitivos devem ser comparados utilizando
         *  == ou !=
         */
        t.println("Java == Kotlin: " + ("Java" == "Kotlin"));
        t.println("Java != Kotlin: " + ("Java" != "Kotlin"));
        // t.println("Java > Kotlin: " + ("Java" > "Kotlin")); // erro

        // t.println(true == 1); // error: incomparable types: boolean and int
        int a = 1;
        t.println(a = 2);
        /**
         * Atenção ao igual simples, nesse caso é atribuição.
         */
        // t.println(1 = 2); // error: unexpected type
        /**
         * O comparador não considera o tipo da variável, mas cuidado.
         * valores de ponto flutuante pode ter muitas casas decimais,
         * o que irá afetar na comparação com um inteiro.
         */
    } 
}