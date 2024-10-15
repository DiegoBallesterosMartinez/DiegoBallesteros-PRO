import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        /*Mostrar todos los números pares comprendidos entre dos dados. (ParesEntreDosDados)*/

        Scanner lectorTeclado = new Scanner(System.in);

        // Pedir dos números
        System.out.print("Ingresa el primer número: ");
        int num1 = lectorTeclado.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int num2 = lectorTeclado.nextInt();

        // Asegurar que num1 es menor que num2, intercambiarlos si es necesario
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.println("Números pares entre " + num1 + " y " + num2 + ":");

        // Recorrer los números entre num1 y num2 (exclusivo) para encontrar los pares
        for (int i = num1 + 1; i < num2; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}
