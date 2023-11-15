package aula12;

import java.io.*;
import java.util.*;

class UtilizeIfElse {
    static PrintStream t = System.out;

    public static void main(String[] args){

        /**
         * Situaçoes de utilizaçao do if/else
         */
        int random = new Random().nextInt(100);
        if (random >= 50) {
            t.println("OK");
        } else {
            t.println("NO");
        }
        /**
         * Quando as instruçoes executadas tiverem somente um linha
         * as chaves são dispensaveis
         */
        random = new Random().nextInt(100);
        if (random >= 50)
            t.println("OK");
        else
            t.println("NO");

        /**
         * Somente valor booleano é aceito na comparacao
         */
        // if (1 > 50) // ñ compila
        /**
         * O else nao é obrigatorio caso nao tenha uma outra condicao
         */
        random = new Random().nextInt(100);
        if (random >= 50)
            t.println("YES");
        /**
         * Caso tenha mais que uma condicao, pode encadear varios if/else/if
         * Java nao tem if/elseif, nem if/elif.
         */
        random = new Random().nextInt(100);
        if (random <= 20)
            t.println("<= 20: " + random);
        else if (random <= 40)
            t.println("<= 40: " + random);
        else if (random <= 60)
            t.println("<= 60: " + random);
        else if (random <= 80)
            t.println("<= 80: " + random);
        else 
            t.println("> 80: " + random);
        /**
         * Código mal indentado pode ser dificil de interpretar.
         * Quando nao utilizamos chave, somente a primeira linha abaixo do
         * if é considerada de seu escopo.
         */
        int valor = 100;
        if (valor > 200)
        if (valor < 400)
        if (valor > 300)
            System.out.println("a");
        else
            System.out.println("b");
        else
            System.out.println("c");
        /**
         * O java reclama quando detecta algum trecho de código inacessivel.
         * 
         */
        // new Claz().main();
        /**
         * Outros casos semelhantes são 
         */
    } 
}

/**
 * Declarando uma exception compila.
 */
// class Claz {
//     boolean main(){ 
//         if (false){ 
//             return true; // error: missing return statement
//         }
//         throw new RuntimeException();
//     }
// }