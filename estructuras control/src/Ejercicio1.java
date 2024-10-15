import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        // agregar Scanner llamado scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un número entero");
        int numero1 = scanner.nextInt();
        System.out.println("Escribe un número");
        int numero2 = scanner.nextInt();

        if (numero1>numero2){
            System.out.println("El primero es mayor que el segundo");
        }
        if (numero2>numero1) {
            System.out.println("El primero es menor que el segundo");
            }
        }
}
