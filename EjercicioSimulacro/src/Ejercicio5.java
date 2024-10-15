import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer datos del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir variables para trabajar con triángulos
        System.out.print("Ingresa la altura del triángulo: ");
        int altura = scanner.nextInt();

        System.out.print("Ingresa el lado 1 del triángulo: ");
        int lado1 = scanner.nextInt();

        System.out.print("Ingresa el lado 2 del triángulo: ");
        int lado2 = scanner.nextInt();

        System.out.print("Ingresa el lado 3 del triángulo: ");
        int lado3 = scanner.nextInt();

        // Calcular el área del triángulo
        double areaTriangulo = calcularAreaTriangulo(lado1, altura);
        System.out.printf("El área del triángulo con base %d y altura %d es %.2f%n", lado1, altura, areaTriangulo);

        // Verificar si el triángulo es isósceles o equilátero
        boolean isIsosceles = (lado1 == lado2 || lado1 == lado3 || lado2 == lado3);
        System.out.printf("El triángulo es isósceles: %b%n", isIsosceles);

        boolean isEquilateral = (lado1 == lado2 && lado2 == lado3);
        System.out.printf("El triángulo es equilátero: %b%n", isEquilateral);

        // Pedir variables para trabajar con círculos
        System.out.print("Ingresa el radio del círculo: ");
        int radio = scanner.nextInt();

        // Calcular el área del círculo
        double areaCirculo = calcularAreaCirculo(radio);
        System.out.printf("El área del círculo es %.3f%n", areaCirculo);
    }

    // Metodo para calcular el área del triángulo
    public static double calcularAreaTriangulo(int base, int altura) {
        return (base * altura) / 2.0;
    }

    // Metodo para calcular el área del círculo
    public static double calcularAreaCirculo(int radio) {
        return Math.PI * (radio*radio);
                        //Math.pow(radio, 2)
    }
}
