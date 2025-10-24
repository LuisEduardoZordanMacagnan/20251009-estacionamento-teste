package singleton;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Pessoa implements Cloneable{
    private String nome;
    private String telefone;

    @Override
    protected Pessoa clone() throws CloneNotSupportedException {
        return (Pessoa) super.clone();
    }
}
