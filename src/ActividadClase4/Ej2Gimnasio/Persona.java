package ActividadClase4.Ej2Gimnasio;

public class Persona {
    private int numeroDNI;
    private boolean tieneMembresia;
    private int cantidadActividadesQueRealiza;


    public Persona(int unDNI) {
        this.numeroDNI = unDNI;
    }

    public int queDNItenes(Persona unaPersona) {
        return this.numeroDNI;
    }

    public boolean tenesMembreseia() {
        return this.tieneMembresia;
    }

    public void entregarMembresia() {
        this.tieneMembresia = true;
    }

    public void puedeIncribirseActividad(Persona unaPersona) {

    }

    public void sumarActividad() {
        this.cantidadActividadesQueRealiza += 1;
    }

    public int cuantasActividadesHaces() {
        return this.cantidadActividadesQueRealiza;
    }

}
