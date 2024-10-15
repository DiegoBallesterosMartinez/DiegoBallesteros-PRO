import java.util.Random;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        /*Simúlese el lanzamiento de un dado. Se introducirá el número de veces que se lanza el dado
        (de no ser positivo, se establecerá a 100). (Dado)*/

        Scanner lectorTeclado = new Scanner(System.in);
        Random random = new Random();

        // Pedir el número de veces que se lanzará el dado
        System.out.print("Ingresa el número de veces que quieres lanzar el dado: ");
        int lanzamientos = lectorTeclado.nextInt();

        // Pedir el numero de veces que se tiran los dados
        System.out.println("Cuantas veces quieres tirar el dado?");
        // Si el número de lanzamientos no es positivo, establecer a 100
        if (lanzamientos <= 0) {
            System.out.println("No se pueden tirar vecs negativas");
            lanzamientos = 100;
        }

        // Simular lanzamientos de dado
        System.out.println("Simulando " + lanzamientos + " lanzamientos de dado:");
        for (int i = 0; i < lanzamientos; i++) {
            // Generar un número aleatorio entre 1 y 6
            int resultado = (int)(Math.random()*6)+1;
            System.out.println("La tirada numero " + (i + 1) + ": " + resultado);
        }

    }
}
