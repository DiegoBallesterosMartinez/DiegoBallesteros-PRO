import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        /*Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos y la cantidad de ceros (NumerosTipos)*/

        Scanner lectorTeclado= new Scanner(System.in);

        int sumaPositivos = 0;
        int cuentaPositivos = 0;
        int sumaNegativos = 0;
        int cuentaNegativos = 0;
        int cuentaCeros = 0;

        // Pedir 10 números
        System.out.println("Introduce 10 numeros:");
        for (int i = 0; i < 10; i++) {
            int num = lectorTeclado.nextInt();

            // Para acumular escribir ++;
            if (num > 0) {
                sumaPositivos += num;
                cuentaPositivos++;
            } else if (num < 0) {
                sumaNegativos += num;
                cuentaNegativos++;
            } else {
                cuentaCeros++;
            }
        }

        // Calcular la media de los números positivos
        double mediaPositivos = ((double) sumaPositivos / cuentaPositivos);
        // Calcular la media de los números negativos
        double mediaNegativos = ((double) sumaNegativos / cuentaNegativos);

        // Mostrar resultados
        System.out.println("Media de los numeros positivos: " + mediaPositivos);
        System.out.println("Media de los numeros negativos: " + mediaNegativos);
        System.out.println("Cantidad de ceros: " + cuentaCeros);

    }
}
