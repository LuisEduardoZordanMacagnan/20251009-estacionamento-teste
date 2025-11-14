package observador;

public class PainelSenha implements Observador{
    @Override
    public void atualizar(int senha) {
        System.out.println("PAINEL: SENHA "+senha);
    }
}
