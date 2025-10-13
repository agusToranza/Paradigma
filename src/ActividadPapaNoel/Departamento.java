package ActividadPapaNoel;

public class Departamento extends Domicilio{
    private String nombre;
    private boolean ventanaAbierta;

    public Departamento(String nombre, Barrio barrio, boolean ventanaAbierta) {
        this.nombre = nombre;
        this.setBarrio(barrio);
        this.ventanaAbierta = ventanaAbierta;
    }

    @Override
    public boolean puedeIngresar() {
        return this.ventanaAbierta;
    }

    public void abrirVentana() {
        this.ventanaAbierta = true;
    }

    public void cerrarVentana() {
        this.ventanaAbierta = false;
    }

    public boolean puedeVisitar() {
        return this.ventanaAbierta;
    }

}
