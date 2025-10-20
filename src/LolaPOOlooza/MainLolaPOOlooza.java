package LolaPOOlooza;

public class MainLolaPOOlooza {
    public static void main(String[] args) {

        Escenario escenario1 = new Escenario(true);
        Escenario escenario2 = new Escenario(false);

        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();
        Persona persona4 = new Persona();
        Persona persona5 = new Persona();
        Persona persona6 = new Persona();
        Persona persona7 = new Persona();

        Artista artista1 = new Artista(escenario1, 2);
        Artista artista2 = new Artista(escenario2, 3);
        Artista artista3 = new Artista(escenario1, 1);
        Artista artista4 = new Artista(escenario2, 2);
        Artista artista5 = new Artista(escenario2, 1);
        Artista artista6 = new Artista(escenario2, 3);
        Artista artista7 = new Artista(escenario2, 2);
        Artista artista8 = new Artista(escenario2, 3);

        TicketGeneralPorDia ticketGrlDia = new TicketGeneralPorDia(2);

        persona2.entregarTicket(ticketGrlDia);
        System.out.println("Ticket General por Dia: " + persona2.puedePresenciarBanda(artista1));
        System.out.println("Ticket General por Dia: " + persona2.puedePresenciarBanda(artista2));

        TicketB3 ticketB3 = new TicketB3();

        persona1.entregarTicket(ticketB3);
        System.out.println("TicketB3: " + persona1.puedePresenciarBanda(artista1));
        System.out.println("TicketB3: " + persona1.puedePresenciarBanda(artista2));
        System.out.println("TicketB3: " + persona1.puedePresenciarBanda(artista3));
        System.out.println("TicketB3: " + persona1.puedePresenciarBanda(artista4));

        TicketCustom ticketCustom = new TicketCustom();
        ticketCustom.agregarArtistaPermitido(artista1);
        ticketCustom.agregarArtistaPermitido(artista4);

        persona3.entregarTicket(ticketCustom);
        System.out.println("Ticket Custom: " + persona3.puedePresenciarBanda(artista1));
        System.out.println("Ticket Custom: " +persona3.puedePresenciarBanda(artista2));

        TicketFan ticketFan = new TicketFan(artista3);

        persona4.entregarTicket(ticketFan);
        System.out.println("Ticket Fan: " + persona4.puedePresenciarBanda(artista3));
        System.out.println("Ticket Fan: " + persona4.puedePresenciarBanda(artista1));

        TicketPlus ticketPlus = new TicketPlus();

        persona5.entregarTicket(ticketPlus);
        System.out.println("Ticket Plus: " + persona5.puedePresenciarBanda(artista1));
        System.out.println("Ticket Plus: " + persona5.puedePresenciarBanda(artista2));
        System.out.println("Ticket Plus: " + persona5.puedePresenciarBanda(artista3));

        TicketDePrensa ticketDePrensa = new TicketDePrensa();

        persona6.entregarTicket(ticketDePrensa);
        System.out.println("Ticket de Prensa: " + persona6.puedePresenciarBanda(artista1));
        System.out.println("Ticket de Prensa: " + persona6.puedePresenciarBanda(artista2));

        TicketB7 ticketB7 = new TicketB7();

        persona7.entregarTicket(ticketB7);
        System.out.println(("Ticket B7: " + persona7.puedePresenciarBanda(artista1)));
        System.out.println(("Ticket B7: " + persona7.puedePresenciarBanda(artista2)));
        System.out.println(("Ticket B7: " + persona7.puedePresenciarBanda(artista3)));
        System.out.println(("Ticket B7: " + persona7.puedePresenciarBanda(artista4)));
        System.out.println(("Ticket B7: " + persona7.puedePresenciarBanda(artista5)));
        System.out.println(("Ticket B7: " + persona7.puedePresenciarBanda(artista6)));
        System.out.println(("Ticket B7: " + persona7.puedePresenciarBanda(artista7)));
        System.out.println(("Ticket B7: " + persona7.puedePresenciarBanda(artista8)));


    }
}
