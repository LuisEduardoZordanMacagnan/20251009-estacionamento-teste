package estruturais.state;

public class AguardandoPagamento implements EstadoPedido{

    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Pedido pago");
        pedido.setEstado(new EmSeparacao());
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Necessário pagamento para envio");
    }

    @Override
    public void entregar(Pedido pedido) {
        System.out.println("Necessário pagamento para entrega");
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Pedido cancelado");
        pedido.setEstado(new Cancelado());
    }

    @Override
    public void mostrarStatus() {
        System.out.println("Pedido aguardando pagamento");
    }
}
