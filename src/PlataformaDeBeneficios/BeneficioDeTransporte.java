package PlataformaDeBeneficios;

public class BeneficioDeTransporte extends Beneficio {

    public BeneficioDeTransporte(int valorPuntos) {
        this.valorEnPuntos = valorPuntos;
    }
    @Override
    public boolean puedeCanjearBeneficio(Empleado empleado) {
        return empleado.getCantidadDiasPresencial() >= 3 && empleado.getCantidadDePuntos() >= this.valorEnPuntos;
    }
}
