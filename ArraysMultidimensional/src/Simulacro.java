import java.util.Scanner;

public class Simulacro {
    static final int MAX_PEDIDOS = 100;  // Capacidad máxima de pedidos
    static String[][] pedidos = new String[MAX_PEDIDOS][6];  // Matriz para almacenar pedidos
    static int numPedidos = 0; // Número actual de pedidos
    static double caja = 0.0; // Total de ventas cobradas

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definimos los ingredientes disponibles
        String[] ingredientesDisponibles = {
                "Queso", "Pepperoni", "Jamón", "Champiñones", "Pimiento", "Piña"
        };
        double[] preciosIngredientes = {1.0, 1.5, 1.2, 1.0, 0.8, 1.3};

        int opcion;
        do {
            System.out.println("Menú de la Pizzería:");
            System.out.println("1. Realizar pedido");
            System.out.println("2. Servir pedido");
            System.out.println("3. Mostrar pedidos pendientes");
            System.out.println("4. Mostrar caja");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    realizarPedido(scanner, ingredientesDisponibles, preciosIngredientes);
                    break;
                case 2:
                    servirPedido(scanner);
                    break;
                case 3:
                    mostrarPedidosPendientes();
                    break;
                case 4:
                    mostrarCaja();
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida, intenta nuevamente.");
            }
        } while (opcion != 0);

        scanner.close();
    }

    // Realiza un nuevo pedido
    public static void realizarPedido(Scanner scanner, String[] ingredientesDisponibles, double[] preciosIngredientes) {
        scanner.nextLine(); // Limpiar buffer
        System.out.print("Nombre de usuario: ");
        String nombreUsuario = scanner.nextLine();

        System.out.print("Teléfono de usuario: ");
        String telefono = scanner.nextLine();

        System.out.print("Cantidad de ingredientes que desea añadir (mayor que 0): ");
        int cantidadIngredientes = scanner.nextInt();
        while (cantidadIngredientes <= 0) {
            System.out.print("Debe ingresar al menos un ingrediente. Intente de nuevo: ");
            cantidadIngredientes = scanner.nextInt();
        }

        String[] ingredientesPedido = new String[cantidadIngredientes];
        double precioTotal = 10.0; // Precio base de la pizza
        System.out.println("Seleccione los ingredientes por su número:");
        for (int i = 0; i < ingredientesDisponibles.length; i++) {
            System.out.println((i + 1) + ". " + ingredientesDisponibles[i] + " - $" + preciosIngredientes[i]);
        }

        for (int i = 0; i < cantidadIngredientes; i++) {
            System.out.print("Selecciona el ingrediente " + (i + 1) + ": ");
            int indice = scanner.nextInt() - 1;

            // Validación del índice del ingrediente
            if (indice >= 0 && indice < ingredientesDisponibles.length) {
                ingredientesPedido[i] = ingredientesDisponibles[indice];
                precioTotal += preciosIngredientes[indice];  // Agregar precio del ingrediente seleccionado
            } else {
                System.out.println("Ingrediente inválido. Intenta nuevamente.");
                i--; // Reintentar para el mismo índice
            }
        }

        if (numPedidos < MAX_PEDIDOS) {
            // Almacenar el pedido en la matriz
            // Convertir el ID del pedido a cadena manualmente
            String idPedido = convertirNumeroAString(numPedidos + 1);
            pedidos[numPedidos][0] = idPedido;  // ID del pedido
            pedidos[numPedidos][1] = nombreUsuario;  // Nombre de usuario
            pedidos[numPedidos][2] = telefono;  // Teléfono

            // Concatenación manual de los ingredientes seleccionados
            String ingredientesConcatenados = ingredientesPedido[0];
            for (int i = 1; i < ingredientesPedido.length; i++) {
                ingredientesConcatenados += ", " + ingredientesPedido[i];
            }
            pedidos[numPedidos][3] = ingredientesConcatenados;  // Ingredientes

            // Convertir el precio total a cadena manualmente
            String precioTotalStr = convertirNumeroAString(precioTotal);
            pedidos[numPedidos][4] = precioTotalStr;  // Precio total

            pedidos[numPedidos][5] = "Pendiente";  // Estado del pedido
            numPedidos++;
            System.out.println("Pedido realizado correctamente. ID de pedido: " + (numPedidos));
        } else {
            System.out.println("No se pueden realizar más pedidos, el límite ha sido alcanzado.");
        }
    }

    // Convierte un número a cadena de forma manual
    public static String convertirNumeroAString(double numero) {
        // Si el número es entero
        if (numero == (int) numero) {
            return convertirNumeroAString((int) numero);
        }

        // Si el número tiene decimales, es necesario tratar con los dos valores
        int entero = (int) numero;
        int decimal = (int) ((numero - entero) * 100); // Tomar dos decimales
        String cadena = convertirNumeroAString(entero) + "." + convertirNumeroAString(decimal);
        return cadena;
    }

    // Convierte un número entero a cadena manualmente
    public static String convertirNumeroAString(int numero) {
        if (numero == 0) {
            return "0";
        }

        String cadena = "";
        while (numero > 0) {
            int digito = numero % 10;
            cadena = (char) (digito + '0') + cadena;  // Convertir el dígito a carácter
            numero = numero / 10;
        }
        return cadena;
    }

    // Servir un pedido
    public static void servirPedido(Scanner scanner) {
        System.out.print("Introduce el ID del pedido que deseas servir: ");
        int idPedido = scanner.nextInt() - 1;

        if (idPedido >= 0 && idPedido < numPedidos && pedidos[idPedido][5].equals("Pendiente")) {
            pedidos[idPedido][5] = "Servido";  // Actualizar estado a servido
            caja += Double.parseDouble(pedidos[idPedido][4]);  // Actualizar total en caja
            System.out.println("Pedido servido y cobrado. Total: $" + pedidos[idPedido][4]);
        } else {
            System.out.println("El pedido no existe o ya fue servido.");
        }
    }

    // Muestra los pedidos pendientes
    public static void mostrarPedidosPendientes() {
        System.out.println("Pedidos pendientes:");
        for (int i = 0; i < numPedidos; i++) {
            if (pedidos[i][5].equals("Pendiente")) {
                System.out.println("ID: " + pedidos[i][0] + " | Nombre: " + pedidos[i][1] +
                        " | Teléfono: " + pedidos[i][2] + " | Ingredientes: " + pedidos[i][3]);
                System.out.println("----------------------------");
            }
        }
    }

    // Muestra la cantidad en la caja
    public static void mostrarCaja() {
        System.out.println("Total en caja: $" + caja);
    }
}
