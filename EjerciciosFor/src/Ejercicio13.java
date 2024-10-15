import java.util.Locale;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {

        /*Pedir una palabra por teclado y mostrar su contraria. Por ejemplo se introducirá
        la palabra programacion y se mostrará por consola la palara noicamargorp (InversaPalabra)*/

        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("escribe algo que quieras invertir");

        /* ejemplos de booleanos y sacar letras


          String palabra1 = "Hola que tal";
          String palabra2 = "HolA qUe Tal";

          // Son iguales
        boolean iguales = palabra1.equals(palabra2);
        boolean igualesCAP = palabra1.equalsIgnoreCase(palabra2);
        // Pasar mayusculas a minusculas
        palabra1 = palabra1.toLowerCase();
        System.out.println(palabra1);
        // contiene parte de otra palabra?
        boolean contiene = palabra1.contains("que");
        //cuantas letras hay?
        palabra1.length();
        // Sacar una letra de una palabra
        palabra1.charAt(0);
        // Sacara todas las letras de una palabra


        int ordenLetras = 0;
        System.out.println();


        for (int i = 0; i < palabra1.length(); i++) {
            char letra = palabra1.charAt(i);

            System.out.println(letra);
        }   */

        String palabra = lectorTeclado.nextLine();
        //invertir palabra
        for (int i = palabra.length() -1; i>=0; i--) {
            System.out.print(palabra.charAt(i));

        }


    }
}
