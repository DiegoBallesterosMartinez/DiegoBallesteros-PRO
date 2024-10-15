import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        /*Dado dos enteros entre 0 y 5 (la base y el exponente), obtener la potencia del primero elevado al segundo sin utilizar el método “pow”.
        Por ejemplo, base = 3 y exponente = 5, 35=3x3x3x3x3=243. Casos particulares: 00 = Error y n0 = 1.(BaseExponente)*/

        Scanner lectorTeclado = new Scanner(System.in);

        // Pedir base y exponente
        System.out.print("Ingresa la base (entre 0 y 5): ");
        int base = lectorTeclado.nextInt();

        System.out.print("Ingresa el exponente (entre 0 y 5): ");
        int exponente = lectorTeclado.nextInt();

        // Manejar el caso de 0^0
        if (base == 0 && exponente == 0) {
            System.out.println("Error: 0^0 no está definido.");
        } else {
            // Inicializamos el resultado en 1, ya que cualquier número elevado a 0 es 1
            int resultado = 1;

            // Calcular base^exponente usando un ciclo for
            for (int i = 0; i < exponente; i++) {
                resultado *= base;
            }

            // Mostrar el resultado
            System.out.println(base + "^" + exponente + " = " + resultado);
        }

    }
}
