import java.util.Scanner;

public class EjercicioUno {

    // Metodo main
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer los datos ingresados por el usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir los datos por consola
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresa tu apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        // Se utiliza un scanner.nextLine() para limpiar el buffer antes de seguir con la entrada de altura
        scanner.nextLine();  // Limpiar buffer

        System.out.print("Ingresa tu altura en centimetros (por ejemplo, 1.74): ");
        double altura = scanner.nextDouble();

        System.out.print("Ingresa tu peso en kg: ");
        double peso = scanner.nextDouble();

        // Se utiliza otro scanner.nextLine() para limpiar el buffer antes de leer el sexo
        scanner.nextLine();  // Limpiar buffer

        System.out.print("Ingresa tu sexo (M/F): ");
        char sexo = scanner.next().charAt(0);

        // Calcular el IMC llamando al metodo calculoIMC
        double IMC = calculoIMC(peso, altura);

        // Imprimir el mensaje con el formato solicitado
        System.out.printf("Hola %s %s, tu IMC teniendo en cuenta tu altura de %.0f cm y tu peso de %.0f kg, tiene un valor de %.2f.%n",
                nombre, apellido, altura * 100, peso, IMC);
    }

    // Metodo para calcular el IMC
    public static double calculoIMC(double peso, double altura) {
        return peso / (altura * altura);
    }
}


