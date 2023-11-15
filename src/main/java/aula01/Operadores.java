package aula01;

import java.util.ArrayList;
import java.util.List;

class Operadores {
    public static void main(String... ar){
        // atribuição de inteiros
        // é permitida a atribuição de tipos menos 
        // abrangente para tipos mais abrangentes.
        int a = 10;
        long b = 20;
        float c = 30;
        double d = 40.0f;
        double e = 50.0;
        // int g = 10l;
        float h = 10l;
        double i = 20;
        // long j = 20f;

        byte l = 10;
        // byte m = 200; // ultrapassa o limite do byte

        char n = 10;
        // char o = -3; // não permite nros negativos

        // atribuição de tipos de referência
        // a partir do Java 7 podemos usar o operador <>
        ArrayList<String> l1 = new ArrayList<>();

        // copiamos sempre o valor
        ArrayList<String> l2 = l1;

        // podemos também utilizar o polimorfismo para
        // fazer atribuição
        List<String> l3 = l2;



    }
}