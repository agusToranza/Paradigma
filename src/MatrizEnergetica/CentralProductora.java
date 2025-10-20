package MatrizEnergetica;

public abstract class CentralProductora {


    protected int capacidadMaxima;
    protected Propietario propietario;
    Ciudad ciudadDondeSeUbica;

    public abstract int getNivelDeEmision();

    public abstract int cantidadEnergiaAportada();

    public boolean superaMaximaPotencia() {
        return this.cantidadEnergiaAportada()  > this.capacidadMaxima;
    }
}
