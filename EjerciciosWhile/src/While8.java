import java.util.Scanner;

public class While8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operando1, operando2, opcion;

        System.out.println("Bienvenido a la aplicación de cálculos");

        // Bucle que se repite hasta que el usuario elige salir
        do {
            // Solicitar los dos operandos
            System.out.print("\nIntroduce operando uno: ");
            operando1 = scanner.nextInt();

            System.out.print("Introduce operando dos: ");
            operando2 = scanner.nextInt();

            // Mostrar el menú de operaciones
            System.out.println("\n1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Módulo");
            System.out.println("6. Salir");
            System.out.print("Selecciona la operación que quieres realizar: ");

            // Leer la opción seleccionada
            opcion = scanner.nextInt();

            // Evaluar la opción seleccionada y realizar la operación correspondiente
            switch (opcion) {
                case 1:
                    System.out.println("El resultado de la operación es: " + (operando1 + operando2));
                    break;
                case 2:
                    System.out.println("El resultado de la operación es: " + (operando1 - operando2));
                    break;
                case 3:
                    System.out.println("El resultado de la operación es: " + (operando1 * operando2));
                    break;
                case 4:
                    if (operando2 != 0) {
                        System.out.println("El resultado de la operación es: " + (operando1 / operando2));
                    } else {
                        System.out.println("Error: División por cero no permitida.");
                    }
                    break;
                case 5:
                    if (operando2 != 0) {
                        System.out.println("El resultado de la operación es: " + (operando1 % operando2));
                    } else {
                        System.out.println("Error: División por cero no permitida en operación módulo.");
                    }
                    break;
                case 6:
                    System.out.println("Saliendo de la aplicación...");
                    break;
                default:
                    System.out.println("Opción no contemplada");
                    break;
            }
        } while (opcion != 6); // El bucle continúa hasta que el usuario selecciona 6 para salir

    }
}
