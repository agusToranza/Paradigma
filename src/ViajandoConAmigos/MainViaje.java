package ViajandoConAmigos;

public class MainViaje {
    public static void main(String[] args) {

        Viajero martin = new Viajero(19);
        Viajero matias = new Viajero(20);
        Viajero nico = new Viajero(18);

        GrupoDeAmigos secundaria = new GrupoDeAmigos(2200);
        secundaria.agregarIntegranteAlGrupo(martin);
        secundaria.agregarIntegranteAlGrupo(matias);
        secundaria.agregarIntegranteAlGrupo(nico);

        Destino buenosAires = new Destino("Buenos Aires", 0);
        Destino mendoza = new Destino("Mendoza", 7);
        Destino bariloche = new Destino("Bariloche", 0);
        Destino marDelPlata = new Destino("Mar del Plata",0);

        Actividad cataDeVinos = new ActividadConEdadMinima("Cata de vinos",18, 245, mendoza);
        Actividad parapente = new ActividadPrivada("Parapente", 500, 4, marDelPlata);
        Actividad paseoEnVelero = new ActividadPrivada("Paseo en velero", 720, 6, buenosAires);

        PaqueteGrupal paqueteParaSecundaria = new PaqueteGrupal(secundaria);

        paqueteParaSecundaria.agregarDestino(buenosAires, 2);
        paqueteParaSecundaria.agregarDestino(mendoza, 2);
        paqueteParaSecundaria.agregarDestino(bariloche, 3);

        paqueteParaSecundaria.agregarActividadAPaquete(cataDeVinos);
        paqueteParaSecundaria.agregarActividadAPaquete(parapente);
        paqueteParaSecundaria.agregarActividadAPaquete(paseoEnVelero);

        System.out.println("El precio total del paquete es: " + paqueteParaSecundaria.getImporteTotalPaquete());
        System.out.println("EL nombre de la ciudad donde mas dinero se gasta en actividades es: " + paqueteParaSecundaria.destinoDondeMasSeGastaEnActividades().getNombreDestino());
        System.out.println("La actividad mas cara es: " + paqueteParaSecundaria.getActividadMasCara().getNombreActividad());
    }
}
