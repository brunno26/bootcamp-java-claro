package edu.bruno.operadores;

public class OperadorTernario {
    
    public static void main(String[] args) {
        
        int a, b;
        a = 5;
        b = 6;

        //Usando operador ternário
        //String resultado = a==b ? "verdadeiro" : "falso";
        //System.out.println(resultado);

        //O operador ternário não se restringe apenas a string veja outro exemplo:
        int resultado = a==b ? 1 : 0;
        System.out.println(resultado);
 
    }
}
