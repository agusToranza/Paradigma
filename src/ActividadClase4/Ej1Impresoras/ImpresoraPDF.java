package ActividadClase4.Ej1Impresoras;

public class ImpresoraPDF extends Impresora {

    public ImpresoraPDF() {
        super(0, 0, 0, 0, 0);
    }

    @Override
    public boolean podesImprimir(Documento unDocumento) {
        return quedanHojas(unDocumento) && quedanDocumentos(unDocumento);
    }

    @Override
    public Documento imprimi(Documento unDocumento) {
        if (podesImprimir(unDocumento)) {
            unDocumento.fueImpreso();
            this.incrementarContadores(unDocumento);
        }
        return unDocumento;
    }

    private boolean quedanHojas(Documento unDocumento) {
        return this.contadorDeHojas + unDocumento.getCantidadHojasQueUsa() <= 10000;
    }

    private boolean quedanDocumentos(Documento unDocumento) {
        return this.contadorDeDocumentos <= 500;
    }
}
