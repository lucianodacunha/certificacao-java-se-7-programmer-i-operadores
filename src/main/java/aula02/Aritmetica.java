package aula02;


class Aritmetica {
    public static void main(String... args){
        /**
         * A regra nas operações aritmeticas é:
         * - o retorno será no minimo um int
         * - o retorno será sempre do tipo do maior
         */

        int a = 10;
        int b = 5;
        int c;

        c = a + b;
        c = a - b;
        c = a * b;
        c = a / b;

        float d = 2f;

        // c = a + d; // o retorno é float
        byte e = 10;
        byte f = 5;
        // byte g = e + f; // o retorno é no minimo um int

        d = d + a; // compila e roda   

        /**
         * Divisão por zero inteiro dará exception em tempo de exec.
         * Divisão por zero flutuante retorna infinity
         * Divisão por zero infinity com zero infinitt retorna NaN
         */
        int h = 100;
        int i = 0;
        // int j = h / i; // java.lang.ArithmeticException: / by zero
        float l = 0.0f;
        float m = h / l;
        System.out.println(m); // Infinity
        System.out.println((h / l) + (-1 *(h / l))); // NaN
    }
}