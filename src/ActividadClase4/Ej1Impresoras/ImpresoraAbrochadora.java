package ActividadClase4.Ej1Impresoras;

public class ImpresoraAbrochadora extends Impresora{
    public ImpresoraAbrochadora(int cantidadCian, int cantidadMagenta, int cantidadAmarillo, int cantidadNegro, int cantidadHojas) {
        super(cantidadCian, cantidadMagenta, cantidadAmarillo, cantidadNegro, cantidadHojas);
    }

    @Override
    public Documento imprimi(Documento unDocumento) {
        // Necesito hacer lo que hacia impresora pero agregando más funciones (se usa super)

        super.imprimi(unDocumento);  // Se imprime el documento pero no se abrocha
        unDocumento.abrochar();
        return unDocumento;
    }
}
