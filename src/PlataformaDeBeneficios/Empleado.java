package PlataformaDeBeneficios;

import java.util.ArrayList;

public class Empleado {

    private int cantidadDePuntos;
    private int antiguedad;
    private int cantidadDiasPresencial;
    private final ArrayList<Beneficio> beneficiosCanjeados = new ArrayList<>();

    public Empleado(int cantidadDePuntos, int antiguedad, int cantidadDiasPresencial) {
        this.cantidadDePuntos = cantidadDePuntos;
        this.antiguedad = antiguedad;
        this.cantidadDiasPresencial = cantidadDiasPresencial;
    }

    public int getCantidadDePuntos() {
        return this.cantidadDePuntos;
    }

    public void recibirPuntos(int cantidadPuntos) {
        this.cantidadDePuntos = cantidadPuntos;
    }

    public ArrayList<Beneficio> getBeneficiosCanjeados () {
        return this.beneficiosCanjeados;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public int getCantidadDiasPresencial() {
        return cantidadDiasPresencial;
    }

    public void canjearBeneficio(Beneficio beneficio) {
        if (beneficio.puedeCanjearBeneficio(this)) {
            this.cantidadDePuntos -= beneficio.getValorEnPuntos();
            beneficiosCanjeados.add(beneficio);
        }
    }

    public Beneficio beneficioMasCaroEnPuntos() {
        Beneficio beneficioMasCostoso = beneficiosCanjeados.getFirst();
        for (Beneficio beneficio : beneficiosCanjeados) {
            if (beneficio.getValorEnPuntos() > beneficioMasCostoso.getValorEnPuntos()) {
                beneficioMasCostoso = beneficio;
            }
        }
        return beneficioMasCostoso;
    }
}
