import java.util.Scanner;

public class EjercicioTres {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Leer un número entero por teclado y almacenarlo en la variable "a"
        System.out.println("Introduce un número entero: ");
        int a = sc.nextInt();

        // Comprobar los diferentes casos
        if (a < 10) {
            // Caso: Menor que 10
            if (a < 0) {
                System.out.println("Negativo");
            } else {
                System.out.println("Un dígito");
            }
        } else if (a < 100) {
            // Caso: Entre 10 y 99
            System.out.println("Dos dígitos");
        } else {
            // Caso: Mayor o igual a 100
            System.out.println("Tres dígitos o más");
        }
    }
}
