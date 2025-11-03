package PlataformaDeBeneficios;

public abstract class Beneficio {

    protected int valorEnPuntos;

    public abstract boolean puedeCanjearBeneficio(Empleado empleado);

    public int getValorEnPuntos() {
        return this.valorEnPuntos;
    }

}
