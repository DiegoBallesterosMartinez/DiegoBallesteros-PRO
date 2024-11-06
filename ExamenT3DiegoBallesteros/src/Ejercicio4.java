import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner lectorTeclado = new Scanner(System.in);

        System.out.print("Introduce un número en base decimal: ");
        int numeroDecimal = lectorTeclado.nextInt();

        if (numeroDecimal > 0) {

            while (true) {
                System.out.println("\nElige el tipo de cambio de base:");
                System.out.println("a. Base 2");
                System.out.println("b. Base 8");
                System.out.println("c. Base 16");
                System.out.println("d. Salir");
                System.out.print("Opción: ");

                int opcion = lectorTeclado.nextInt();

                switch (opcion) {
                    case 'a':
                        do {
                            double resultado2 = (double) numeroDecimal / 2;
                            System.out.println("Base 2: " + resultado2);
                        } while (numeroDecimal > 2);
                        break;

                    case 'b':
                        do {
                            double resultado8 = (double) numeroDecimal / 8;
                            System.out.println("Base 8: " + resultado8);
                        } while (numeroDecimal > 8);
                        break;

                    case 'c':
                        do {
                            double resultado16 = (double) numeroDecimal / 16;
                            System.out.println("Base 16: " + resultado16);
                        } while (numeroDecimal > 16);
                        break;

                    default:
                        System.out.println("Opción no válida. Inténtalo de nuevo.");
                }
            }
        } else {
            System.out.println("No se puede hacer la operación con un número negativo.");
        }
    }
}

