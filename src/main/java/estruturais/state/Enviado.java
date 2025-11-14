package estruturais.state;

public class Enviado implements EstadoPedido{
    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Pedido já pago");
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Pedido já enviado");
    }

    @Override
    public void entregar(Pedido pedido) {
        System.out.println("Pedido entregue");
        pedido.setEstado(new Entregue());
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Pedido não pode ser cancelado");
    }

    @Override
    public void mostrarStatus() {
        System.out.println("Pedido está sendo enviado");
    }
}
