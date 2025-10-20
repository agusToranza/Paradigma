package LolaPOOlooza;

public class TicketFan extends Ticket {

    private final Artista artistaPermitido;

    public TicketFan(Artista artista) {
        this.artistaPermitido = artista;
    }
    @Override
    public boolean puedePresenciarBanda(Artista artista) {
        return artista == artistaPermitido;
    }
}
