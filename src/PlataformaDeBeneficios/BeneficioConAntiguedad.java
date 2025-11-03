package PlataformaDeBeneficios;

public class BeneficioConAntiguedad extends Beneficio{

    private final int antiguedadNecesaria;

    public BeneficioConAntiguedad(int valorEnPuntos, int antiguedadNecesaria) {
        this.valorEnPuntos = valorEnPuntos;
        this.antiguedadNecesaria = antiguedadNecesaria;
    }

    @Override
    public boolean puedeCanjearBeneficio(Empleado empleado) {
        return empleado.getAntiguedad() >= this.antiguedadNecesaria && empleado.getCantidadDePuntos() >= this.valorEnPuntos;
    }
}
