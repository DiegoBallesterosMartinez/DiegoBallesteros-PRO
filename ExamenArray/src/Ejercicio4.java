import java.util.Scanner;

public class Ejercicio4 {
    static final int MAX_PERSONAS = 100;
    static Object[][] personas = new Object[MAX_PERSONAS][4];
    static int numPersonas = 0;
    public static void main(String[] args) {
        Scanner lectorTeclado = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Añadir persona");
            System.out.println("2. Buscar persona");
            System.out.println("3. Listar personas");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = lectorTeclado.nextInt();

            switch (opcion) {
                // casos con metodos con return
                case 1:
                    añadirPersona(lectorTeclado);
                    break;
                case 2:
                    buscarPersona(lectorTeclado);
                    break;
                case 3:
                    listarPersonas();
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida, intenta nuevamente.");
            }
        } while (opcion != 0);
    }

    public static void añadirPersona(Scanner lectorTeclado) {
        if (numPersonas < MAX_PERSONAS) {
            System.out.print("Introduce el DNI: ");
            String dni = lectorTeclado.nextLine();

            System.out.print("Introduce el nombre: ");
            String nombre = lectorTeclado.nextLine();

            System.out.print("Introduce el apellido: ");
            String apellido = lectorTeclado.nextLine();

            System.out.print("Introduce el teléfono: ");
            String telefono = lectorTeclado.nextLine();

            // agregar persona a la lista
            personas[numPersonas][0] = dni;
            personas[numPersonas][1] = nombre;
            personas[numPersonas][2] = apellido;
            personas[numPersonas][3] = telefono;

            numPersonas++;
            System.out.println("Persona añadida correctamente.");
        } else {
            System.out.println("No se pueden añadir más personas.");
        }
    }

    // buscar persona
    public static void buscarPersona(Scanner lectorTeclado) {
        lectorTeclado.nextLine(); // Limpiar el buffer
        System.out.print("Introduce el DNI de la persona a buscar: ");
        String dniBusqueda = lectorTeclado.nextLine();

        boolean encontrado = false;
        for (int i = 0; i < numPersonas; i++) {
            if (personas[i][0].equals(dniBusqueda)) {
                System.out.println("Persona encontrada:");
                System.out.println("Nombre: " + personas[i][1] + ", Apellido: " + personas[i][2] + ", Teléfono: " + personas[i][3]);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró ninguna persona con el DNI: " + dniBusqueda);
        }
    }

    // listar todas las personas
    public static void listarPersonas() {
        System.out.println("\nListado de personas:");
        if (numPersonas != 0) {
            for (int i = 0; i < numPersonas; i++) {
                System.out.println("Nombre: " + personas[i][1] + ", Apellido: " + personas[i][2] + ", Teléfono: " + personas[i][3]);
            }
        } else {
            System.out.println("No hay personas en la lista.");
        }
    }
}
