package edu.bruno.tipos_variaveis;

public class Variaveis_Constantes {
    
    public static void main(String[] args) {
        
        //Variável é um valor que varia ou seja ele é mutável
        int numero = 5;
        System.out.println(numero);

        //Aqui trata-se de uma inferência de tipo que não se coloca o tipo mas o java reconhece pelo o valor.
        numero = 10;
        System.out.println(numero);


        // O "final" não permite alterações nos valores da variável.
        final double VALOR_DE_PI = 3.14;
        System.out.println(VALOR_DE_PI);
        

    }
}
