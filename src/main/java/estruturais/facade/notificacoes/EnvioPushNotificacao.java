package estruturais.facade.notificacoes;

public class EnvioPushNotificacao {
    public void enviarSMS(String assunto,
                                 String destinatariom){
        System.out.println("Push Notification");
        System.out.println("-".repeat(30));
        System.out.println(destinatariom+".".repeat(10));
        System.out.println(assunto);
        System.out.println("-".repeat(30));
    }
}
