package LolaPOOlooza;

public class TicketGeneralPorDia extends Ticket {

    private final int diaPermitido;

    public TicketGeneralPorDia(int diaPermitido) {
        this.diaPermitido = diaPermitido;
    }

    @Override
    public boolean puedePresenciarBanda(Artista artista) {
        return artista.getDiaArtista() == diaPermitido;
    }

}
