import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer los datos ingresados por el usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar el precio del coche
        System.out.print("Ingresa el precio del coche: ");
        double precioCoche = scanner.nextDouble();

        // Solicitar en cuántos plazos se va a pagar
        System.out.print("Ingresa la cantidad de plazos (meses): ");
        int plazos = scanner.nextInt();

        // Calcular la cantidad a pagar por cada plazo (sin intereses)
        double pagoPorPlazo = precioCoche / plazos;

        // Imprimir el mensaje con el formato solicitado
        System.out.printf("Vas a pagar el coche de %.0f€ en %d meses, con un total de %.0f€ cada plazo (sin tener en cuenta los intereses).%n",
                precioCoche, plazos, pagoPorPlazo);
    }
}
