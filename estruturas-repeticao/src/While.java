
import java.util.concurrent.ThreadLocalRandom;

public class While {
    public static void main(String[] args) {
        //Enquanto uma condição for válida o bloco de código será executado.

        double mesada = 50;

        while (mesada > 0){
            double valorDoce = valorAleatorio();
            if (valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce do valor: " + valorDoce + "adicionado no carrinho.");
            mesada = mesada - valorDoce;
        }

        System.out.println("Mesada: " + mesada);
        System.out.println("Joaõzinho toda sua mesada em doces!");
    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,15);
    }
}
