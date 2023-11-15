package aula09;

import java.io.*;

class IgualdadeComEquals {
    static PrintStream t = System.out;

    public static void main(String[] args){
        // Comparando Strings
        String s1 = "Java";
        String s2 = "Java";
        t.println(s1 == s2);

        String s3 = new String("Java");
        String s4 = new String("Java");
        t.println(s3 == s4);
        /**
         * Java cria um pool de strings quando criamos de forma literal.
         * Quando utilizamos o operador new, ele cria novas strings.
         * 
         * A melhor forma de comparar um objeto é utilizando o método equals.
         */
        String s5 = new String("Java");
        String s6 = new String("Java");
        t.println(s5.equals(s6));

        // Criação de novos objetos String na memoria.
        String a = "a";
        String b = "b";
        /**
         * Apesar de ter utilizado duas literais para criar a string final
         * A comparação foi a partir de uma variável criada com duas 
         * referencias.
         */
        t.println("a + b == 'ab': " + (a + b == "ab"));
        String ab = "a" + "b";
        /**
         * Ja nesse caso, a comparacao foi com um variavel criada com a 
         * concatenacao de duas literais. 
         */
        t.println("ab == 'ab': " + (ab == "ab"));
        /**
         * Em alguns casos, o Java utiliza o pool, outros ñ.
         * Quando utilizamos metodos de string que retornam strings,
         * essas strings retornadas ñ são retiradas do pool e sim criadas.
         * Com algumas excecoes.
         */
        String java = "Java";
        String va = java.substring(2,4);
        t.println(va == "va"); // new
        t.println(va.toLowerCase() == "va"); // new 
        t.println(va.toLowerCase().toString() == va); // pool
        /**
         * Exemplo de código que pode confundir
         */
        String[] strings = new String[3];

        for (int i = 0; i < 3; i++){
            strings[i] = getString();
            t.println(strings[i] == "Java");
        }
        /**
         * Utilizando o metodo equals.
         * Assim com objetos String, outros objetos também devem ser 
         * comparados utilizando o equals.
         * Mas para isso, é importante implementar o objeto na classe,
         * sobrescrevendo de acordo com a necessidade.
         * Requisitos para implementar o método equals
         * - ser publico
         * - retornar boolean
         * - receber Object
         * Qualquer variação, na vdd está sendo sobrecarregado.
         * Por isso, é importante utilizar a annotation @Override,
         * pois caso nao sejam satisfeitos os requisitos, o compilador 
         * indicara que aquele é um novo método.
         */
        Pessoa p1 = new Pessoa("Java");
        Pessoa p2 = new Pessoa("Java");

        t.println("p1 == p2: " + (p1 == p2));
        t.println("p1.equals(p2): " + p1.equals(p2));

        t.println("p1.nome.substring(): " + p1.nome.substring(3, 3));

        /**
         * Outro caso em que o método da String não cria um novo objeto
         * é quando ele retorna a String inteira.
         */
        t.println("p1.nome.substring(0, 4) == p1.nome: " 
            +(p1.nome.substring(0, 4) == p1.nome));
    }

    static String getString(){
        String x = "Java";
        return x;
    }
}

class Pessoa {
    String nome;

    public Pessoa (String nome){
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o){
        if (!(o instanceof Pessoa)){
            return false;
        }

        return ((Pessoa) o).nome.equals(this.nome);
    }
}