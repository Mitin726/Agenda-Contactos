import java.util.ArrayList;
import java.util.Scanner;

public class AgendaContactos{

    private ArrayList<Contacto> contactos;
    private Scanner scanner;

    public AgendaContactos(){
        contactos = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void iniciar() {

        int opcion;

        do {
            mostrarMenu();
            System.out.print("Seleccione una opción: ");
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Opción inválida. Debe ingresar un número.");
                opcion = 0;
            }

            switch (opcion) {
                case 0: 
                    break;
                case 1:
                    agregarContacto();
                    break;

                case 2:
                    System.out.println("Ver todos los contactos");
                    break;

                case 3:
                    System.out.println("Buscar contacto");
                    break;

                case 4:
                    System.out.println("Eliminar contacto");
                    break;

                case 5:
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 5);
    }

    private void mostrarMenu(){
        System.out.println();
        System.out.println("╔══════════════════════════════════╗");
        System.out.println("║       AGENDA DE CONTACTOS        ║");
        System.out.println("╠══════════════════════════════════╣");
        System.out.println("║ 1. Agregar contacto              ║");
        System.out.println("║ 2. Ver todos los contactos       ║");
        System.out.println("║ 3. Buscar contacto               ║");
        System.out.println("║ 4. Eliminar contacto             ║");
        System.out.println("║ 5. Salir                         ║");
        System.out.println("╚══════════════════════════════════╝");
    }

    private void agregarContacto(){
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        if (nombre.trim().isEmpty()) {
            System.out.println("El nombre no puede estar vacío.");
            return;
        }

        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();

        System.out.print("Correo: ");
        String correo = scanner.nextLine();

        Contacto contacto = new Contacto(nombre, telefono, correo);

        contactos.add(contacto);
        System.out.println("Contacto agregado correctamente.");
    }

    private void mostrarContactos(){
        
    }

    private void buscarContacto(){

    }

    private void eliminarContacto(){

    }
}