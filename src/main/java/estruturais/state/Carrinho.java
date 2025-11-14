package estruturais.state;

public class Carrinho implements EstadoPedido {

    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Pagamento realizado. Aguardando confirmação...");
        pedido.setEstado(new AguardandoPagamento());
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Não é possível enviar. Pedido está no carrinho");
    }

    @Override
    public void entregar(Pedido pedido) {
        System.out.println("Não é possível enviar. Pedido está no carrinho");
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Pedido cancelado");
        pedido.setEstado(new Cancelado());
    }

    @Override
    public void mostrarStatus() {
        System.out.println("Pedido está no carrinho de compras");
    }
}
