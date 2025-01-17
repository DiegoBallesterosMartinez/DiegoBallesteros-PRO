import javax.management.ObjectName;
import java.util.*;

public class Hotel {

    private Scanner lectorTeclado;
    private Hashtable<String, Object[]> listaReservas = new Hashtable<>();

    public Hotel(Scanner lectorTeclado) {
        this.lectorTeclado = lectorTeclado;

    }

    public void agregarPersona() {
        System.out.print("Ingrese nº habitacion: ");
        String habitacion = lectorTeclado.next();

        System.out.print("Ingrese nombre: ");
        String nombre = lectorTeclado.next();

        System.out.print("Ingrese teléfono: ");
        String telefono = lectorTeclado.next();

        System.out.print("Ingrese DNI: ");
        String dni = lectorTeclado.next();

        System.out.print("Ingrese nº personas: ");
        String numPersonas = lectorTeclado.next();

        if (listaReservas.containsKey(dni)) {
            System.out.println("Ya hay una reserva con es dni");
        } else {
            Object[] persona = new Object[]{habitacion, nombre, telefono, dni, numPersonas};
            listaReservas.put(dni, persona);
            System.out.println("Reserva realizada con exito");
        }
    }

    public void cancelarReserva() {
        System.out.println("Dime el dni de la reserva que quieras eliminar");
        String dni = lectorTeclado.next();

        if (listaReservas.containsKey(dni)) {
            listaReservas.remove(dni);
            System.out.println("Reserva eliminada con exito");
        } else {
            System.out.println("No se encuentra ninguna reserva con ese dni");
        }
    }

    public void listarReserva() {
        if (listaReservas.isEmpty()) {
            System.out.println("No hay reservas");
        } else {
            listaReservas.forEach((dni, persona) -> {
                System.out.println("habitacion: " + persona[0] + "nombre: " + persona[1] + ", telefono: "
                        + persona[2] + ", dni: " + persona[3] + ", numero personas" + persona[4]);
            });
        }
    }

    public void listaReservasOrdenadas() {

        if (listaReservas.isEmpty()) {
            System.out.println("No hay reservas");
        } else {
            // crear list object [] values
            List<Object[]> listaOrdenada = new ArrayList<>(listaReservas.values());
            //ordenar lista sort
            listaOrdenada.sort((reserva1, reserva2) -> {
                String habitacion1 = (String) reserva1[0];
                String habitacion2 = (String) reserva2[0];
                return habitacion1.compareTo(habitacion2);
            });
            // sout imprimir
            System.out.println("Imprimiendo lista ordenada");
            //cast explicito for
            for (Object item : listaOrdenada) {
                Object[] reserva = (Object[]) item;
                System.out.println("numero habitacion: " + reserva[0] + ", nombre: " + reserva[1] + ", telefono: " + reserva[2] + ", dni: " + reserva[3] + ", numero personas: " + reserva[4]);
            }

        }
    }

    public void mostrarMenu() {
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Agregar reserva");
            System.out.println("2. Borrar reserva");
            System.out.println("3. Listar reservas");
            System.out.println("4. Listar mesas ordenadas");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            String opcion = lectorTeclado.next();

            switch (opcion) {
                case "1":
                    agregarPersona();
                    break;
                case "2":
                    cancelarReserva();
                    break;
                case "3":
                    listarReserva();
                    break;
                case "4":
                    listaReservasOrdenadas();
                    break;
                case "5":
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }

    }
}