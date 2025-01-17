package Controller;

import java.util.Hashtable;
import java.util.Scanner;

public class Agenda_Hash{

    private Hashtable<String, Object[]> listaContactos; // Hashtable para almacenar los contactos
    private Scanner lectorTeclado;

    // Constructor
    public void Agenda() {
        listaContactos = new Hashtable<>();
        lectorTeclado = new Scanner(System.in);
    }

    // Agregar persona
    public void agregarPersona() {
        System.out.print("Ingrese nombre: ");
        String nombre = lectorTeclado.next();

        System.out.print("Ingrese apellido: ");
        String apellido = lectorTeclado.next();

        System.out.print("Ingrese teléfono: ");
        int telefono = lectorTeclado.nextInt();

        System.out.print("Ingrese DNI: ");
        String dni = lectorTeclado.next();

        if (!listaContactos.containsKey(dni)) {
            Object[] persona = new Object[]{nombre, apellido, telefono};
            listaContactos.put(dni, persona);
            System.out.println("\nPersona añadida con éxito.");
        } else {
            System.out.println("\nError: Ya existe una persona con el mismo DNI.");
        }
    }

    // Buscar persona
    public void buscarPersona() {
        System.out.print("Ingrese el DNI de la persona a buscar: ");
        String dni = lectorTeclado.next();

        if (listaContactos.containsKey(dni)) {
            Object[] persona = listaContactos.get(dni);
            System.out.println("\nNombre: " + persona[0] + ", Apellido: " + persona[1] + ", Teléfono: " + persona[2]);
        } else {
            System.out.println("\nError: No se encontró ninguna persona con ese DNI.");
        }
    }

    // Borrar persona
    public void borrarPersona() {
        System.out.print("Ingrese el DNI de la persona a eliminar: ");
        String dni = lectorTeclado.next();

        if (listaContactos.containsKey(dni)) {
            listaContactos.remove(dni);
            System.out.println("\nPersona eliminada con éxito.");
        } else {
            System.out.println("\nError: No se encontró ninguna persona con ese DNI.");
        }
    }

    // Listar personas
    public void listarPersonas() {
        if (listaContactos.isEmpty()) {
            System.out.println("\nNo hay personas en la agenda.");
        } else {
            System.out.println("\nLista de contactos:");
            listaContactos.forEach((dni, persona) -> {
                System.out.println("DNI: " + dni + ", Nombre: " + persona[0] + ", Apellido: " + persona[1] + ", Teléfono: " + persona[2]);
            });
        }
    }

    // Menú principal
    public void mostrarMenu() {
        lectorTeclado = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Agregar persona");
            System.out.println("2. Buscar persona");
            System.out.println("3. Borrar persona");
            System.out.println("4. Listar personas");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            String opcion = lectorTeclado.next();

            switch (opcion) {
                case "1":
                    agregarPersona();
                    break;
                case "2":
                    buscarPersona();
                    break;
                case "3":
                    borrarPersona();
                    break;
                case "4":
                    listarPersonas();
                    break;
                case "5":
                    System.out.println("Saliendo de la aplicación...");
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}
