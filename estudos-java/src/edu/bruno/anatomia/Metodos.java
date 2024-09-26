package edu.bruno.anatomia;

public class Metodos {
    
    public static void main(String[] args) {
        
        String primeiroNome = "Bruno";
        String segundoNome = "Gomes";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
    return "Resultado do Metodo " + primeiroNome.concat(" ").concat(segundoNome);
    }
}

//Declarando Métodos: Tipo de retorno + NomeObjetivoNoInfinitivo + Parâmetro(s)
//Exemplo: int somar (int numeroUm, intNumero2)
//Exemplo: String formatarCep (long cep)
