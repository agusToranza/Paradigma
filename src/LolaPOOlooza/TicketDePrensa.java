package LolaPOOlooza;

public class TicketDePrensa extends Ticket {

    @Override
    public boolean puedePresenciarBanda(Artista artista) {
        Escenario escenario = artista.getEscenarioArtista();
        return escenario.tieneLugarParaPrensa();
    }
}
