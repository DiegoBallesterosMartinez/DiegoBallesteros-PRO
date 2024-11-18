import java.util.Scanner;

public class EjercicioArray {
    public static void main(String[] args) {

        //Ejercicio1();
        //Ejercicio2();
        //Ejercicio3();
        //Ejercicio4();
        //Ejercicio5();
        //Ejercicio6();
        Ejercicio7();

    }

    public static void Ejercicio1() {
        // Realiza un programa que pida 10 números por teclado y que los almacene en un array.
        // A continuación se mostrará el contenido de ese array junto al índice (0 – 9).

        Scanner lectorTeclado = new Scanner(System.in);

        // declarar array
        int[] numeros = new int[10];

        // pedir numeros
        for (int i = 0; i < 10; i++) {
            System.out.println("Escribe un numero entero:");
            numeros[i] = lectorTeclado.nextInt();  // Guardar el número en el array
        }

        // imprimir numeros con indice:
        System.out.println("Contenido del array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice " + i + ": " + numeros[i]);
        }

    }

    public static void Ejercicio2() {

        //Crear un programa que genere 30 números aleatorios entre 0 - 10 y los guarde en un array.
        //Una vez metidos, se deberá mostrar:
        //Numero de puntos obtenidos
        //Media de puntos obtenidos

        int[] numeros = new int[30];
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 11);
            // sumatorio numeros
            suma += numeros[i];
        }

        System.out.println("La suma de todos los numeros es: " + suma);
        double media = (double) suma / numeros.length;
        System.out.println("La media de todos los numeros es: " + media);

    }

    public static void Ejercicio3() {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        // Leer 10 números y guardarlos en el array
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce un número: ");
            numeros[i] = scanner.nextInt();
        }

        // Mostrar en orden normal
        System.out.println("\nNúmeros en orden normal:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        // Mostrar en orden inverso
        System.out.println("\n\nNúmeros en orden inverso:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");

        }
    }

    public static void Ejercicio4() {
        int[] numero = new int[20];
        int[] cuadrado = new int[numero.length];
        int[] cubo = new int[numero.length];
        int random = (int) Math.random() * 101;

        // Rellenar el array `numero` con valores aleatorios entre 0 y 100
        for (int i = 0; i < 20; i++) {
            numero[i] = random;  // Genera números entre 0 y 100
            cuadrado[i] = numero[i] * numero[i]; // Calcula el cuadrado
            cubo[i] = numero[i] * numero[i] * numero[i]; // Calcula el cubo
        }

        // Mostrar el contenido de los tres arrays en tres columnas
        System.out.printf("%-10s %-10s %-10s%n", "Número", "Cuadrado", "Cubo");
        for (int i = 0; i < 20; i++) {
            System.out.printf("%-10d %-10d %-10d%n", numero[i], cuadrado[i], cubo[i]);
        }
    }

    public static void Ejercicio5() {
        int[] numeros = new int[8];
        Scanner lectorTeclado = new Scanner(System.in);

        // Leer 8 números y guardarlos en el array
        System.out.println("Introduce 8 números enteros:");
        for (int i = 0; i < 8; i++) {
            numeros[i] = lectorTeclado.nextInt();
        }

        // Mostrar cada número junto con "par" o "impar"
        for (int i = 0; i < 8; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i] + " par");
            } else {
                System.out.println(numeros[i] + " impar");
            }
        }
    }

    public static void Ejercicio6() {
        int[] numeros = new int[20];
        int modificaciones = 0;

        // Llenar el array con números aleatorios entre 0 y 30
        for (int i = 0; i < numeros.length; i++) {
            int random = (int) (Math.random() * 31);
            numeros[i] = random; // 31 para incluir el 30
        }

        // Mostrar el array original
        System.out.println("Array original:");
        for (int item : numeros) {
            System.out.print(item + " ");
        }
        System.out.println("\n");

        // Realizar y contar las modificaciones
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 6) {
                numeros[i] = 8;
                modificaciones++;
            } else if (numeros[i] == 7) {
                numeros[i] = 15;
                modificaciones++;
            } else if (numeros[i] == 20) {
                numeros[i] = 10;
                modificaciones++;
            }
        }

        // Mostrar el array modificado
        System.out.println("Array modificado:");
        for (int item : numeros) {
            System.out.print(item + " ");
        }

        // Mostrar el total de modificaciones
        System.out.println("\n\nModificaciones realizadas: " + modificaciones);
    }

    public static void Ejercicio7() {
        Scanner scanner = new Scanner(System.in);
        String[] palabras = new String[10];
        int random = (int) Math.random();

        // Pedir 10 palabras y guardarlas en el array
        System.out.println("Introduce 10 palabras:");
        for (int i = 0; i < palabras.length; i++) {
            System.out.print("Palabra " + (i + 1) + ": ");
            palabras[i] = scanner.nextLine();
        }

        boolean salir = false;

        // Mostrar el menú y realizar las opciones elegidas
        while (!salir) {
            System.out.println("\n--- Menú de opciones ---");
            System.out.println("1. Ver todas las palabras");
            System.out.println("2. Obtener una palabra al azar");
            System.out.println("3. Ver número de letras total");
            System.out.println("4. Ver media de letras");
            System.out.println("5. Ver palabra con más letras");
            System.out.println("6. Ver palabra con menos letras");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer de entrada

            switch (opcion) {
                case 1:
                    System.out.println("Todas las palabras:");
                    for (String palabra : palabras) {
                        System.out.println(palabra);
                    }
                    break;

                /*case 2:
                    String palabraAzar = palabras[random.nextInt(palabras.length)];
                    System.out.println("Palabra al azar: " + palabraAzar);
                    break;
                */

                case 3:
                    int totalLetras = 0;
                    for (String palabra : palabras) {
                        totalLetras += palabra.length();
                    }
                    System.out.println("Número total de letras: " + totalLetras);
                    break;

                case 4:
                    int totalLetrasMedia = 0;
                    for (String palabra : palabras) {
                        totalLetrasMedia += palabra.length();
                    }
                    double mediaLetras = (double) totalLetrasMedia / palabras.length;
                    System.out.printf("Media de letras: %.2f%n", mediaLetras);
                    break;

                case 5:
                    String palabraMasLarga = palabras[0];
                    for (String palabra : palabras) {
                        if (palabra.length() > palabraMasLarga.length()) {
                            palabraMasLarga = palabra;
                        }
                    }
                    System.out.println("Palabra con más letras: " + palabraMasLarga);
                    break;

                case 6:
                    String palabraMasCorta = palabras[0];
                    for (String palabra : palabras) {
                        if (palabra.length() < palabraMasCorta.length()) {
                            palabraMasCorta = palabra;
                        }
                    }
                    System.out.println("Palabra con menos letras: " + palabraMasCorta);
                    break;

                case 7:
                    salir = true;
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
        }
    }

}
