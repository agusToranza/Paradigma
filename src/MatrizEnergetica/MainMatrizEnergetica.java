package MatrizEnergetica;

public class MainMatrizEnergetica {
    public static void main(String[] args) {

        Ciudad buenosAires = new Ciudad();
        Ciudad avellaneda = new Ciudad();
        Ciudad zarate = new Ciudad();
        Ciudad chubut = new Ciudad();
        Ciudad springfield = new Ciudad();

        Propietario agustin = new Propietario(452339902, "Agustin");
        Propietario marcelo = new Propietario(14824499, "Marcelo");
        Propietario susana = new Propietario(18369524, "Susana");

        ParqueEolico parqueChubut = new ParqueEolico(500, 12, chubut, susana);
        CentralNuclear centralSpringfield = new CentralNuclear(200, zarate, marcelo);
        CentralNuclear centralZarate = new CentralNuclear(600, zarate, agustin);

        Reactor reactor1 = new Reactor(150);
        Reactor reactor2 = new Reactor(92);
        centralSpringfield.agregarReactor(reactor1);
        centralSpringfield.agregarReactor(reactor2);
        Reactor reactor3 = new Reactor(200);
        Reactor reactor4 = new Reactor(150);
        Reactor reactor5 = new Reactor(250);
        centralZarate.agregarReactor(reactor3);
        centralZarate.agregarReactor(reactor4);
        centralZarate.agregarReactor(reactor5);

        Consumidor nasa = new Consumidor(200, "NASA", zarate);
        Consumidor vanguardia = new Consumidor(100, "Vanguardia", zarate);
        Consumidor ypf = new Consumidor(300, "YPF", chubut);

        System.out.println("Energia aportada por Sprinfield: " + centralSpringfield.cantidadEnergiaAportada());
        System.out.println("Emision producida por Sprinfield: " + centralSpringfield.getNivelDeEmision());

        System.out.println("Energia aportada por parque eolico Chubut: " + parqueChubut.cantidadEnergiaAportada());
        System.out.println("Emision producida por parque eolico Chubut : " + parqueChubut.getNivelDeEmision());

        System.out.println("Consumo total en Zarate: " + zarate.consumoTotalCiudad());

        System.out.println("Es una ciudad eficiente (Zarate): " + zarate.esUnaCiudadEficiente());
        System.out.println("Es una ciudad eficiente (Chubut): " + chubut.esUnaCiudadEficiente());

        System.out.println("Propietarios en Zarate: " + zarate.propietariosEnLaCiudad());

        System.out.println("Es una ciudad sustentable (Zarate): " + zarate.esUnaCiudadSustentable());
        System.out.println("Es una ciudad sustentable (Chubut): " + chubut.esUnaCiudadSustentable());

        System.out.println("Es una ciudad potencialmente peligrosa (Zarate): " + zarate.esUnaCiudadPotencialmentePeligrosa());

        System.out.println("Centrales contaminantes en Zarate: " + zarate.getCentralesContaminates());
    }
}
