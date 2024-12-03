import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner lectorTeclado = new Scanner(System.in);
        int[] array = new int[5];
        int opcion;

        do {
            System.out.println("MENU:");
            System.out.println("1. Registrar posiciones");
            System.out.println("2. Obtener elemento pedidos");
            System.out.println("3. Mostrar array");
            System.out.println("4. Mostrar array ordenado de menor a mayor");
            System.out.println("5. Mover el array a la izquierda");
            System.out.println("6. Mover el array a la derecha");
            System.out.println("0. Salir");
            System.out.println("Elige una opcion:\n");

            opcion = lectorTeclado.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("A continuacion le pediremos los numeros que desea ingresar");
                    for (int i = 0; i < array.length; i++) {
                        System.out.println("Introduzca el numero posicion "+i);
                        int numero = lectorTeclado.nextInt();
                        array[i] = numero;
                    }
                    System.out.println("Numeros rehgistrados con exito\n");
                    break;
                case 2:
                    break;
                case 3:
                    if (array!=null) {
                        System.out.println("Imprimiendo array:");
                        for (int item:array){
                            System.out.println(item);
                        }
                    } else {
                        System.out.println("EL array no puede ser nulo");
                    }
                    break;
                case 4:
                    if(array!=null) {
                        // Mostrar elementos ordenados de menor a mayor
                        System.out.println("Elementos ordenados de menor a mayor:");
                        for (int i = 0; i < array.length - 1; i++) {
                            for (int j = i + 1; j < array.length; j++) {
                                if (array[i] > array[j]) {
                                    int temp = array[i];
                                    array[i] = array[j];
                                    array[j] = temp;
                                }
                            }
                        }
                    } else {
                        System.out.println("El array no puede ser nulo");
                    }
                    break;
                case 5:
                    if (array != null) {
                        System.out.println("Los numeros se han desplazado a la izquierda\n");
                        int temporal = array[0];
                        for (int i = 0; i < array.length - 1; i++) {
                            array[i] = array[i + 1];
                        }
                        array[array.length - 1] = temporal;
                        for (int item:array){
                            System.out.println(item);
                        }
                    } else {
                        System.out.println("El array no puede ser nulo");
                    }
                    break;
                case 6:
                    if (array!=null) {
                        System.out.println("Los numeros se han desplazado a la derecha\n");
                        int temporal = array[array.length - 1];
                        for (int i = 0; i < array.length - 1; i--) {
                            array[i] = array[i - 1];
                        }
                        array[0] = temporal;
                        for (int item:array){
                            System.out.println(item);
                        }
                    } else {
                        System.out.println("El array no se puedde mover, array nulo\n");
                    }
                    break;
                default:
                    System.out.println("Saliendo del programa...");
            }
        } while (opcion != 0);

    }
}
