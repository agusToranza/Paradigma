package ActividadClase1;

public class Main {
    public static void main(String[] args) {
        // Mas adelante vamos a ver mejor este tema
        Ascensor ascensorPrimeroDeIndepencia = new Ascensor();

        ascensorPrimeroDeIndepencia.abrirPuerta();
        System.out.println("Esta abierta la puerta???" + ascensorPrimeroDeIndepencia.estaAbiertaLaPuerta());
        System.out.println("En que piso estas?? " + ascensorPrimeroDeIndepencia.enQuePisoEstas());
        ascensorPrimeroDeIndepencia.andaAlPiso(10);
        System.out.println("En que piso estas?? " + ascensorPrimeroDeIndepencia.enQuePisoEstas());
        ascensorPrimeroDeIndepencia.cerrarPuerta();
        System.out.println("Esta abierta la puerta???" + ascensorPrimeroDeIndepencia.estaAbiertaLaPuerta());

        // CLASE 2

        Persona luca = new Persona();

        // Luca está en el 2do piso y quiere ir al 6to
        luca.estasEnPiso(2);
        luca.aQuePisoIr(6);

        ascensorPrimeroDeIndepencia.ingresa(luca);
        ascensorPrimeroDeIndepencia.comenzarRecorrido();

        System.out.println(ascensorPrimeroDeIndepencia.hayAlguienAdentro());
        System.out.println(ascensorPrimeroDeIndepencia.enQuePisoEstas());
    }
}
