package estruturais.state;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Pedido {
    private String email;
    private LocalDateTime data;
    private String descricao;
    private EstadoPedido estado;

    public void setEstado(EstadoPedido estado){
        this.estado = estado;
    }

    public void pagar(){
        estado.pagar(this);
    }

    public void enviar(){
        estado.enviar(this);
    }
    public void entregar(Pedido pedido){
        estado.entregar(this);
    }
    public void cancelar(Pedido pedido){
        estado.cancelar(this);
    }
    public void mostrarStatus(){
        estado.mostrarStatus();
    }
}
