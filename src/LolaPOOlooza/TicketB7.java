package LolaPOOlooza;

import java.util.HashSet;

public class TicketB7 extends TicketB3 {


    @Override
    public boolean puedePresenciarBanda(Artista artista) {
        artistasPresenciados.add(artista);
        return artistasPresenciados.size() <= 7;
    }
}
