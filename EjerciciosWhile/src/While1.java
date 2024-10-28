import java.util.Scanner;

public class While1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int sumaPositivos = 0;

        System.out.println("Introduce números enteros (0 para terminar):");

        // Bucle para leer los números hasta introducir un 0
        while (true) {
            numero = scanner.nextInt();

            // Si el número es 0, termina el bucle
            if (numero == 0) {
                break;
            }

            // Solo suma si el número es positivo
            if (numero > 0) {
                sumaPositivos += numero;
            }
        }

        // Muestra el resultado de la suma de los positivos
        System.out.println("La suma de todos los números positivos es: " + sumaPositivos);

    }
}
