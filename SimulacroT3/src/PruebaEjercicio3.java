import java.util.Scanner;

public class PruebaEjercicio3 {
    public static void main(String[] args) {
        Scanner lectorTeclado = new Scanner(System.in);

        double saldo = 0;
        final int PinCorrecto = 1111;
        int opcion;

        do {
            System.out.println("\nBienvenido al cajero automático");
            System.out.println("1. Ingresar dinero");
            System.out.println("2. Sacar dinero");
            System.out.println("3. Consultar estado de la cuenta");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = lectorTeclado.nextInt();  // Pide la opción antes del switch

            switch (opcion) {
                case 1:
                    System.out.print("Introduzca su PIN: ");
                    int pintry1 = lectorTeclado.nextInt();
                    if (PinCorrecto == pintry1) {
                        System.out.print("Dinero a ingresar: ");
                        double dineroMeter = lectorTeclado.nextDouble();
                        saldo += dineroMeter;
                        System.out.println("Dinero introducido con éxito");
                    } else {
                        System.out.println("PIN incorrecto");
                    }
                    break;

                case 2:
                    System.out.print("Introduzca su PIN: ");
                    int pintry2 = lectorTeclado.nextInt();
                    if (PinCorrecto == pintry2) {
                        System.out.print("Dinero a sacar: ");
                        double dineroSacar = lectorTeclado.nextDouble();
                        if (saldo >= dineroSacar) {  // Verifica si hay saldo suficiente
                            saldo -= dineroSacar;
                            System.out.println("Dinero retirado con éxito");
                        } else {
                            System.out.println("Imposible sacar dinero. Saldo insuficiente.");
                        }
                    } else {
                        System.out.println("PIN incorrecto");
                    }
                    break;

                case 3:
                    System.out.print("Introduzca su PIN: ");
                    int pintry3 = lectorTeclado.nextInt();
                    if (PinCorrecto == pintry3) {
                        System.out.println("El estado de su cuenta es: " + saldo);
                    } else {
                        System.out.println("PIN incorrecto");
                    }
                    break;

                case 4:
                    System.out.print("Introduzca su PIN: ");
                    int pinTry4 = lectorTeclado.nextInt();
                    if (PinCorrecto == pinTry4) {
                        System.out.println("Saliendo del cajero...");
                        opcion = 4;  // Cambia la opción para salir del bucle
                    } else {
                        System.out.println("PIN incorrecto");
                    }
                    break;

                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }

        } while (opcion != 4);

    }
}
