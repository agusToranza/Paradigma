package ActividadClase4.Ej2Gimnasio;

public class Persona {
    private int numeroDNI;
    boolean tieneMembresia;
    Membresia queMembresiaTiene;


    public  Persona (int unDNI) {
        this.numeroDNI = unDNI;
    }

    public int queDNItenes(Persona unaPersona) {
        return this.numeroDNI;
    }

    public boolean tenesMembreseia(Persona unaPersona) {
        return tieneMembresia;
    }

    public void entregarMembresia(Persona unaPersona) {
        this.tieneMembresia = true;
    }

    public void puedeIncribirseActividad(Persona unaPersona) {

    }

    public void tipoMembresia(Membresia tipo) {
        this.queMembresiaTiene = tipo;
    }
}
