package PlataformaDeBeneficios;

import java.util.ArrayList;

public class BeneficioConLimite extends Beneficio {

    private int cantidadVecesPermitidas;

    @Override
    public boolean puedeCanjearBeneficio(Empleado empleado) {
        ArrayList<Beneficio> beneficios = empleado.getBeneficiosCanjeados();
        int contador = 0;
        for (Beneficio beneficio : beneficios) {
            if (beneficio.equals(this)) {
                contador += 1;
            }
        }
        return contador <  cantidadVecesPermitidas;
    }
}
