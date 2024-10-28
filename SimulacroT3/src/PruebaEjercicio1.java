import java.util.Scanner;

public class PruebaEjercicio1 {
    public static void main(String[] args) {
        ejercicio1();
    }

    public static void ejercicio1() {
        Scanner lectorTeclado = new Scanner(System.in);

        // Variables para los cálculos
        int sumaPares = 0;
        int contadorPares = 0;
        int contadorImpares = 0;
        int contadorCeros = 0;
        int contadorIntroducidos = 0;

        while (true) {
            System.out.println("Dime un número (si es negativo se acaba): ");
            int numero = lectorTeclado.nextInt();

            // Salir si el número es negativo
            if (numero < 0) {
                break;
            }

            // Contador total de números introducidos
            contadorIntroducidos++;

            // Contador ceros
            if (numero == 0) {
                contadorCeros++;
            }
            // Contador pares
            else if (numero % 2 == 0) {
                sumaPares += numero;
                contadorPares++;
            }
            // Contador impares
            else {
                contadorImpares++;
            }
        }

        // Crear menú de opciones
        int opcion;
        do {
            System.out.println("\nMenú de Opciones:");
            System.out.println("1. Suma de los números pares introducidos.");
            System.out.println("2. Media de los números pares introducidos con dos decimales.");
            System.out.println("3. Media de los números impares introducidos con dos decimales.");
            System.out.println("4. Cuántos números hemos introducido.");
            System.out.println("5. Cuántos números de los introducidos han sido ceros, cuántos han sido pares y cuántos impares.");
            System.out.println("6. Salir.");
            System.out.print("Selecciona una opción: ");
            opcion = lectorTeclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("La suma de los números pares introducidos es: " + sumaPares);
                    break;
                case 2:
                    if (contadorPares > 0) {
                        double mediaPares = (double) sumaPares / contadorPares;
                        System.out.printf("La media de los números pares introducidos es: %.2f%n", mediaPares); // Imprimir media
                    } else {
                        System.out.println("No se han introducido números pares.");
                    }
                    break;
                case 3:
                    if (contadorImpares > 0) {
                        double mediaImpares = (double) contadorImpares / (contadorIntroducidos - contadorPares - contadorCeros);
                        System.out.printf("La media de los números impares introducidos es: %.2f%n", mediaImpares); // Imprimir media
                    } else {
                        System.out.println("No se han introducido números impares.");
                    }
                    break;
                case 4:
                    System.out.println("Has introducido: " + contadorIntroducidos + " números.");
                    break;
                case 5:
                    System.out.println("Números ceros introducidos: " + contadorCeros);
                    System.out.println("Números pares introducidos: " + contadorPares);
                    System.out.println("Números impares introducidos: " + contadorImpares);
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, vuelva a probar.");
            }
        } while (opcion != 6);

    }
}

