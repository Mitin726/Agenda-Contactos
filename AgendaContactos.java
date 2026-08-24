import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;

public class AgendaContactos{

    private ArrayList<Contacto> contactos;
    private Scanner scanner;

    public AgendaContactos(){
        contactos = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    // Método principal del programa
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
                    mostrarContactos();
                    break;

                case 3:
                    buscarContacto();
                    break;

                case 4:
                    eliminarContacto();
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
    // Opción 1
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

    // Opción 2
    private void mostrarContactos() {
        if (contactos.isEmpty()) {
            System.out.println("No hay contactos registrados.");
            return;
        }

        contactos.sort(Comparator.comparing(Contacto::getNombre,String.CASE_INSENSITIVE_ORDER));

        System.out.println("── Lista de contactos (" + contactos.size() + ") ──");
        for (int i = 0; i < contactos.size(); i++) {
            System.out.println((i + 1) + ". " + contactos.get(i));
        }

        System.out.println("────────────────────────────────────");
    }

    // Opción 3
    private void buscarContacto() {
        System.out.print("Ingrese el nombre a buscar: ");
        String nombreBuscado = scanner.nextLine().trim().toLowerCase();

        if (nombreBuscado.isEmpty()) {
            System.out.println("El nombre a buscar no puede estar vacío.");
            return;
        }

        boolean encontrado = false;

        for (int i = 0; i < contactos.size(); i++) {
            Contacto contacto = contactos.get(i);
            String nombreContacto = contacto.getNombre().toLowerCase();
            if (nombreContacto.contains(nombreBuscado)) {
                System.out.println(contacto);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron contactos.");
        }
    }

    // Opción 4
    private void eliminarContacto(){
        System.out.print("Ingrese el nombre a eliminar: ");
        String nombreAEliminar = scanner.nextLine().trim();

        if (nombreAEliminar.isEmpty()) {
            System.out.println("El nombre a eliminar no puede estar vacío.");
            return;
        }

        boolean encontrado = false;

        for (int i = 0; i < contactos.size(); i++) {
            Contacto contacto = contactos.get(i);
            String nombreContacto = contacto.getNombre().trim();
            if (nombreContacto.equals(nombreAEliminar)) {
                contactos.remove(i);
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("El contacto " + nombreAEliminar + " fue eliminado correctamente.");
        } else {
            System.out.println("No se encontró el contacto.");
        }
    }
}