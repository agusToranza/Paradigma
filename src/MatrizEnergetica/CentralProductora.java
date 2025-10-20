package MatrizEnergetica;

import java.util.HashSet;

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
