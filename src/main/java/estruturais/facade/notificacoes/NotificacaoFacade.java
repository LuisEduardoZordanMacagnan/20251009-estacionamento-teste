package estruturais.facade.notificacoes;

public class NotificacaoFacade {
    private static NotificacaoFacade instancia;
    private EnvioEmail envioEmail;
    private EnvioSMS envioSMS;
    private EnvioPushNotificacao envioPushNotificacao;

    private NotificacaoFacade(){
        envioEmail = new EnvioEmail();
        envioSMS = new EnvioSMS();
        envioPushNotificacao = new EnvioPushNotificacao();
    };

    public static NotificacaoFacade getInstancia(){
        if ( instancia == null ) instancia = new NotificacaoFacade();
        return instancia;
    }

    public void enviarEmail(String mensagem,
                            String destinatario,
                            String assunto,
                            String remetente){
        envioEmail.enviarEmail(mensagem, destinatario, assunto, remetente);
    }

    public void enviarSMS(String mensagem,
                          String destinatario){
        envioSMS.enviarSMS(mensagem, destinatario);
    }

    public void enviarSMSNotificacao(String assunto,
                                 String destinatario){
        envioPushNotificacao.enviarSMS(assunto, destinatario);
    }
}
