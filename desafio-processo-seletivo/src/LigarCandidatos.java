import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class LigarCandidatos {
    public static void main(String[] args) {
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }
    }
    
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        
        do { 
            //Precisam sofrer as alterações
            atendeu = atender();
            continuarTentando = !atendeu;

            if(continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("Contato Realizado com sucesso");
        } while (continuarTentando && tentativasRealizadas <3);

        if(atendeu)
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa.");
            else
            System.out.println("Não conseguimos contato com " + candidato + " numero máximo " + tentativasRealizadas + " realizada.");
    }

    //método auxiliar atender, criado a partir de uma expressão randômica que simula as ligaçoes de forma automática.
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void ImprimirSelecionados() {
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for(int indice=0; indice < candidatos.length; indice++){
            System.out.println("O candidato de número " + (indice+1) + " é " + candidatos[indice ]);
        }

        System.out.println("Forma abreviada de interação for each");
        for(String candidato: candidatos){
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Mônica", "Fabricio", "Mirela", "Daniela", "Jorge"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidado " + candidato + " solicitou este valor de salário " +  salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + "foi selecionado para a vaga ");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    } 

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
    
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato.");
    
        }else if(salarioBase == salarioPretendido)
            System.out.println("Ligar para o candidado com contra proposta.");
        else{
            System.out.println("Aguardando resultado dos demais candidatos.");
        }
    }
}
