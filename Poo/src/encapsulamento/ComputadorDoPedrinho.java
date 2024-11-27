public class ComputadorDoPedrinho {
    public static void main(String[] args) {
        //Abrindo MSN Messenger
        MSNMessenger msn = new MSNMessenger();

        // msn.validarConectadoInternet();
        msn.enviarMensagem();
        // msn.salvarHistoricoMensagem();
        msn.receberMensagem();
    }
}
