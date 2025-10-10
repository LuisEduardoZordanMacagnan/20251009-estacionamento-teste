import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class TicketController {
    public static final DateTimeFormatter FORMATADOR_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private static ArrayList<Ticket> tickets = new ArrayList<Ticket>();
    private static TicketController instance;

    private TicketController(){};

    public static TicketController getInstance(){
        if ( instance == null ){
            instance = new TicketController();
        }
        return instance;
    }

    static public Ticket registrarEntrada(String placa,
                                 Ticket.TipoVeiculo tipoVeiculo){
        Ticket ticket = new Ticket(placa, tipoVeiculo);
        tickets.add(ticket);
        return ticket;
    }

    public static void registrarSaida(String uuid) throws Exception {
        Ticket ticket = getTicket(uuid);
        LocalDateTime horaSaida = LocalDateTime.now();
        ticket.setDataHoraSaida(horaSaida);
        Double total = calculaValor(uuid);
        ticket.setValor(total);
        printTicket(ticket);
        LocalDateTime limite = horaSaida.plusMinutes(15);
        System.out.println("Tempo limite de saída: "+limite.format(FORMATADOR_DATA));
    }

    public static void printTicket(Ticket ticket){
        System.out.println("NOME ESTACIONAMENTO");
        System.out.println("SUBTITULO ESTACIONAMENTO");
        System.out.println();
        System.out.println("Id: "+ticket.getUuid());
        System.out.println("Placa: "+ticket.getPlaca());
        System.out.println("Tipo de Veículo: "+ticket.getTipoVeiculo());
        System.out.println("Entrada: "+ticket.getDataHoraEntrada().format(FORMATADOR_DATA));
    }

    public static Ticket getTicket(String uuid) throws Exception{
        for ( Ticket t : tickets ){
            if(t.getUuid().equals(uuid)){
                return t;
            }
        }
        throw  new Exception("Ticket "+uuid+" não encontrado");
    }

    public static Double calculaValor(String uuid) throws Exception {
        Ticket t = getTicket(uuid);
        long horas = t.getHoras();
        Double total = 0d;

        if ( horas <= 24 ){
            total = 15d;
            if ( horas > 4 ) {
                long horaAdicional = horas - 4;
                total += horaAdicional*3;
            }
        } else {
            total = t.getDias() * 100d;
        }

        return t.getTipoVeiculo()== Ticket.TipoVeiculo.CARRO?total:total/2;
    }
}
