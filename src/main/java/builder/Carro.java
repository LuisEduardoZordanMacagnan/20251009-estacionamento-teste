package builder;

import lombok.Data;

@Data
public class Carro {
    private String placa;
    private String marca;
    private int anoFabricacao;
    private int anoModelo;
    private String chassi;
    private Motorista motorista;
}


