package edu.bruno.metodos;

public class SmartTv {
    //Criando os atributos da classe
    boolean ligada = false;
    int canal = 1;
    int volume = 25;


    //Criando os métodos da classe
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }
}

/*
 * Uma classe é definida por atributos e métodos;
 * 
 * Os métodos correspondem as funções ou subrotinas;
 * 
 * Critérios de Nomeação de métodos:
 * Deve ser nomeado como verbo, ex: acelerar
 * padrão camel case ex: calcularImposto
 */
