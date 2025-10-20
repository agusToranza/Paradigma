package MatrizEnergetica;

public class ParqueEolico extends CentralProductora{

    private final int cantidadGeneradores;

    public ParqueEolico(int capacidadMaxima, int cantidadGeneradores, Ciudad ciudad, Propietario propietario) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadGeneradores = cantidadGeneradores;
        this.propietario = propietario;
        propietario.agregarCentral(this);
        this.ciudadDondeSeUbica = ciudad;
        ciudad.agregarCentral(this);
    }

    @Override
    public int cantidadEnergiaAportada() {
        return this.cantidadGeneradores * 13;
    }

    @Override
    public int getNivelDeEmision() {
        return 0;
    }

}
