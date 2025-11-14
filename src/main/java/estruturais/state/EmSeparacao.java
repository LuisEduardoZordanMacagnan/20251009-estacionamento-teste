package estruturais.state;

public class EmSeparacao implements EstadoPedido{
    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Pedido já pago");
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Pedido enviado");
        pedido.setEstado(new Enviado());
    }

    @Override
    public void entregar(Pedido pedido) {
        System.out.println("Pedido precisa ser enviado para ser entregado");
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Pedido não pode ser cancelado");
    }

    @Override
    public void mostrarStatus() {
        System.out.println("Pedido em separação");
    }
}
