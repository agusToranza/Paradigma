package LolaPOOlooza;

import java.util.HashSet;

public class TicketCustom extends Ticket{

    private final HashSet<Artista> artistasPermitidos = new HashSet<>();

    public void agregarArtistaPermitido(Artista artista) {
        this.artistasPermitidos.add(artista);
    }

    @Override
    public boolean puedePresenciarBanda(Artista artista) {
        return artistasPermitidos.contains(artista);
    }

}
