package ActividadPapaNoel;

public class Casa extends Domicilio{
    private String nombre;
    private boolean tieneChimenea;

    public Casa (String nombre, Barrio barrio, boolean chimenea) {
        this.nombre = nombre;
        setBarrio(barrio);
        this.tieneChimenea = chimenea;
    }

    @Override
    public boolean puedeIngresar() {
        return this.tieneChimenea;
    }

    public void agregarChimenea() {
        this.tieneChimenea = true;
    }

    public void quitarChimenea() {
        this.tieneChimenea = false;
    }

    public boolean puedeVisitar() {
        return this.tieneChimenea;
    }
}
