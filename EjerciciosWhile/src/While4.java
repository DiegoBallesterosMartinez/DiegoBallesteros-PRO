import java.util.Scanner;

public class While4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero no negativo: ");

        // Leer el número entero no negativo
        int numero = scanner.nextInt();

        // Validación para asegurarse de que el número es no negativo
        if (numero < 0) {
            System.out.println("El número debe ser no negativo.");
        } else {
            // Convertir el número a binario, octal y hexadecimal
            String binario = Integer.toBinaryString(numero);
            String octal = Integer.toOctalString(numero);
            String hexadecimal = Integer.toHexString(numero).toUpperCase(); // Convertimos a mayúsculas para formato estándar

            // Mostrar los resultados
            System.out.println("Número en binario: " + binario);
            System.out.println("Número en octal: " + octal);
            System.out.println("Número en hexadecimal: " + hexadecimal);
        }

    }
}
