import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

public class Hotel {

    private Hashtable<String, Object[]> listaReservas;
    private Scanner lectorTeclado;


    // Constructor
    public Hotel(Scanner lectorTeclado) {
        this.lectorTeclado = lectorTeclado;
        listaReservas = new Hashtable<>();
    }

    public void agregarReserva() {
        System.out.print("Ingrese nº habitacion: ");
        String habitacion = lectorTeclado.next();

        System.out.print("Ingrese nombre: ");
        String nombre = lectorTeclado.next();

        System.out.print("Ingrese teléfono: ");
        int telefono = lectorTeclado.nextInt();

        System.out.print("Ingrese DNI: ");
        String dni = lectorTeclado.next();

        System.out.print("Ingrese nº personas: ");
        String numPersonas = lectorTeclado.next();

        if (!listaReservas.containsKey(dni)) {
            Object[] persona = new Object[]{habitacion, nombre, telefono, dni, numPersonas};
            listaReservas.put(dni, persona);
            System.out.println("\nPersona añadida con éxito.");
        } else {
            System.out.println("\nError: Ya ha realizado una reserva.");
        }
    }

    public void buscarReserva() {
        System.out.print("Ingrese el DNI de la persona a buscar: ");
        String dni = lectorTeclado.next();

        if (listaReservas.containsKey(dni)) {
            Object[] reserva = listaReservas.get(dni);
            System.out.println("\nHabitacion: " + reserva[0] + ", Nombre: " + reserva[1] + ", Teléfono: " + reserva[2] + ", Dni: " + reserva[3] + ", Personas: " + reserva[4]);
        } else {
            System.out.println("\nError: No se encontró ninguna persona con ese DNI.");
        }
    }

    public void borrarReserva() {
        System.out.print("Ingrese el DNI de la persona a eliminar: ");
        String dni = lectorTeclado.next();

        if (listaReservas.containsKey(dni)) {
            listaReservas.remove(dni);
            System.out.println("\nPersona eliminada con éxito.");
        } else {
            System.out.println("\nError: No se encontró ninguna persona con ese DNI.");
        }
    }

    public void listarReservas() {
        if (listaReservas.isEmpty()) {
            System.out.println("\nNo hay personas en la agenda.");
        } else {
            System.out.println("\nLista de Reservas:");
            listaReservas.forEach((dni, reserva) -> {
                System.out.println("\nHabitacion: " + reserva[0] + ", Nombre: " + reserva[1] + ", Teléfono: " + reserva[2] + ", Dni: " + reserva[3] + ", Personas: " + reserva[4]);
            });
        }
    }

    public void listarReservasOrdenadas() {
        if (listaReservas.isEmpty()) {
            System.out.println("No hay reservas");
        } else {

            // creamos listas para ordenar
            List<Object[]> reservasOrdenadas = new ArrayList<>(listaReservas.values());

            // ordenamos listas con el valor deseado (posicion 0 = habitaciones)
            reservasOrdenadas.sort((reserva1, reserva2) -> {
                String habitacion1 = (String) reserva1[0];
                String habitacion2 = (String) reserva2[0];
                return habitacion1.compareTo(habitacion2); // ordenar por habitaciones
            });
            // mostrar reservas
            System.out.println("\nLista reservas ordenadas:");


            for (Object item : reservasOrdenadas) {
                // cast explicito Object[]
                Object[] reserva = (Object[]) item;
                System.out.println("numero habitacion: " + reserva[0] + ", nombre: " + reserva[1] + ", telefono: " + reserva[2] + ", dni: " + reserva[3] + ", numero personas: " + reserva[4]);
            }
        }
    }

    public void mostrarMenu() {
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Agregar reserva");
            System.out.println("2. Buscar reserva");
            System.out.println("3. Borrar reserva");
            System.out.println("4. Listar reservas");
            System.out.println("5. Listar mesas ordenadas");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            String opcion = lectorTeclado.next();

            switch (opcion) {
                case "1":
                    agregarReserva();
                    break;
                case "2":
                    buscarReserva();
                    break;
                case "3":
                    borrarReserva();
                    break;
                case "4":
                    listarReservas();
                    break;
                case "5":
                    listarReservasOrdenadas();
                    break;
                case "6":
                    System.out.println("Saliendo de la aplicación...");
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}
