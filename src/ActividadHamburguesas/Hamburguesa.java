package ActividadHamburguesas;

import java.util.ArrayList;

public class Hamburguesa {

    private Pan tipoPan;

    private final ArrayList<Medallon> medallones = new ArrayList<>();
    private final ArrayList<Adicional> adicionales = new ArrayList<>();

    public void agregarMedallon(Medallon unMedallon) {
        medallones.add(unMedallon);
    }

    private int cantidadDeMedallones() {
        return this.medallones.size();
    }

    private int getPrecioTotalMedallon() {
        int total = 0;
        for (Medallon medallon : medallones) {
            total += medallon.getPrecioMedallon();
        }
        return total;
    }

    public void agregarAdicional(Adicional unAdicional) {
        adicionales.add(unAdicional);
    }

    private int cantidadDeAdicionales() {
        return this.adicionales.size();
    }

    private int getPrecioTotalAdicional() {
        int total = 0;
        for (Adicional adicional : adicionales) {
            total += adicional.getPrecioAdicional();
        }
        return total;
    }

    public boolean puedeFacturarse() {
        return (this.cantidadDeMedallones() >= 1 && this.cantidadDeAdicionales() <= this.cantidadDeMedallones());
    }

    private int precioBase() {
        return tipoPan.getPrecioPan();
    }

    public void setPan(Pan unPan) {
        this.tipoPan = unPan;
    }

    public int precioTotalHamburguesa () {
        int total = 0;
        if (this.puedeFacturarse()) {
            total += this.getPrecioTotalMedallon() + this.getPrecioTotalAdicional() + this.precioBase();
            System.out.println();
        }
        return total;
    }
}
