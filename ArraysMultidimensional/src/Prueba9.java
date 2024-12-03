import java.util.Scanner;

class Prueba9 {
    public static void main(String[] args) {
        Scanner lectorTeclado = new Scanner(System.in);

        int[] array = null;
        int opcion;
        int temporal;

        do {
            System.out.println("1. Crear array");
            System.out.println("2. Rellenar eel array con numeros aleatorios");
            System.out.println("3. Rellenar el array con numeros dados");
            System.out.println("4. Ordenar el array de mayor a menor");
            System.out.println("5. Clonar array con nueva longitud");
            System.out.println("6. Mover numeors a la izquierda");
            System.out.println("7. Mover numeros a la derecha");
            System.out.println("8. Mostrar array en pantalla");
            System.out.println("0. Salir");

            opcion = lectorTeclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Dime una longitud entera para el array\n");
                    int longitud = lectorTeclado.nextInt();

                    if (longitud > 0) {
                        array = new int[longitud];
                        System.out.println("Array creado con exito\n");
                    } else {
                        System.out.println("El numero introducido no puede ser menor de 1\n");
                    }
                    break;
                case 2:
                    System.out.println("Numeros aleatorios introducidos con éxito\n");
                    for (int i = 0; i < array.length; i++) {
                        array[i] = (int) (Math.random() * 100);
                    }
                    break;
                case 3:
                    System.out.println("Por favor, introduzca los datos pedidos\n");
                    for (int i = 0; i < array.length; i++) {
                        System.out.println("Introduce el numero " + i + ":");
                        array[i] = lectorTeclado.nextInt();
                    }
                    System.out.println("Datos introducidos con exito\n");
                    break;
                case 4:
                    System.out.println("El array ha sido ordenado de mayor a menor\n");
                    for (int i = 0; i < array.length - 1; i++) {
                        for (int j = i + 1; j < array.length; j++) {
                            if (array[i] < array[j]) {
                                int temp = array[i];
                                array[i] = array[j];
                                array[j] = temp;
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.println("Introduzca la nueva longitud del array\n");
                    int nuevaLongitud = lectorTeclado.nextInt();

                    if (nuevaLongitud > array.length) {
                        int[] nuevoArray = new int[nuevaLongitud];
                        for (int i = 0; i < array.length; i++) {
                            for (int j = 0; j < array.length; j++) {
                                nuevoArray[i] = array[i];
                            }
                        }
                        array = nuevoArray;
                    } else {
                        System.out.println("La longitud no puede ser menor a la del array original\n");
                    }
                    break;
                case 6:
                    if (array != null) {
                        System.out.println("Los numeros se han desplazado a la izquierda\n");
                        temporal = array[0];
                        for (int i = 0; i < array.length - 1; i++) {
                            array[i] = array[i + 1];
                        }
                        array[array.length - 1] = temporal;
                    } else {
                        System.out.println("No se puede mover, array nulo\n");
                    }
                    break;
                case 7:
                    if (array!=null) {
                        System.out.println("Los numeros se han desplazado a la derecha\n");
                        temporal = array[array.length - 1];
                        for (int i = 0; i < array.length - 1; i--) {
                            array[i] = array[i - 1];
                        }
                        array[0] = temporal;
                    } else {
                        System.out.println("El array no se puedde mover, array nulo\n");
                    }
                    break;
                case 8:
                    System.out.println("Imprimiendo array:\n");
                    for (int item : array) {
                        System.out.println(item);
                    }
                    System.out.println("");
                    break;
                default:
                    System.out.println("Saliendo del programa...\n");
            }
        } while (opcion != 0);
    }
}
