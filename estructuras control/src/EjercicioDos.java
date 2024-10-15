import java.util.Scanner;

public class EjercicioDos {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Leer un número entero por teclado y almacenarlo en la variable "a"
        System.out.println("Introduce un número entero: ");
        int a = sc.nextInt();

        // Comprobar si "a" es par o cumple con las otras condiciones
        if (a % 2 == 0) {
            // Si "a" es par, incrementa "a" en 1
            a += 1;  // o a = a + 1;
        } else if (a < 10) {
            // Si "a" es menor que 10, decrementa "a" en 1
            a -= 1;  // o a = a - 1;
        } else if (a < 100) {
            // Si "a" es menor que 100, duplica "a" y luego incrementa en 1
            a = (a * 2) + 1;  // o a = a * 2 + 1;
        } else {
            // Si "a" no cumple ninguna de las condiciones anteriores, asigna 0 a "a"
            a = 0;
        }

        // Mostrar el valor final de "a"
        System.out.println("El valor final de a es: " + a);
    }
}
