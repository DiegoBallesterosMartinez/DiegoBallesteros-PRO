import java.util.Scanner;

public class EjercicioUno {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Leer un número entero por teclado y almacenarlo en la variable "a"
        System.out.println("Introduce un número entero: ");
        int a = sc.nextInt();

        // Comprobar si "a" es par o impar
        if (a % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
    }
}
