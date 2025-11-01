package PlataformaDeBeneficios;

import java.util.ArrayList;

public class Empleado {

    private int cantidadDePuntos;
    private  int antiguedad;
    private int cantidadDiasPresencial;
    private final ArrayList<Beneficio> beneficiosCanjeados = new ArrayList<>();

    public int getCantidadDePuntos() {
        return this.cantidadDePuntos;
    }

    public void recibirPuntos(int cantidadPuntos) {
        this.cantidadDePuntos = cantidadPuntos;
    }

    public ArrayList<Beneficio> getBeneficiosCanjeados () {
        return this.beneficiosCanjeados;
    }
}
