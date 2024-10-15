import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {

        Scanner lectorTeclado = new Scanner(System.in);

        System.out.println("escribe la palabra que quieras comprobar si es capicua");
        String palabra = lectorTeclado.nextLine();
        // No se tienen en cuenta mayusculas ni acentos
        palabra.toLowerCase().replaceAll("ó","o")
                .replaceAll("á","a")
                .replaceAll("í","i")
                .replaceAll("ú","u")
                .replaceAll("é","e");

        String palabrainvertida = "";

        for (int i = palabra.length() -1; i>=0; i--) {
            palabrainvertida+=palabra.charAt(i);
        }
        if (palabra.equals(palabrainvertida)) {
            System.out.println("es palindromo");
        } else {
            System.out.println("No es palindromo");
        }

        /* Ejercicio de un For palindromo mas efectivo con menos operaciones:

         for (int i = 0; i<palabra.lenght/2 ; i--) {
            palabrainvertida+=palabra.charAt(palabra.lenght-i-i);
            
        }*/
    }
}
