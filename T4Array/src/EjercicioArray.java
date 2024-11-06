import java.util.Scanner;

public class EjercicioArray {
    public static void main(String[] args) {

        //Ejercicio1();
        Ejercicio2();

    }

    public static void Ejercicio1() {
        // Realiza un programa que pida 10 números por teclado y que los almacene en un array.
        // A continuación se mostrará el contenido de ese array junto al índice (0 – 9).

        Scanner lectorTeclado = new Scanner(System.in);

        // declarar array
        int[] numeros = new int[10];

        // pedir numeros
        for (int i = 0; i < 10; i++) {
            System.out.println("Escribe un numero entero:");
            numeros[i] = lectorTeclado.nextInt();  // Guardar el número en el array
        }

        // imprimir numeros con indice:
        System.out.println("Contenido del array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice " + i + ": " + numeros[i]);
        }

    }

    public static void Ejercicio2() {

        //Crear un programa que genere 30 números aleatorios entre 0 - 10 y los guarde en un array.
        //Una vez metidos, se deberá mostrar:
        //Numero de puntos obtenidos
        //Media de puntos obtenidos

        int[] numeros = new int[30];
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 11);
            // sumatorio numeros
            suma += numeros[i];
        }

        System.out.println("La suma de todos los numeros es: "+suma);
        double media = (double) suma / numeros.length;
        System.out.println("La media de todos los numeros es: "+media);


    }
}
