package ActividadClase4.Ej1Impresoras;

public class ImpresoraECO extends Impresora {

    public ImpresoraECO(int cantidadCian, int cantidadMagenta, int cantidadAmarillo, int cantidadNegro, int cantidadHojas) {
        super(cantidadCian, cantidadMagenta, cantidadAmarillo, cantidadNegro, cantidadHojas);
    }

    @Override
    public boolean podesImprimir(Documento unDocumento) {
        return sumatoriaDeTintas(unDocumento) <= 10 && unDocumento.getCantidadHojasQueUsa() <= 10;
    }
}
