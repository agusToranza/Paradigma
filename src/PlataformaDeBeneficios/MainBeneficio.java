package PlataformaDeBeneficios;

public class MainBeneficio {
    public static void main(String[] args) {

        Empleado facundo = new Empleado(10000, 30, 2);
        BeneficioConAntiguedad viajeAEuropa = new BeneficioConAntiguedad(400, 30);
        BeneficioDeTransporte voucherCombustible = new BeneficioDeTransporte(100);
        BeneficioConLimite semanaExtraVacaciones = new BeneficioConLimite(200, 1);
        BeneficioConLimite diaExtraVacaciones = new BeneficioConLimite(50, 3);

        System.out.println(viajeAEuropa.puedeCanjearBeneficio(facundo));
        System.out.println(voucherCombustible.puedeCanjearBeneficio(facundo));
        System.out.println(facundo.getCantidadDePuntos());

        facundo.canjearBeneficio(viajeAEuropa);
        facundo.canjearBeneficio(voucherCombustible);

        System.out.println(facundo.getCantidadDePuntos());
        System.out.println(facundo.getBeneficiosCanjeados());

        BeneficioIncompatible beneficioIncompatible = new BeneficioIncompatible();
        beneficioIncompatible.agregarBeneficiosIncompatibles(semanaExtraVacaciones);
        beneficioIncompatible.agregarBeneficiosIncompatibles(diaExtraVacaciones);

        facundo.canjearBeneficio(semanaExtraVacaciones);
        System.out.println(diaExtraVacaciones.puedeCanjearBeneficio(facundo));
    }
}
