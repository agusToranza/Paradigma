package LolaPOOlooza;

public class Artista {

    private Escenario escenario;
    private int dia;

    public Artista(Escenario escenario, int dia) {
        this.escenario = escenario;
        this.dia = dia;
    }

    public Escenario getEscenarioArtista() {
        return this.escenario;
    }

    public int getDiaArtista() {
        return this.dia;
    }
}
