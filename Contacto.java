public class Contacto {
 
    // Atributos
    private String nombre;
    private String telefono;
    private String correo;

    // Métodos Especiales
    // Constructor
    public Contacto(String nombre, String telefono, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    // Getters

    public String getNombre(){
        return this.nombre;
    }

    public String getTelefono(){
        return this.telefono;
    }

    public String getCorreo(){
        return this.correo;
    }

    // Setters

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public void setCorreo(String correo){
        this.correo = correo;
    }

    // ToString
    @Override
    public String toString() {
        return "| nombre=" + this.nombre + " | telefono=" + this.telefono + " | correo=" + this.correo + " |";
    }
}
