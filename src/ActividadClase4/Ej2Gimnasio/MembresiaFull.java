package ActividadClase4.Ej2Gimnasio;

public class MembresiaFull extends Membresia{


    public boolean puedeRealizarActividad(Persona unaPersona) {
        return this.sePuedeUsar = true;
    }

    public void entregarMembresiaFull(Persona unaPersona) {
        this.DNIdeQuienLePertenece = unaPersona.queDNItenes(unaPersona);
        unaPersona.entregarMembresia(unaPersona);
        unaPersona.tipoMembresia(this);
    }


}
