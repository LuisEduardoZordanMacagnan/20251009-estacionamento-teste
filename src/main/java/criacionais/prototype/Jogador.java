package criacionais.prototype;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Jogador implements Cloneable {
    public enum Posicao {
        GOLEIRO,
        ZAGUEIRO,
        LATERAL_DIREITO,
        LATERAL_ESQUERDO,
        MEIO_CAMPO,
        CENTRO_AVANTE,
        ATACANTE
    }

    public enum Categoria {
        INFANTIL, JUVENIL, ADULTO
    }

    private int idade;
    private Categoria categoria;
    private Posicao posicao;
    private int numeroCamisa;
    private String nome;
    private double altura;
    private double peso;

    @Override
    protected Jogador clone() throws CloneNotSupportedException {
        return (Jogador) super.clone();
    }
}
