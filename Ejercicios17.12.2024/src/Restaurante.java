import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class Restaurante {

    // nombre, numero mesa, bocadillo, bebida, precio

    private Hashtable<Integer, Object[]> listaMesas;
    private Scanner lectorTeclado;
    private final String[][] carta = {{"Bocadillo", "5.50"}, {"Bebida", "2.50"}};
    private final int TotalMesas = 10;

    // Constructor
    public Restaurante(Scanner lectorTeclado) {
        this.lectorTeclado = lectorTeclado;
        listaMesas = new Hashtable<>();
    }

    public void asignarMesas() {
        System.out.println("Dime un nombre:");
        String nombre = lectorTeclado.next();

        System.out.println("Número de mesa (1 a 10):");
        int mesa = lectorTeclado.nextInt();

        if (mesa < 1 || mesa > TotalMesas) {
            System.out.println("Número de mesa no válido.");
            return;
        }

        if (!listaMesas.containsKey(mesa)) {
            Object[] reserva = {nombre, mesa, new ArrayList<String>(), 0.0};
            listaMesas.put(mesa, reserva);
            System.out.println("Mesa asignada a " + nombre);
        } else {
            System.out.println("La mesa ya está ocupada.");
        }
    }

    public void liberarMesas(){
        System.out.println("Dime el número de la mesa a liberar:");
        int mesa = lectorTeclado.nextInt();

        if (listaMesas.containsKey(mesa)) {
            Object[] reserva = listaMesas.remove(mesa);
            double precioTotal = (double) reserva[3];
            System.out.println("Mesa " + mesa + " liberada. Precio total: " + precioTotal + "€.");
        } else {
            System.out.println("La mesa no está ocupada.");
        }
    }

    public void realizarPedido(){
        System.out.println("¿Cuántos bocadillos quieres?");
        int bocadillos = lectorTeclado.nextInt();

        System.out.println("¿Cuántas bebidas quieres?");
        int bebidas = lectorTeclado.nextInt();

        System.out.println("¿Para qué mesa es el pedido?");
        int mesa = lectorTeclado.nextInt();

        if (listaMesas.containsKey(mesa)) {
            Object[] reserva = listaMesas.get(mesa);
            ArrayList<String> pedido = (ArrayList<String>) reserva[2];
            double precioTotal = (double) reserva[3];

            for (int i = 0; i < bocadillos; i++) {
                pedido.add("Bocadillo");
                precioTotal += 5.50; // Directamente sumamos el precio sin parsear
            }

            for (int i = 0; i < bebidas; i++) {
                pedido.add("Bebida");
                precioTotal += 2.50; // Directamente sumamos el precio sin parsear
            }

            reserva[2] = pedido;
            reserva[3] = precioTotal;
            System.out.println("Pedido realizado para mesa " + mesa);
            System.out.println("Total a pagar: " + precioTotal + "€.");
        } else {
            System.out.println("La mesa no está ocupada.");
        }
    }

    public void mostrarMesas(){
        if (listaMesas.isEmpty()){
            System.out.println("No hay mesas ocupadas");
        } else {
            System.out.println("\nLista de mesas ocupadas:\n");
            listaMesas.forEach((mesa, reserva) -> {
                System.out.println("\nMesa: " + reserva[1] + ", Nombre: " + reserva[0] + ", Pedido: " + reserva[2] + ", Precio: " + reserva[3] + "€");
            });
        }
    }

    public void mostrarOrdenadasMesas(){
        if (listaMesas.isEmpty()) {
            System.out.println("No hay mesas ocupadas.");
        } else {
            System.out.println("\nLista de mesas ordenadas por nombre:\n");

            ArrayList<Object[]> mesasOrdenadas = new ArrayList<>();
            for (Object[] reserva : listaMesas.values()) {
                mesasOrdenadas.add(reserva);
            }

            for (int i = 0; i < mesasOrdenadas.size(); i++) {
                for (int j = i + 1; j < mesasOrdenadas.size(); j++) {
                    Object[] reserva1 = mesasOrdenadas.get(i);
                    Object[] reserva2 = mesasOrdenadas.get(j);
                    String nombre1 = (String) reserva1[0];
                    String nombre2 = (String) reserva2[0];

                    if (nombre1.compareTo(nombre2) > 0) {
                        mesasOrdenadas.set(i, reserva2);
                        mesasOrdenadas.set(j, reserva1);
                    }
                }
            }

            // Imprimir mesas ordenadas
            for (Object[] reserva : mesasOrdenadas) {
                System.out.println("Mesa: " + reserva[1] + ", Nombre: " + reserva[0] + ", Pedido: " + reserva[2] + ", Precio: " + reserva[3] + "€");
            }
        }
    }

    public void mostrarMenu() {
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Agregar reserva");
            System.out.println("2. Liberar mesa");
            System.out.println("3. Realizar pedido");
            System.out.println("4. Listar reservas");
            System.out.println("5. Listar mesas ordenadas");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            String opcion = lectorTeclado.next();

            switch (opcion) {
                case "1":
                    asignarMesas();
                    break;
                case "2":
                    liberarMesas();
                    break;
                case "3":
                    realizarPedido();
                    break;
                case "4":
                    mostrarMesas();
                    break;
                case "5":
                    mostrarOrdenadasMesas();
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
