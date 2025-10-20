package LolaPOOlooza;

import java.util.HashSet;

public class TicketB3 extends Ticket{

    protected final HashSet<Artista> artistasPresenciados = new HashSet<>();

    @Override
    public boolean puedePresenciarBanda(Artista artista) {
        artistasPresenciados.add(artista);
        return artistasPresenciados.size() <= 3;
    }

}
