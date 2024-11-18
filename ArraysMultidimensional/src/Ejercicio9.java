import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        /*1. (MenuArray)Crear un programa que mediante un menú permita:
    - Crear un array de números enteros con n posiciones pedidas.
    - Rellenar el array creado con números aleatorios.
    - Rellenar el array creado con números pedidos por consola.
    - Ordenar el array de mayor a menor
    - Clonar el array con una una mayor longitud. Para ello pedir al usuario la nueva longitud (si esta es inferior a la que la existe continuar pidiendo)
    - Mover todas las posiciones (pedir al usuario que seleccione la orientación)
    - Mostrar por pantalla el array según está*/


        Scanner lectorTeclado = new Scanner(System.in);
        int[] numeros = null; // Array inicializado como null
        boolean salir = false;

        while (!salir) {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Crear un array de números enteros con n posiciones");
            System.out.println("2. Rellenar el array con números aleatorios");
            System.out.println("3. Rellenar el array con números pedidos por consola");
            System.out.println("4. Ordenar el array de mayor a menor");
            System.out.println("5. Clonar el array con una mayor longitud");
            System.out.println("6. Mover todas las posiciones (derecha o izquierda)");
            System.out.println("7. Mostrar el array");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = lectorTeclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el tamaño del array: ");
                    int tamano = lectorTeclado.nextInt();
                    numeros = new int[tamano];
                    System.out.println("Array de " + tamano + " posiciones creado.");
                    break;

                case 2:
                    if (numeros != null) {
                        for (int i = 0; i < numeros.length; i++) {
                            numeros[i] = (int) (Math.random() * 100); // Números aleatorios entre 0 y 99
                        }
                        System.out.println("Array rellenado con números aleatorios.");
                    } else {
                        System.out.println("Primero debes crear el array (opción 1).");
                    }
                    break;

                case 3:
                    if (numeros != null) {
                        for (int i = 0; i < numeros.length; i++) {
                            System.out.print("Introduce el número para la posición " + i + ": ");
                            numeros[i] = lectorTeclado.nextInt();
                        }
                        System.out.println("Array rellenado con números introducidos por el usuario.");
                    } else {
                        System.out.println("Primero debes crear el array (opción 1).");
                    }
                    break;

                case 4:
                    if (numeros != null) {
                        ordenarMayorMenor(numeros);
                        System.out.println("Array ordenado de mayor a menor.");
                    } else {
                        System.out.println("Primero debes crear el array (opción 1).");
                    }
                    break;

                case 5:
                    if (numeros != null) {
                        int nuevaLongitud;
                        do {
                            System.out.print("Introduce la nueva longitud del array (debe ser mayor que " + numeros.length + "): ");
                            nuevaLongitud = lectorTeclado.nextInt();
                        } while (nuevaLongitud <= numeros.length);

                        numeros = clonarArrayConNuevaLongitud(numeros, nuevaLongitud);
                        System.out.println("Array clonado con nueva longitud de " + nuevaLongitud + " posiciones.");
                    } else {
                        System.out.println("Primero debes crear el array (opción 1).");
                    }
                    break;

                case 6:
                    if (numeros != null) {
                        System.out.print("Introduce la dirección para mover (izquierda/derecha): ");
                        String direccion = lectorTeclado.next().toLowerCase();

                        if (direccion.equals("izquierda")) {
                            moverIzquierda(numeros);
                            System.out.println("Array movido una posición a la izquierda.");
                        } else if (direccion.equals("derecha")) {
                            moverDerecha(numeros);
                            System.out.println("Array movido una posición a la derecha.");
                        } else {
                            System.out.println("Dirección no válida. Debes introducir 'izquierda' o 'derecha'.");
                        }
                    } else {
                        System.out.println("Primero debes crear el array (opción 1).");
                    }
                    break;

                case 7:
                    if (numeros != null) {
                        mostrarArray(numeros);
                    } else {
                        System.out.println("Primero debes crear el array (opción 1).");
                    }
                    break;

                case 0:
                    salir = true;
                    System.out.println("Saliendo del programa.");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }

        lectorTeclado.close();
    }

    // Función para ordenar el array de mayor a menor
    public static void ordenarMayorMenor(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    // Función para clonar el array con una nueva longitud
    public static int[] clonarArrayConNuevaLongitud(int[] array, int nuevaLongitud) {
        int[] nuevoArray = new int[nuevaLongitud];
        for (int i = 0; i < array.length; i++) {
            nuevoArray[i] = array[i];
        }
        return nuevoArray;
    }

    // Función para mover el array una posición a la izquierda
    public static void moverIzquierda(int[] array) {
        int primero = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = primero;
    }

    // Función para mover el array una posición a la derecha
    public static void moverDerecha(int[] array) {
        int ultimo = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = ultimo;
    }

    // Función para mostrar el contenido del array
    public static void mostrarArray(int[] array) {
        System.out.print("Contenido del array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}