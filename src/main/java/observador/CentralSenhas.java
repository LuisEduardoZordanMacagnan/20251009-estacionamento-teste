package observador;

import java.util.ArrayList;

public class CentralSenhas implements Assunto {
    private static CentralSenhas instance;
    private ArrayList<Observador> observadores = new ArrayList<Observador>();
    private Integer senhaAtual;

    private CentralSenhas(){};

    public static CentralSenhas getInstance(){
        if ( instance == null ) instance = new CentralSenhas();
        return instance;
    }

    @Override
    public void adicionarObservador(Observador o) {
        observadores.add(o);
    }

    @Override
    public void removerObservador(Observador o) {
        observadores.remove(o);
    }

    @Override
    public void notificarObservadores() {
        for(Observador o : observadores){
            o.atualizar(senhaAtual);
        }
    }

    public void gerarNovaSenha(){
        senhaAtual++;
        System.out.println("[Central] Nova senha emitida: "+senhaAtual);
        notificarObservadores();
    }
}
