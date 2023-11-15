package aula13;

import java.io.*;
import java.util.*;

class UtilizeSwitch {
    static PrintStream t = System.out;

    public static void main(String[] args){

        int random = new Random().nextInt(4);
        /**
         * Qualquer tipo inteiro menor que int ou String ou enum.
         * char, byte, short
         * Caso nao utilizar break, ele continuara executando tds os cases.
         */
        switch(random) {
            case 0:
                t.println("Valor: " + 0);
                break; 
            case 1:
                t.println("Valor: " + 1);
                break;
            case 2:
                t.println("Valor: " + 2);
                break;
            default:
                t.println("Valor: " + 3);
        }

        random = new Random().nextInt(4);
        switch(random) {
            case 0:
            case 1:
            case 2:
                t.println("Valor: 0, 1 ou 2: " + random);
                break;
            default:
                t.println("Valor 3: " + random);
        }  

        /**
         * Podemos utilzar String nos cases,
         * porém, a variável tbm deve ser String
         * O código abaixo ñ compila.
         * O valor do switch deve ser compativel com o case.
         */
        // random = new Random().nextInt(4);
        // switch(random) {
        //     case "0":
        //     case "1":
        //     case "2":
        //         t.println("Valor: 0, 1 ou 2: " + random);
        //         break;
        //     default:
        //         t.println("Valor 3: " + random);
        // }        

        int maxInt = Integer.MAX_VALUE;
        t.println("Valor max de int: " + maxInt);
        int varCase = 2147483646;
        t.println("Valor da variavel: " + varCase);
        switch(varCase){
            case 2147483644:
            case 2147483645:
            case 2147483646:
            case 2147483647:
                t.println("Menor ou igual a 2147483646:");
                break;
            default:
                t.println("Outro valor");
        }
        /**
         * no case, só pode usar variavel final e literal.
         * caso utilize expressões, deve ser composta por um dos dois acima.
         * O código abaixo não compilaria.
         * pois somente é possivel saber os valore em tempo
         * de execucao.
         * A variável deve ser inicializada na mesma linha da declaracao.
         */
        // final int CASE1 = new Random().nextInt(10);
        // final int CASE2 = new Random().nextInt(10);
        // final int CASE3 = new Random().nextInt(10);
        // final int CASE4 = new Random().nextInt(10);
        final int CASE1 = 1;
        final int CASE2 = 2;
        final int CASE3 = 3;
        final int CASE4 = 4;        
        int variavel = new Random().nextInt(10);

        switch(variavel){
            case CASE1:
                t.println("valor 1: " + variavel);
                break;                
            default: // nao precisa ficar em ultimo.
                t.println("valor 5: " + variavel);
                break;
            case CASE2:
                t.println("valor 2: " + variavel);
                break;                
            case CASE3:
                t.println("valor 3: " + variavel);
                break;
            case CASE4:
                t.println("valor 4: " + variavel);
                break;
        }

        switch(variavel){
            case CASE1 + 1:
                t.println("case 1 + 1: " + (variavel)); break;
            case CASE2 + 1:
            case CASE3 + 1:
                t.println("case 2 ou 3 + 1: " + (variavel)); break;
            default:
                t.println("Valor default: " + variavel);
                
        }
    } 
}
