import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        /*2. (MayorArray) Crea una aplicación que realice lo siguiente:
    - pida por pantalla la longitud del array de enteros
    - crea el array de enteros con la longitud introducida
    - pida al usuario que introduzca todos los datos del array
    - saque por pantalla el elemento mayor y el elemento menor*/

        Scanner scanner = new Scanner(System.in);
        int numeros = 0;
        int numeroMayor = 0;
        int numeroMenor = 100;

        // pida por pantalla la longitud del array de enteros
        System.out.println("Dime longitud del array de enteros");
        int longitud = scanner.nextInt();

        // crea el array de enteros con la longitud introducida
        int[] enteros = new int[longitud];

        // pida al usuario que introduzca todos los datos del array
        System.out.println("Introduce "+longitud+" números:");
        for (int i = 0; i < enteros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            enteros[i] = scanner.nextInt();
        }

        //saque por pantalla el elemento mayor y el elemento menor
        for (int i = 0; i < enteros.length; i++) {

            if (numeroMayor<enteros[i]){
                numeroMayor=enteros[i];
            }
            if (numeroMenor>enteros[i]){
                numeroMenor=enteros[i];
            }
        }

        System.out.println("\nNumero mayor: "+numeroMayor);
        System.out.println("\nNumero menor: "+numeroMenor);


    }
}
