package ActividadClase2;

public class Asistente {

    private Pulsera pulsera;
    private String colorPulsera;

    public void recibirPulsera(Pulsera unaPulsera) {
        this.pulsera = unaPulsera;
    }

    public Pulsera quePulseraTenes() {
        return pulsera;
    }

    public void intercambiarPulsera(Asistente persona) {
        Pulsera pulsera1 = this.quePulseraTenes();
        Pulsera pulsera2 = persona.quePulseraTenes();
        this.recibirPulsera(pulsera2);
        persona.recibirPulsera(pulsera1);
    }
}
