package observador;

public class Atendente implements Observador{
    private String nome;
    public Atendente(String nome){
        this.nome = nome;
    }
    @Override
    public void atualizar(int senha) {
        System.out.println("Nova senha gerada: "+senha);
    }
}
