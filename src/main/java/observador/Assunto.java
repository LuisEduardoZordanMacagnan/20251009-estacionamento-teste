package observador;

public interface Assunto {
    void adicionarObservador(Observador o);
    void removerObservador(Observador o);
    void notificarObservadores();
}
