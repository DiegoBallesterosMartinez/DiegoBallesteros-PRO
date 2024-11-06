import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner lectorTeclado = new Scanner(System.in);

        System.out.println("Introduce el primer numero");
        int operando1 = lectorTeclado.nextInt();
        System.out.println("Introduce el segundo numero");
        int operando2 = lectorTeclado.nextInt();

        if (operando1 >= 0 && operando2 >= 0) {
            int opcion;
            do {
                System.out.println("\n1. Suma");
                System.out.println("2. Resta");
                System.out.println("3. Multiplicacion");
                System.out.println("4. Divison");
                System.out.println("5. Salir");
                System.out.println("Elige una opcion:");

                opcion = lectorTeclado.nextInt();

                switch (opcion) {
                    case 1:
                        int suma = operando1+operando2;
                        System.out.println("La suma de ambos es: " + suma);
                        break;
                    case 2:
                        int resta = operando1 - operando2;
                        System.out.println("La resta de ambos es: " + resta);
                        break;
                    case 3:
                        int multiplicacion = operando1 * operando2;
                        System.out.println("La multiplicacion de ambos es: " + multiplicacion);
                        break;
                    case 4:
                        double division = operando1 / operando2;
                        System.out.println("La division de ambos es: "+division);
                        break;
                    case 5:
                        System.out.println("Saliendo del programa......");
                        return;


                    default:
                        System.out.println("ha ocurrido un error, intente de nuevo");

                }

            } while (operando1 > 0 || operando2 > 0);
        } else {
            System.out.println("No se pueden realizar operaciones sobre numeros negativos");
        }
    }
}

