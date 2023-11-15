package aula07;

class Casting {
    public static void main(String[] arg){
        /**
         * byte - short - int - long - float - double
         * char - int
         * Conversoes da esquerda para a direita nao precisa de casting
         * tbm chamada de autopromocao
         */
        float f = 3.14f;
        double d = f;

        System.out.printf("%.2f, %.2f\n", d, f);

        /**
         * Casting de ponto flutuante realiza um corte no decimal, 
         * retirnando somente a parte inteira
         */

        System.out.println("(int) 3.14159265359: " + (int) 3.14159265359);

        int i = 'a';
        char a = 5;
        short s = 1;

        System.out.println("Short.MIN_LENGTH: " + Short.MIN_VALUE);
        System.out.println("Short.MAX_LENGTH: " + Short.MAX_VALUE);
        System.out.println("Character.MIN_LENGTH: " + 
            (long)Character.MIN_VALUE);
        System.out.println("Character.MAX_LENGTH: " + 
            (long)Character.MAX_VALUE);
        System.out.println("Byte.MIN_LENGTH: " + Byte.MIN_VALUE);
        System.out.println("Byte.MAX_LENGTH: " + Byte.MAX_VALUE);

        // System.out.println(3 / 0);
        System.out.println(3 / 0.0);
        System.out.println((3.0 / 0) / (3.0 / 0));
        System.out.println((-3.0 / 0) / (-3.0 / 0));

        // Testando atribuições

        int z;

        /**
         * Nhm dos casos abaixo compila.
         * O compilador ñ tem certeza se z foi inicializada.
         */
        // if (arg.length > 1){
        //     z = 1;
        // }

        // for (int x = 0; x < 3; x++){
        //     z = x;
        // }

        // compila, pois a variavel z foi inicializa logo no inicio
        for (z = 0; z < 3; z++){
            ++z;
        }
        System.out.println(z);

        $_o0o_$ c = new $_o0o_$();
        c.main();
        System.out.println("");

        char c1 = 65;
        char c2 = 68 - 65;
        System.out.println(c1 + c2);

        String r1 = "Divisao dá: " + 15 / 0.0; // o op / tem tem precedencia
        String r2 = "Divisao dá: " + 15 + 0.0; // operacao da esq para dir
        String r3 = "Divisao dá: " + 15 * 0.0; // o op * tem precedencia
        String r4 = "Divisao dá: " + (15 - 0.0); // parenteses tem precendencia
        System.out.printf("%s, %s, %s, %s\n", r1, r2, r3, r4);

    }
}

/**
 * Verifica quais nome de pacotes, classes, metodos, variaveis são validos.
 */
class $_o0o_$ {
    public static void main() {
        int $$ = 5;
        int __ = $$++;
        if (__ < ++$$ || __-- > $$)
            System.out.print("A");

        System.out.print($$);
        System.out.print(__);
    }
}