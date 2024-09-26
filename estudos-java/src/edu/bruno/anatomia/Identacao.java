package edu.bruno.anatomia;

public class Identacao {
    
    /*Identação é um termo utilizado para escrever o código do programa de forma hierárquica,
    facilitando a visualização e o entendimento do programa.
     */

     public static void main(String[] args) {
        
        //Código sem identação
        int mediaFinal = 6;
        if(mediaFinal<6)
        System.out.println("REPROVADO");
        else if (mediaFinal==6)
        System.out.println("PROVA MINERVA");
        else
        System.out.println("APROVADO");

        //Código com identação
        if(mediaFinal<7)
            System.out.println("REPROVADO");
        else if (mediaFinal==6)
            System.out.println("PROVA MINERVA");
        else
            System.out.println("APROVADO");
    }

}
