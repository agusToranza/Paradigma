package ActividadClase4.Ej2Gimnasio;

import java.util.HashSet;

public class Actividad {

    private String nombreActividad;
    private String descripcion;
    private String tipoActividad;

    public Actividad (String nombre,String tipo, String descripcion) {
        this.nombreActividad = nombre;
        this.tipoActividad = tipo;
        this.descripcion = descripcion;
    }

    public String getNombreActividad() {
        return this.nombreActividad;
    }

}
