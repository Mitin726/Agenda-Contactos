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

    private void buscarContacto() {
        System.out.print("Ingrese el nombre a buscar: ");
        String nombreBuscado = scanner.nextLine().trim().toLowerCase();

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

    private void eliminarContacto(){
        System.out.print("Ingrese el nombre a eliminar: ");
        String nombreBuscado = scanner.nextLine().trim();

        boolean encontrado = false;

        for (int i = 0; i < contactos.size(); i++) {
            Contacto contacto = contactos.get(i);
            String nombreContacto = contacto.getNombre().trim();
            if (nombreContacto.equals(nombreBuscado)) {
                contactos.remove(i);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontro el contacto.");
        }
    }
}