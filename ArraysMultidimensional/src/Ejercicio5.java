import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        /*1. (OperacionesArray) Crear un array con 10 posiciones y asígnale números enteros entre 0 y 9, ambos inclusive (de forma automática). Se mostrarán los datos separados por una coma y un espacio. Una vez hecho esto se modificará el array del de la manera indicada en cada apartado, y se mostrará de nuevo.
- Incrementar en 1 los valores pares y en -1 los impares.
- Duplicar los valores positivos menores que 5
- Sumar a cada valor un valor entero aleatorio entre -5 y 5.
- Mover los datos una posición hacia la derecha (el primero pasa al segundo, el
segundo al tercero, ..., y el último al primero).
- Intercambiar el primero con el segundo, el tercero con el cuarto, ..., el penúltimo con el último.
- Invertir el array
- Mostrar la posición del primer par y del último impar.
  hay que hacer de golpe, pero opcionalmente se puede hacer un menú que indique cada una de las opciones*/

        int[] array = new int[10];
        int random = (int) Math.random() * 10;

        // Rellenar el array con valores entre 0 y 9
        for (int i = 0; i < array.length; i++) {
            array[i] = random;

            // prueba valores random
            System.out.println(array[i]);
        }

        // Mostrar el array inicial
        System.out.print("Array inicial: ");
        mostrarArray(array);

        // 1. Incrementar en 1 los valores pares y en -1 los impares
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] += 1;
            } else {
                array[i] -= 1;
            }
        }
        System.out.print("Incrementar pares y decrementar impares: ");
        mostrarArray(array);

        // 2. Duplicar los valores positivos menores que 5
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] < 5) {
                array[i] *= 2;
            }
        }
        System.out.print("Duplicar valores < 5: ");
        mostrarArray(array);

        // 3. Sumar un valor aleatorio entre -5 y 5 a cada valor del array
        for (int i = 0; i < array.length; i++) {
            array[i] += random - 5; // Genera entre -5 y +5
        }
        System.out.print("Suma aleatoria entre -5 y 5: ");
        mostrarArray(array);

        // 4. Mover los datos una posición hacia la derecha
        int ultimo = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = ultimo;
        System.out.print("Mover a la derecha: ");
        mostrarArray(array);

        // 5. Intercambiar primero con segundo, tercero con cuarto, etc.
        for (int i = 0; i < array.length - 1; i += 2) {
            int temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
        }
        System.out.print("Intercambiar posiciones pares: ");
        mostrarArray(array);

        // 6. Invertir el array
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.print("Invertir array: ");
        mostrarArray(array);

        // 7. Mostrar la posición del primer par y del último impar
        int primerPar = -1;
        int ultimoImpar = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && primerPar == -1) {
                primerPar = i;
            }
            if (array[i] % 2 != 0) {
                ultimoImpar = i;
            }
        }
        System.out.println("Posición del primer par: " + primerPar);
        System.out.println("Posición del último impar: " + ultimoImpar);
    }

    // Metodo para mostrar el array con formato
    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

}



