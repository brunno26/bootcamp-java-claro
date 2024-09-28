package edu.bruno.operadores;

public class OperadorUnario {
    
    public static void main(String[] args) {
        
        int numero = 5;
        numero = -numero;
        System.out.println(numero);

        numero = +numero;
        System.out.println(numero * -1);

        numero ++; //Incremento que pode ser pré ou pós-fixado
        numero --; //Decremento que pode ser pré ou pós-fixado
        //!variavel - negação de valor bolleano
    }
}
