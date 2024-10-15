import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        /*Pedir 10 sueldos. Mostrar su suma, media y cuantos hay mayores de 1000€.(Sueldos)*/

        Scanner lectorTeclado = new Scanner(System.in);

        double sumaSueldos = 0;
        int sueldosMayoresMil = 0;

        // Pedir 10 sueldos
        System.out.println("Ingresa 10 sueldos:");
        for (int i = 0; i < 10; i++) {
            double sueldo = lectorTeclado.nextDouble();

            // Sumar el sueldo al total
            sumaSueldos += sueldo;

            // Contar cuántos sueldos son mayores de 1000€
            if (sueldo > 1000) {
                sueldosMayoresMil++;
            }
        }

        // Calcular la media de los sueldos
        double mediaSueldos = sumaSueldos / 10;

        // Mostrar resultados
        System.out.println("Suma de los sueldos: " + sumaSueldos + "€");
        System.out.println("Media de los sueldos: " + mediaSueldos + "€");
        System.out.println("Cantidad de sueldos mayores de 1000€: " + sueldosMayoresMil);

    }
}

