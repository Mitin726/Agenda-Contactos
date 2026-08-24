import java.util.ArrayList;

public class AgendaContactos{

    private ArrayList<Contacto> contactos;

    public AgendaContactos(){
        contactos = new ArrayList<>();
    }

    public void Iniciar(){
        System.out.println("Agenda de Contactos");
        mostrarMenu();
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
}