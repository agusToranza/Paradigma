package PruebasParcial1.Mascotas;

public class Persona {
    private Mascota mascota;
    private Persona pareja;

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Persona getPareja() {
        return pareja;
    }

    public void setPareja(Persona pareja) {
        this.pareja = pareja;
    }
}
