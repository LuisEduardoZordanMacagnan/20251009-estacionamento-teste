package estruturais.facade.notificacoes;

public class Main {
    public static void main(String[] args) {
        NotificacaoFacade nf = NotificacaoFacade.getInstancia();

        nf.enviarEmail("Olá, isso é um teste", "voce@teste.com", "Teste", "eu@teste.com");
        System.out.println();
        System.out.println();
        nf.enviarSMS("Olá amigo", "47912345678");
        System.out.println();
        System.out.println();
        nf.enviarSMSNotificacao("Notificação", "47987654321");
    }
}
