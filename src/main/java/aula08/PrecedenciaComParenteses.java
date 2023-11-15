package aula07;

class PrecedenciaComParenteses {
    public static void main(String[] arg){

        // usando parenteses para alterar a ordem da soma
        System.out.println("5 + (2 * 3) + 1: " + (5 + (2 * 3) + 1));
        System.out.println("5 + (2 * 3) + 1: " + (5 + (2 * 3) + 1));
        System.out.println("5 + 2 * (3 + 1): " + (5 + 2 * (3 + 1)));

        // usando parenteses para alterar a execução do método
        System.out.println("Java " + "é legal".length());
        System.out.println(("Java " + "é legal").length());
        
    }
}