public class Main {
    public static void main(String[] args) {
        TicketController ticketController = TicketController.getInstance();
        Ticket t = new Ticket("AA-19", Ticket.TipoVeiculo.CARRO);
        TicketController.printTicket(t);
    }
}
