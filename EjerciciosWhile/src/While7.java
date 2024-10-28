import java.util.Scanner;

public class While7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.println("Bienvenido a la aplicación del menú");

        // Bucle que muestra el menú hasta que el usuario elige la opción de salir
        do {
            // Mostrar opciones del menú
            System.out.println("\n1. Opción1");
            System.out.println("2. Opción2");
            System.out.println("3. Opción3");
            System.out.println("4. Opción4");
            System.out.println("5. Salir");
            System.out.print("Introduce la opción seleccionada: ");

            // Leer la opción del usuario
            opcion = scanner.nextInt();

            // Evaluar la opción seleccionada
            switch (opcion) {
                case 1:
                    System.out.println("La opción seleccionada es 1");
                    break;
                case 2:
                    System.out.println("La opción seleccionada es 2");
                    break;
                case 3:
                    System.out.println("La opción seleccionada es 3");
                    break;
                case 4:
                    System.out.println("La opción seleccionada es 4");
                    break;
                case 5:
                    System.out.println("Saliendo de la aplicación...");
                    break;
                default:
                    System.out.println("Opción no contemplada");
                    break;
            }
        } while (opcion != 5);  // El bucle continúa hasta que el usuario selecciona 5 para salir

    }
}
