import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        /*4. (PosicionesArray) Crea una aplicación que:
    - pida por teclado la longitud de un array
    - cree el array de enteros de la longitud introducida
    - pida al usuario que introduzca todos los datos del array
    - mueva una posición todos los elementos. el elemento de la posición 0 pasa a la posición 1 y así sucesivamente.
      El elemento que está en la última posición pasa a la primera
    - realizar la tarea anterior pero al contrario.
      El elemento que está en la primera posición pasa a la última y así sucesivamente*/

        Scanner scanner = new Scanner(System.in);

        // Pedir la longitud del array
        System.out.print("Introduce la longitud del array: ");
        int longitud = scanner.nextInt();

        // Crear el array con la longitud introducida
        int[] array = new int[longitud];

        // Rellenar el array con los valores introducidos por el usuario
        System.out.println("Introduce los elementos del array:");
        for (int i = 0; i < longitud; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Mostrar array original
        System.out.print("Array original: ");
        mostrarArray(array);

        // Desplazar los elementos una posición a la derecha
        int[] arrayDerecha = desplazarDerecha(array);
        System.out.print("Array desplazado a la derecha: ");
        mostrarArray(arrayDerecha);

        // Desplazar los elementos una posición a la izquierda
        int[] arrayIzquierda = desplazarIzquierda(array);
        System.out.print("Array desplazado a la izquierda: ");
        mostrarArray(arrayIzquierda);
    }

    // Metodo para desplazar el array una posición a la derecha
    public static int[] desplazarDerecha(int[] array) {
        int longitud = array.length;
        int[] resultado = new int[longitud];

        // El último elemento pasa a la primera posición
        resultado[0] = array[longitud - 1];

        // Desplazar los demás elementos a la derecha
        for (int i = 1; i < longitud; i++) {
            resultado[i] = array[i - 1];
        }
        return resultado;
    }

    // Metodo para desplazar el array una posición a la izquierda
    public static int[] desplazarIzquierda(int[] array) {
        int longitud = array.length;
        int[] resultado = new int[longitud];

        // El primer elemento pasa a la última posición
        resultado[longitud - 1] = array[0];

        // Desplazar los demás elementos a la izquierda
        for (int i = 0; i < longitud - 1; i++) {
            resultado[i] = array[i + 1];
        }
        return resultado;
    }

    // Metodo para mostrar el array
    public static void mostrarArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

