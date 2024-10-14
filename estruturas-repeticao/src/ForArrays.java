public class ForArrays {
    public static void main(String[] args) {
        //Também usamos (for) para interagir sobre arrays e coleções.
        String alunos[] = {"Felipe", "Jonas", "Julia", "Marcos"};

        //for (int x = 0; x < alunos.length; x++) {
            //System.out.println("O aluno no índice x=" + x + " é " + alunos[x]); 
        //}

        //Fazendo a mesma coisa mas de forma resumida
        for(String aluno : alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
}

//Um array é um conjunto de elementos de um tipo correspondente.
//Em um array o índice inicializa com zero (0).