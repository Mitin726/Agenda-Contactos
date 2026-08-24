public class PruebaContacto {

    public static void main(String[] args) {

        Contacto contacto = new Contacto(
            "Ana García",
            "3001234567",
            "ana@correo.com"
        );

        System.out.println("Nombre: " + contacto.getNombre());
        System.out.println("Teléfono: " + contacto.getTelefono());
        System.out.println("Correo: " + contacto.getCorreo());
    }
}