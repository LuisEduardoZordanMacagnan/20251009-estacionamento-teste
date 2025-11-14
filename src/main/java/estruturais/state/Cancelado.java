package estruturais.state;

public class Cancelado implements EstadoPedido{
    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Pedido cancelado");
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Pedido cancelado");
    }

    @Override
    public void entregar(Pedido pedido) {
        System.out.println("Pedido cancelado");
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Pedido cancelado");
    }

    @Override
    public void mostrarStatus() {
        System.out.println("Pedido cancelado");
    }
}
