import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner lectorTeclado = new Scanner(System.in);

        int[] array = null;

        // Pedir cantidd que se quiere guardar
        System.out.println("Cuantos numeros quieres guardar?");
        int cantidad = lectorTeclado.nextInt();
        if (cantidad > 0) {
            array = new int[cantidad];
        } else {
            System.out.println("La cantidad no puede ser menor a 1");
        }
        // Rellenar con numeros aleatorios
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 21);
        }
        // Mostrar Extremos
        int numeroMax = 0;
        int numeroMin = 21;
        for (int i = 0; i < array.length; i++) {
            if (numeroMax < array[i]) {
                numeroMax = array[i];
            }
        }
        System.out.println("El numero más grande es: " + numeroMax);
        for (int i = 0; i < array.length; i++) {
            if (numeroMin > array[i]) {
                numeroMin = array[i];
            }
        }
        System.out.println("El numero mas pequeño es: " + numeroMin);
        // Mostrar cuantos pares e impares hay
        int pares = 0;
        int impares = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("Numeros pares: " + pares);
        System.out.println("Numeros impares: " + impares);
        // Mostrar repeticiones
        System.out.println("Dime el numero que quieras buscar");
        int buscar = lectorTeclado.nextInt();
        int contador = 0;
        for (int item : array) {
            if (item == buscar) {
                contador++;
            }
        }
        if (contador!=0){
            System.out.println("Numero encontrado "+contador+" veces");
        } else {
            System.out.println("Numero no encontrado");
        }
    }
}


