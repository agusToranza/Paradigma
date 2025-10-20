package LolaPOOlooza;

public class Persona {

    private Ticket ticketQueTiene;

    public void entregarTicket(Ticket ticket) {
        this.ticketQueTiene = ticket;
    }

    public boolean puedePresenciarBanda(Artista artista) {
        if (ticketQueTiene == null) {
            return false;
        } else {
            return this.ticketQueTiene.puedePresenciarBanda(artista);
        }
    }
}
