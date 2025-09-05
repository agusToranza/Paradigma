package ActividadClase4.Ej1Impresoras;

public class ImpresoraByN extends Impresora {

    public ImpresoraByN(int cantidadNegro, int cantidadHojas) {
        super(0,0,0, cantidadNegro, cantidadHojas);
    }

    @Override
    public Documento imprimi(Documento unDocumento) {
        if (podesImprimir(unDocumento)) {
            unDocumento.fueImpreso();
            this.incrementarContadores(unDocumento);
            this.actualizarTinta(unDocumento);
        }
        return unDocumento;
    }

    private void actualizarTinta(Documento unDocumento) {
        this.cantidadNegro = cantidadNegro - sumatoriaDeTintas(unDocumento);
    }

    @Override
    public boolean podesImprimir(Documento unDocumento) {
        return hayTintaNegraSuficiente(unDocumento) && hayHojasSuficientes(unDocumento);
    }

    private boolean hayTintaNegraSuficiente(Documento unDocumento) {
        return sumatoriaDeTintas(unDocumento) <= cantidadNegro;
    }

    private boolean hayHojasSuficientes(Documento unDocumento) {
        return unDocumento.getCantidadHojasQueUsa() <= cantidadHojas;
    }

}
