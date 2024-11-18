import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {

        /*3. SumaArrays) Crear una aplicación que:
    - pida la longitud de dos arrays de enteros
    - crea los array de enteros con las longitudes introducidas
    - crea un tercer array de la misma longitud que los dos anteriores
    - rellena el tercer array con la suma de las posiciones (Array1.posicion1 + array2.posicion = array3.posicion)*/

    Scanner scanner = new Scanner(System.in);

        // Pedir la longitud de los arrays al usuario
        System.out.print("Introduce la longitud de los dos arrays: ");
        int longitud = scanner.nextInt();

        // Crear los arrays con la longitud introducida
        int[] array1 = new int[longitud];
        int[] array2 = new int[longitud];
        int[] array3 = new int[longitud];

        // Rellenar el primer array
        System.out.println("Introduce los elementos del primer array:");
        for (int i = 0; i < longitud; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }

        // Rellenar el segundo array
        System.out.println("Introduce los elementos del segundo array:");
        for (int i = 0; i < longitud; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }

        // Calcular el tercer array sumando las posiciones de los dos arrays
        for (int i = 0; i < longitud; i++) {
            array3[i] = array1[i] + array2[i];
        }

        // Mostrar el tercer array
        System.out.println("Array resultante (suma de los dos arrays):");
        for (int i = 0; i < longitud; i++) {
            System.out.println("Posición " + (i + 1) + ": " + array3[i]);
        }

    }
}
