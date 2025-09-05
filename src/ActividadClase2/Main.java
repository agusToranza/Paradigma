package ActividadClase2;

public class Main {
    public static void main(String[] args) {

        Pulsera pulseraAzul = new Pulsera();
        pulseraAzul.establecerPrecio(7000);

        Pulsera pulseraVerde = new Pulsera();
        pulseraVerde.establecerPrecio(0);

        Evento conferenciaAlanKay = new Evento();

        Asistente martin = new Asistente();
        martin.recibirPulsera(pulseraAzul);
        Asistente agustin = new Asistente();
        agustin.recibirPulsera(pulseraVerde);

        System.out.println(conferenciaAlanKay.cuantoPaga(martin));
        System.out.println(conferenciaAlanKay.cuantoPaga(agustin));

        System.out.println("Martin: " + martin.quePulseraTenes()); // 7000
        System.out.println("Agustin: " + agustin.quePulseraTenes()); // 0

        agustin.intercambiarPulsera(martin);

        System.out.println("Martin: " + martin.quePulseraTenes()); // 7000
        System.out.println("Agustin: " + agustin.quePulseraTenes()); // 7000
    }
}
