package PlataformaDeBeneficios;

import java.util.ArrayList;
import java.util.HashSet;

public class BeneficioIncompatible extends Beneficio{

    private final HashSet<Beneficio> beneficiosIncompatibles = new HashSet<>();

    @Override
    public boolean puedeCanjearBeneficio(Empleado empleado) {
        ArrayList<Beneficio> beneficiosCaneajdos = empleado.getBeneficiosCanjeados();
        int contador = 0;
        boolean puedeCanjear = true;
        for (Beneficio beneficio : beneficiosCaneajdos) {
            if (beneficiosIncompatibles.contains(beneficio)) {
                contador += 1;
                beneficiosCaneajdos.remove(beneficio);
            }
        }
        return contador < 1;
    }

    public void agregarBeneficiosIncompatibles(Beneficio beneficio) {
        this.beneficiosIncompatibles.add(beneficio);
    }

    public HashSet<Beneficio> getBeneficiosIncompatibles() {
        return beneficiosIncompatibles;
    }
}
