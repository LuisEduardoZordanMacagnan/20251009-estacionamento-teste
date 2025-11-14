package estruturais.facade.notificacoes;

public class EnvioSMS {
    public void enviarSMS(String mensagem,
                                 String destinatario){
        System.out.println("-".repeat(30));
        System.out.println("Para: "+destinatario);
        System.out.println("-".repeat(30));
        System.out.println(mensagem);
        System.out.println("-".repeat(30));
    }
}
