package edu.bruno.tipos_variaveis;

public class TiposVariaveis {
    
    public static void main(String[] args) {
        
        double salarioMinimo = 2500.33;
        System.out.println(salarioMinimo);

        //Tipos-Variaveis
        short numeroCurto = 1;
        System.out.println(numeroCurto);

        int numeroNormal = numeroCurto;

        short numeroCurto2 = (short) numeroNormal;
        System.out.println(numeroCurto2);

        //Não é coerente fazer um casting com frequência (short) adaptação ao código.

    }
}