import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        /*1. (GeneradorPalabras) Crea un programa que cumpla los siguientes requisitos:
    - Crear un de chars con todas las letras del abecedario.
    - Crear un array de String con una longitud pedida por teclado
    - Pedir la longitud de cada una de las palabras que formarán parte del array del apartado 2. Tras pedir la longitud se creará una palabra de forma aleatoria con la longitud deseada (cada letra será una posición del array del apartado 1) y se guardará en el array del apartado 2
    - Imprimir por pantalla las palabras generadas*/

        Scanner scanner = new Scanner(System.in);

        // Crear un array de caracteres con todas las letras del abecedario
        char[] abecedario = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        // Pedir la cantidad de palabras a generar
        System.out.print("Introduce la cantidad de palabras a generar: ");
        int numPalabras = scanner.nextInt();

        // Crear un array de String con la longitud especificada
        String[] palabras = new String[numPalabras];

        // Generar cada palabra con una longitud especificada por el usuario
        for (int i = 0; i < numPalabras; i++) {
            System.out.print("Introduce la longitud de la palabra " + (i + 1) + ": ");
            int longitudPalabra = scanner.nextInt();

            // Generar una palabra aleatoria con la longitud especificada
            StringBuilder palabraGenerada = new StringBuilder();
            for (int j = 0; j < longitudPalabra; j++) {
                int indiceAleatorio = (int) (Math.random() * abecedario.length);
                palabraGenerada.append(abecedario[indiceAleatorio]);
            }

            // Guardar la palabra generada en el array de palabras
            palabras[i] = palabraGenerada.toString();
        }

        // Imprimir las palabras generadas
        System.out.println("\nPalabras generadas:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }

        scanner.close();
    }
}



