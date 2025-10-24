package teste;

import lombok.*;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.UUID;


@Data
public class Ticket {
    public enum TipoVeiculo{
        CARRO, MOTO;
    }

    private String placa;
    private TipoVeiculo tipoVeiculo;
    private String uuid;
    private LocalDateTime dataHoraEntrada;
    private LocalDateTime dataHoraSaida;
    private Double valor;

    public Ticket(String placa, TipoVeiculo tipoVeiculo){
        uuid = UUID.randomUUID().toString();
        dataHoraEntrada = LocalDateTime.now();
        this.placa = placa;
        this.tipoVeiculo = tipoVeiculo;
    }

    public Long getHoras(){
        LocalDateTime saida;
        if ( dataHoraSaida != null ) saida = dataHoraSaida; else saida = LocalDateTime.now();
        Duration diferenca = Duration.between(dataHoraEntrada, saida);
        return diferenca.toHours();
    }

    public Long getDias(){
        LocalDateTime saida;
        if ( dataHoraSaida != null ) saida = dataHoraSaida; else saida = LocalDateTime.now();
        Duration diferenca = Duration.between(dataHoraEntrada, saida);
        return diferenca.toDays();
    }
}
