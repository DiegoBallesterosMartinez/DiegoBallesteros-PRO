import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

public class PruebaHotel {

    private Scanner lectorTeclado;
    private Hashtable<String, Object[]> listaReservas;

    // constructor
    public PruebaHotel(Scanner lectorTeclado) {
        this.lectorTeclado = lectorTeclado;
        listaReservas = new Hashtable<>();
    }

    public void registrarReservas() {
        System.out.println("Dime numero habitacion:");
        String habitacion = lectorTeclado.next();

        System.out.println("Dime nombre:");
        String nombre = lectorTeclado.next();

        System.out.println("Dime telefono:");
        String telefono = lectorTeclado.next();

        System.out.println("Dime dni:");
        String dni = lectorTeclado.next();

        System.out.println("Dime numero personas:");
        String numPersonas = lectorTeclado.next();

        if (!listaReservas.containsKey(dni)) {
            Object[] persona = new Object[]{habitacion, nombre, telefono, dni, numPersonas};
            listaReservas.put(dni, persona);
            System.out.println("Reserva realizada con exito");
        } else {
            System.out.println("Ya se ha echo una reserva con ese dni");
        }
    }

    public void borrarReserva() {
        System.out.println("Dni de la reserva que quieras borrar:");
        String dni = lectorTeclado.next();
        if (listaReservas.containsKey(dni)) {
            listaReservas.remove(dni);
            System.out.println("Reserva borrada con exito");
        } else {
            System.out.println("No hay reservas con ese dni");
        }
    }

    public void mostrarReservas() {
        if (listaReservas.isEmpty()) {
            System.out.println("No hay reservas");
        } else {
            listaReservas.forEach((dni, reserva) -> {
                System.out.println("Lista reservas:\n");
                System.out.println("Habitacion: " + reserva[0] + ", nombre: " + reserva[1] + ", telefono: " + reserva[2] + ", dni: " + reserva[3] + ", numero personas: " + reserva[4]);
            });
        }
    }

    public void mostrarReservasOrdenadas() {
        if (listaReservas.isEmpty()) {
            System.out.println("No hay reservas");
        } else {
            // creamos listas para ordenar
            List<Object[]>reservasOrdenadas = new ArrayList<>(listaReservas.values());

            // las ordenamos
            reservasOrdenadas.sort((reserva1,reserva2)->{
                String habitacion1 = (String) reserva1[0];
                String habitacion2 = (String) reserva2[0];
                return habitacion1.compareTo(habitacion2);
            });
            // las imprimimos
            for (Object item : reservasOrdenadas){
                // casteo explicito
                Object[] reserva = (Object[]) item;
                System.out.println("Habitacion: " + reserva[0] + ", nombre: " + reserva[1] + ", telefono: " + reserva[2] + ", dni: " + reserva[3] + ", numero personas: " + reserva[4]);
            }
        }
    }

    public void mostrarMenu() {
        while (true) {

            System.out.println("1. Agregar reserva");
            System.out.println("2. Borrar reserva");
            System.out.println("3. Listar reservas");
            System.out.println("4. Listar reservas ordenadas");
            System.out.println("5. Salir");

            int opcion = lectorTeclado.nextInt();

            switch (opcion) {
                case 1:
                    registrarReservas();
                    break;
                case 2:
                    borrarReserva();
                    break;
                case 3:
                    mostrarReservas();
                    break;
                case 4:
                    mostrarReservasOrdenadas();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Opcion no valida, intente de nuevo");
            }
        }
    }
}
