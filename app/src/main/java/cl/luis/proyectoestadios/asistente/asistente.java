package cl.luis.proyectoestadios.asistente;

public class asistente {
    private String idAsistente;
    private String Nombre;
    private String Ubicacion;

    public  asistente (){
        this.idAsistente = "";
        this.Nombre ="";
        this.Ubicacion = "";
    }


    public asistente(String idAsistente, String nombre, String ubicacion) {
        this.idAsistente = idAsistente;
        Nombre = nombre;
        Ubicacion = ubicacion;
    }

    public String getIdAsistente() {
        return idAsistente;
    }

    public void setIdAsistente(String idAsistente) {
        this.idAsistente = idAsistente;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        Ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "asistente{" +
                "idAsistente='" + idAsistente + '\'' +
                ", Nombre='" + Nombre + '\'' +
                ", Ubicacion='" + Ubicacion + '\'' +
                '}';
    }
}
