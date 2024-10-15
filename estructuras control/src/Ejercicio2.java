import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        // anadir Scanner llamado lectorTeclado
        Scanner lectorTeclado = new Scanner(System.in);
        // pedir los 3 numeros por consola
        System.out.println("Escribe un número entero");
        int num1 = lectorTeclado.nextInt();System.out.println("Escribe un número entero");
        int num2 = lectorTeclado.nextInt();
        System.out.println("Escribe un número entero");
        int num3 = lectorTeclado.nextInt();

        if (num1 == num2 + num3) {
            System.out.println(num1 + " = " + num2 + " + " + num3);
        } else if (num2 == num1 + num3) {
            System.out.println(num2 + " = " + num1 + " + " + num3);
        } else if (num3 == num1 + num2) {
            System.out.println(num3 + " = " + num1 + " + " + num2);
        } else {
            System.out.println("Ninguno es suma de los otros dos.");
        }


    }
}
