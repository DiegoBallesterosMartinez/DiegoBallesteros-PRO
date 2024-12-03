import java.util.Scanner;

public class Ejercicio9Borja {
    public static void main(String[] args) {

        Scanner lectorTeclado = new Scanner(System.in);

        int[] array = null;
        int opcion;

        do {
            System.out.println("Menu:");
            System.out.println("1. Crear array con n posiciones");
            System.out.println("2. Rellenar el array con numeros aleatorios");
            System.out.println("3. Rellenar el array con numeros pedidos");
            System.out.println("4. Ordenar el array de mayor a menor");
            System.out.println("5. Clonar el array con una mayor longitud");
            System.out.println("6. Mover a la izquierda");
            System.out.println("7. Mover a la derecha");
            System.out.println("8. Mostrar el array");
            System.out.println("0. Salir");

            opcion = lectorTeclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Dime cuantos numeros quieres que tenga el array");
                    int tamano = lectorTeclado.nextInt();
                    array = new int[tamano];
                    System.out.println("El tamaño del array es " + tamano);
                    System.out.println();
                    break;
                case 2:
                    for (int i = 0; i < array.length; i++) {
                        array[i] = (int) (Math.random() * 100);
                    }
                    System.out.println("Numeros aleatorios asignados\n");
                    break;
                case 3:
                    for (int i = 0; i < array.length; i++) {
                        System.out.println("dime el numero " + (i + 1) + " que quieres añadir");
                        array[i] = lectorTeclado.nextInt();
                    }
                    System.out.println("Añadidos correctamente\n");
                    break;
                case 4:
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
                    System.out.println("Introduce nueva longitud");
                    int longitud = lectorTeclado.nextInt();

                    if (longitud > array.length) {
                        int[] nuevoArray = new int[longitud];
                        for (int i = 0; i < array.length; i++) {
                            nuevoArray[i] = array[i];
                        }
                        array = nuevoArray;
                    } else {
                        System.out.println("La longitud no puede ser menor que la del array");
                    }
                    break;
                case 6:
                    if (array!=null){

                        System.out.println("Vas a rotar a la izq");
                        int temporal = array[0];
                        for (int i = 0; i < array.length-1; i++) {
                            array[i] = array[i+1];
                        }
                        array[array.length-1]=temporal;

                    } else {
                        System.out.println("No se puede rotar");
                    }
                    break;
                case 7:
                    if (array!=null){
                        int temporal = array[array.length-1];
                        for (int i = array.length-1; i >0 ; i--) {
                            array[i] = array[i-1];
                        }
                        array[0] = temporal;
                    } else {
                        System.out.println("No se puede mover, array nulo");
                    }
                    break;
                case 8:
                    System.out.println("Imprimiendo Array:");
                    // for (int i = 0; i < array.length; i++) {
                    // System.out.println(array[i]);
                    //}

                    for (int item : array) {
                        System.out.println(item);
                    }

                    break;
                case 0:
                    break;


                default:
                    System.out.println("Saliendo del programa...");
                    break;
            }
        } while (opcion != 0);


    }
}
