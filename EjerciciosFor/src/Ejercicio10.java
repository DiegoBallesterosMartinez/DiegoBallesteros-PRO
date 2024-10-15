import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        /*Introduce  6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.(NotasTipos)*/

        Scanner lectorTeclado = new Scanner(System.in);

        int aprobados = 0;
        int condicionados = 0;
        int suspensos = 0;

        // Pedir 6 notas
        System.out.println("Ingresa 6 notas:");
        for (int i = 0; i < 6; i++) {
            int nota = lectorTeclado.nextInt();

            // Clasificar la nota
            if (nota >= 5) {
                aprobados++;
            } else if (nota == 4) {
                condicionados++;
            } else if (nota < 4) {
                suspensos++;
            } else if (nota > 10 || nota < 0) {
                System.out.println("Nota invalida");
            }


            // Mostrar resultados
            System.out.println("Cantidad de alumnos aprobados: " + aprobados);
            System.out.println("Cantidad de alumnos condicionados (nota = 4): " + condicionados);
            System.out.println("Cantidad de alumnos suspensos: " + suspensos);

        }
    }
}
