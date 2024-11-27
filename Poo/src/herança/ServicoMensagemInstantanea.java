public class ServicoMensagemInstantanea {
    
    public void enviarMensagem() {
        validarConectadoInternet(); //Quando os métodos estão no private, so podem ser chamados na própria classe.
        System.out.println("Enviando mensagem");
        salvarHistoricoMensagem(); //Quando os métodos estão no private, so podem ser chamados na própria classe.
    }

    public void receberMensagem(){
        System.out.println("Recebendo mensagem");
    }

    //Quando colocamos a palavra reservada private em um método, estamos usando o encapsulamento.
    private void validarConectadoInternet(){
        System.out.println("Validando se esta conectado a internet");
    }

    //Quando colocamos a palavra reservada private em um método, estamos usando o encapsulamento.
    private void salvarHistoricoMensagem(){
        System.out.println("Salvando o historico da mensagem");
    }
}
