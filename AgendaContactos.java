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
                    System.out.println("Agregar contacto");
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
        System.out.println("""
        1. Agregar contacto
        2. Ver todos los contactos
        3. Buscar contacto
        4. Eliminar Contacto
        5. Salir
        """);
    }

    private void agregarContacto(){
        
    }

    private void mostrarContactos(){

    }

    private void buscarContacto(){

    }

    private void eliminarContacto(){

    }
}