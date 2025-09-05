package ActividadClase4.Ej1Impresoras;

public class Impresora {
    private int cantidadCian;
    private int cantidadMagenta;
    private int cantidadAmarillo;
    protected int cantidadNegro;
    protected int cantidadHojas;
    protected int contadorDeHojas;
    protected int contadorDeDocumentos;

    public Impresora (int cantidadCian, int cantidadMagenta, int cantidadAmarillo, int cantidadNegro, int cantidadHojas) {
        this.cantidadCian = cantidadCian;
        this.cantidadMagenta = cantidadMagenta;
        this.cantidadAmarillo = cantidadAmarillo;
        this.cantidadNegro = cantidadNegro;
        this.cantidadHojas = cantidadHojas;
    }


    public void recargarTodo() {
        this.cantidadCian = 1000;
        this.cantidadMagenta = 1000;
        this.cantidadAmarillo = 1000;
        this.cantidadNegro = 1000;
        this.cantidadHojas = 500;
    }

    /*
    Indica si puede imprimir un documento que recibe por parámetro. Para esto
    es necesario comprobar que cada uno de los colores y las hojas alcancen para imprimir el
    documento completo. Si no es posible imprimir el documento no es de interés saber el motivo.
     */
    public boolean podesImprimir (Documento unDocumento) {
        return hayTinta(unDocumento) && hayHojas(unDocumento);
    }

    private boolean hayTinta(Documento unDocumento) {
        return (
            cantidadCian >= unDocumento.getConsumoDeCian() && cantidadMagenta >= unDocumento.getConsumoDeMagenta()
                && cantidadAmarillo >= unDocumento.getConsumoDeAmarillo() && cantidadNegro >= unDocumento.getConsumoDeNegro()
        );
    }

    private boolean hayHojas(Documento unDocumento) {
        return cantidadHojas >= unDocumento.getCantidadHojasQueUsa();
    }

    /*
    Recibe un documento y devuelve el mismo documento pero marcado como impreso
     */
    public Documento imprimi (Documento unDocumento) {
        if (podesImprimir(unDocumento)) {
            unDocumento.fueImpreso();
            this.actualizarConsumoImpresora(unDocumento);
            this.incrementarContadores(unDocumento);
        }
        return unDocumento;
    }

    protected void incrementarContadores(Documento unDocumento) {
        contadorDeDocumentos += 1;
        contadorDeHojas += unDocumento.getCantidadHojasQueUsa();
    }

    protected void actualizarConsumoImpresora(Documento unDocumento) {
        cantidadCian = cantidadCian - unDocumento.getConsumoDeCian();
        cantidadMagenta = cantidadMagenta - unDocumento.getConsumoDeMagenta();
        cantidadAmarillo = cantidadAmarillo - unDocumento.getConsumoDeAmarillo();
        cantidadNegro = cantidadNegro - unDocumento.getConsumoDeNegro();
        cantidadHojas = cantidadHojas - unDocumento.getCantidadHojasQueUsa();
    }

    protected int sumatoriaDeTintas(Documento unDocumento) {
        return unDocumento.getConsumoDeCian() + unDocumento.getConsumoDeMagenta() + unDocumento.getConsumoDeAmarillo()
                + unDocumento.getConsumoDeNegro();
    }

    public int cuantoDeCianTeQueda() {
        return this.cantidadCian;
    }

    public int cuantoDeMagentaTeQueda() {
        return this.cantidadMagenta;
    }

    public int cuantoDeAmarilloTeQueda() {
        return this.cantidadAmarillo;
    }

    public int cuantoDeNegroTeQueda() {
        return this.cantidadNegro;
    }

    public int cuantasHojasTeQuedan() {
        return this.cantidadHojas;
    }

    @Override
    public String toString() {
        return "Impresora{" +
                "cantidadCian=" + cantidadCian +
                ", cantidadMagenta=" + cantidadMagenta +
                ", cantidadAmarillo=" + cantidadAmarillo +
                ", cantidadNegro=" + cantidadNegro +
                ", cantidadHojas=" + cantidadHojas +
                ", contadorDeHojas=" + contadorDeHojas +
                ", contadorDeDocumentos=" + contadorDeDocumentos +
                '}';
    }
}
