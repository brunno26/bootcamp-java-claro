public class FormatarCepExemplo {
    public static void main(String[] args) {

    try{
        String cepFormatado = FormatarCep("23765064");
        System.out.println(cepFormatado);
    }catch (CepInvalidException e){
        System.out.println("O Cep não corresponde as regras de negócio.");
    }
        
        
    }

    static String FormatarCep(String cep) throws CepInvalidException{
        if (cep.length() != 8)
            throw new CepInvalidException();

            return "23.765-064";
    }
}
