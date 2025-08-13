public class Main {
    public static void main(String[] args) {
        // Mas adelante vamos a ver mejor este tema
        ascensor ascensorPrimeroDeIndepencia = new ascensor();

        ascensorPrimeroDeIndepencia.abrirPuerta();
        System.out.println("Esta abierta la puerta???" + ascensorPrimeroDeIndepencia.estaAbiertaLaPuerta());
        System.out.println("En que piso estas?? " + ascensorPrimeroDeIndepencia.enQuePisoEstas());
        ascensorPrimeroDeIndepencia.andaAlPiso(10);
        System.out.println("En que piso estas?? " + ascensorPrimeroDeIndepencia.enQuePisoEstas());
        ascensorPrimeroDeIndepencia.cerrarPuerta();
        System.out.println("Esta abierta la puerta???" + ascensorPrimeroDeIndepencia.estaAbiertaLaPuerta());
    }
}
