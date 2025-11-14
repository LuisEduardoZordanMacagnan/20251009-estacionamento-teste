package estruturais.facade.notificacoes;

public class EnvioEmail {
    public void enviarEmail(String mensagem,
                                   String destinatario,
                                   String assunto,
                                   String remetente){
        System.out.println("-".repeat(50));
        System.out.println("De: "+remetente);
        System.out.println("Para: "+destinatario);
        System.out.println("Assunto: "+assunto);
        System.out.println("-".repeat(50));
        System.out.println(mensagem);
        System.out.println("-".repeat(50));
    }
}
