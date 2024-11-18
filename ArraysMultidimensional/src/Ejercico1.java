import java .util.Scanner;
public class Ejercico1 {
    public static void main(String[] args) {

        /*1. (MultiplicarArray) Crear un array de 5 posiciones:
    - se le pedirá al usuario que introduzca cada unos de los elementos del array
    - Multiplica cada elemento del array * 2 y vuelve a guardar su valor
    - Saca por consola la suma de todos los números
    - Saca la media de todos los elementos */

        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int suma = 0;

        // Solicitar al usuario que introduzca los elementos del array
        System.out.println("Introduce 5 números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Multiplicar cada elemento del array por 2 y recalcular la suma
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] *= 2;  // Multiplica cada número por 2
            suma += numeros[i];  // Suma el número multiplicado a la suma total
        }

        // Calcular la media de todos los elementos
        double media = (double) suma / numeros.length;

        // Mostrar los resultados
        System.out.println("Suma de todos los números: " + suma);
        System.out.printf("Media de todos los elementos: %.2f%n", media);
    }
}
