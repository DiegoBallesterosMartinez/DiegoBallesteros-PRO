import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {

        Scanner lectorTeclado = new Scanner(System.in);

        System.out.println("escribe la palabra que quieras comprobar si es capicua");
        String palabra = lectorTeclado.nextLine();
        // No se tienen en cuenta mayusculas ni acentos
        palabra.toLowerCase().replaceAll("ó", "o")
                .replaceAll("á", "a")
                .replaceAll("í", "i")
                .replaceAll("ú", "u")
                .replaceAll("é", "e");

        String palabrainvertida = "";

        for (int i = palabra.length() - 1; i >= 0; i--) {
            palabrainvertida += palabra.charAt(i);
        }
        if (palabra.equals(palabrainvertida)) {
            System.out.println("es palindromo");
        } else {
            System.out.println("No es palindromo");
        }

        /* Ejercicio de un For palindromo mas efectivo con menos operaciones:

         booleas palindromo = true;
         for (int i = 0; i<palabra.lenght/2 ; i--) {
            palabrainvertida+=palabra.charAt(palabra.lenght-i-i); {
            palindromo = false;
            break;
            }
         }

         if (palindromo) {
            System.out.println("La palabra es palindromo: "+palindromo");

            */


        /* numero letras = frase.lenght();
        * nummero de letras sin espacios ni puntos
        * int numeroLetrasSinCosas = frase.replaceAll(" ",".")
        * numero de palabras
        * numero de oraciones
        * int numero oraciones = 0
        * for (int i = 0, i <frase.lenght(); i++) {
        *     if (frase.charAt(i)=='.') {
        *        numero oraciones++;
        *     }
        *     if (frase.charAt(i) == ' ') {
        *       numeroPalabras++
        *     }
        * */
    }
}
