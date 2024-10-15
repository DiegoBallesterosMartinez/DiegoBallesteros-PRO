import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {

        /* Dibujar por consola un Cuadrado de + . Para ello se pedirá por consola el tamaño del lado y
          se imprimirá el cuadrado con el siguiente formato (CuadradoFor) */

        Scanner lectorTeclado = new Scanner(System.in);

        // Pedir el tamaño del lado
        System.out.print("Ingresa el tamaño del lado del cuadrado: ");
        int lado = lectorTeclado.nextInt();

        // Dibujar el cuadrado
        // Println hace columnas con salto de linea
        // Print hace linea horizonttal sin salto de linea
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                // Primera fila o ultima
                if (i == 0 || i == lado - 1) {
                    System.out.print("+  ");
                    // Primera columna o ultima
                    } else if (j == 0 || j == lado - 1) {
                    System.out.print("+  ");
                }
                // println para nueva linea depues de cada fila
                System.out.println();
            }
        }
    }
}
